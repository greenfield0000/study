package ru.greenfield.study.grpc.client.service;

import java.util.Date;

import jakarta.enterprise.context.ApplicationScoped;

import com.google.protobuf.*;

import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import ru.greenfield.strudy.grpc.genproto.calendar.*;

@ApplicationScoped
public class CommonCalendarService {

    private final CalendarServiceGrpc.CalendarServiceBlockingStub calendar;

    public CommonCalendarService(@GrpcClient CalendarServiceGrpc.CalendarServiceBlockingStub calendar) {
        this.calendar = calendar;
    }

    public Date getCurrentDate() {
        Timestamp res = this.calendar.getCurrentDate(
                Empty.newBuilder().build()
        );

        System.out.println(res);
        return new Date();

    }

}
