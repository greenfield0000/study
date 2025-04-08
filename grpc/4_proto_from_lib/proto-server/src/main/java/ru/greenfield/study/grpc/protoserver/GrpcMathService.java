package ru.greenfield.study.grpc.protoserver;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import ru.greenfield.study.grpc.protolib.*;

@GrpcService
public class GrpcMathService implements MathService {

    @Override
    public Uni<AddResponse> add(AddRequest request) {
        return Uni.createFrom()
                .item(
                        AddResponse.newBuilder().setRes(
                            request.getA() + request.getB()
                        ).build()
                );
    }

}
