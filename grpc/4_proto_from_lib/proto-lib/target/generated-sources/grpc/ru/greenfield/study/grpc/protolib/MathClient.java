package ru.greenfield.study.grpc.protolib;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: math.proto")
public class MathClient implements Math, MutinyClient<MutinyMathGrpc.MutinyMathStub> {

    private final MutinyMathGrpc.MutinyMathStub stub;

    public MathClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMathGrpc.MutinyMathStub, MutinyMathGrpc.MutinyMathStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMathGrpc.newMutinyStub(channel));
    }

    private MathClient(MutinyMathGrpc.MutinyMathStub stub) {
        this.stub = stub;
    }

    public MathClient newInstanceWithStub(MutinyMathGrpc.MutinyMathStub stub) {
        return new MathClient(stub);
    }

    @Override
    public MutinyMathGrpc.MutinyMathStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request) {
        return stub.add(request);
    }
}
