package streamin_service;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: timer.proto")
public class TimerClient implements Timer, MutinyClient<MutinyTimerGrpc.MutinyTimerStub> {

    private final MutinyTimerGrpc.MutinyTimerStub stub;

    public TimerClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyTimerGrpc.MutinyTimerStub, MutinyTimerGrpc.MutinyTimerStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyTimerGrpc.newMutinyStub(channel));
    }

    private TimerClient(MutinyTimerGrpc.MutinyTimerStub stub) {
        this.stub = stub;
    }

    public TimerClient newInstanceWithStub(MutinyTimerGrpc.MutinyTimerStub stub) {
        return new TimerClient(stub);
    }

    @Override
    public MutinyTimerGrpc.MutinyTimerStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Multi<streamin_service.TickResponse> tick(com.google.protobuf.Empty request) {
        return stub.tick(request);
    }
}
