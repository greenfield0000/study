package org.acme.controller.grpc;

import org.acme.service.grpc.Greeter.*;
import org.acme.service.grpc.GreeterService;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class HelloGrpc implements GreeterService {

    @Override
    public Uni<HelloResponse> sayHello(HelloRequest request) {
        var response = HelloResponse.newBuilder()
                .setHello("Hello from server " + request.getName())
                .build();

        return Uni.createFrom().item(() -> response);
    }

}
