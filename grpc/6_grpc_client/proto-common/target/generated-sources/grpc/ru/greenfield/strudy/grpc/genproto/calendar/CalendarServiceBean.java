package ru.greenfield.strudy.grpc.genproto.calendar;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: calendar.proto")
public class CalendarServiceBean extends MutinyCalendarServiceGrpc.CalendarServiceImplBase implements BindableService, MutinyBean {

    private final CalendarService delegate;

    CalendarServiceBean(@GrpcService CalendarService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request) {
        try {
            return delegate.getCurrentDate(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
