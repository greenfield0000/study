package ru.greenfield.study.grpc.server;

import com.google.protobuf.*;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import ru.greenfield.strudy.grpc.genproto.calendar.MutinyCalendarServiceGrpc.CalendarServiceImplBase;

@GrpcService
public class GrpcCalendar extends CalendarServiceImplBase {

    @Override
    public Uni<Timestamp> getCurrentDate(Empty request) {
        return Uni.createFrom()
            .item(() -> Timestamp.newBuilder().build());
    }
    
}
