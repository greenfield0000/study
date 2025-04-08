package ru.greenfield.study.grpc.protolib;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: math.proto")
public class MathBean extends MutinyMathGrpc.MathImplBase implements BindableService, MutinyBean {

    private final Math delegate;

    MathBean(@GrpcService Math delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request) {
        try {
            return delegate.add(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
