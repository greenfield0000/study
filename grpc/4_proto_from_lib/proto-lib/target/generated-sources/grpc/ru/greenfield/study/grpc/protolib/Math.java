package ru.greenfield.study.grpc.protolib;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: math.proto")
public interface Math extends MutinyService {

    io.smallrye.mutiny.Uni<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request);
}
