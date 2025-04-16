package streamin_service;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: timer.proto")
public class TimerBean extends MutinyTimerGrpc.TimerImplBase implements BindableService, MutinyBean {

    private final Timer delegate;

    TimerBean(@GrpcService Timer delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Multi<streamin_service.TickResponse> tick(com.google.protobuf.Empty request) {
        try {
            return delegate.tick(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
