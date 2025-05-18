package ru.greenfield.strudy.grpc.genproto.calendar;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: calendar.proto")
public class CalendarServiceClient implements CalendarService, MutinyClient<MutinyCalendarServiceGrpc.MutinyCalendarServiceStub> {

    private final MutinyCalendarServiceGrpc.MutinyCalendarServiceStub stub;

    public CalendarServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyCalendarServiceGrpc.MutinyCalendarServiceStub, MutinyCalendarServiceGrpc.MutinyCalendarServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyCalendarServiceGrpc.newMutinyStub(channel));
    }

    private CalendarServiceClient(MutinyCalendarServiceGrpc.MutinyCalendarServiceStub stub) {
        this.stub = stub;
    }

    public CalendarServiceClient newInstanceWithStub(MutinyCalendarServiceGrpc.MutinyCalendarServiceStub stub) {
        return new CalendarServiceClient(stub);
    }

    @Override
    public MutinyCalendarServiceGrpc.MutinyCalendarServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request) {
        return stub.getCurrentDate(request);
    }
}
