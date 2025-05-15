package ru.greenfield.study.grpc.server;

import java.util.Date;

import com.google.protobuf.*;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import ru.greenfield.strudy.grpc.genproto.calendar.MutinyCalendarServiceGrpc;

@GrpcService
public class GrpcCalendar extends MutinyCalendarServiceGrpc.CalendarServiceImplBase {

    @Override
    public Uni<Timestamp> getCurrentDate(Empty request) {
        var millis = new Date().getTime();

        final var r = Timestamp.newBuilder()
                .setSeconds(millis / 1000)
                .setNanos((int) ((millis % 1000) * 1000000))
                .build();

        return Uni.createFrom().item(r);
    }

}
