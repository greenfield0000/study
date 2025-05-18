package ru.greenfield.study.grpc.client.service;

import java.time.Instant;
import java.util.Date;

import jakarta.enterprise.context.ApplicationScoped;

import com.google.protobuf.*;

import io.quarkus.grpc.*;
import ru.greenfield.strudy.grpc.genproto.calendar.CalendarServiceGrpc;
import ru.greenfield.study.grpc.client.interceptors.JwtTokenClientInterceptor;

@ApplicationScoped
public class CommonCalendarService {

    private final CalendarServiceGrpc.CalendarServiceBlockingStub calendar;

    public CommonCalendarService(@GrpcClient @RegisterClientInterceptor(JwtTokenClientInterceptor.class) CalendarServiceGrpc.CalendarServiceBlockingStub calendar) {
        this.calendar = calendar;
    }

    public Date getCurrentDate() {
        Timestamp timestamp = this.calendar.getCurrentDate(
                Empty.newBuilder().build()
        );

        Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
        return Date.from(instant);
    }

}
