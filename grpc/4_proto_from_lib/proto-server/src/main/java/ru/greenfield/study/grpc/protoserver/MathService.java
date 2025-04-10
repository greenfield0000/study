package ru.greenfield.study.grpc.protoserver;

import io.quarkus.arc.Unremovable;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import ru.greenfield.study.grpc.protolib.*;
import ru.greenfield.study.grpc.protolib.Math;

@Unremovable
@GrpcService
public class MathService implements Math {

    @Override
    public Uni<AddResponse> add(AddRequest request) {
        return Uni.createFrom().item(() -> AddResponse.newBuilder().setRes(request.getA() + request.getB()).build());
    }

}
