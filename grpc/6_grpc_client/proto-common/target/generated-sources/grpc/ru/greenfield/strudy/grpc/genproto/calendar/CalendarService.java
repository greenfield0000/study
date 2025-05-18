package ru.greenfield.strudy.grpc.genproto.calendar;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: calendar.proto")
public interface CalendarService extends MutinyService {

    io.smallrye.mutiny.Uni<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request);
}
