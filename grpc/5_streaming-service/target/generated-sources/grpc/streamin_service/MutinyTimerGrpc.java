package streamin_service;

import static streamin_service.TimerGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: timer.proto")
public final class MutinyTimerGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyTimerGrpc() {
    }

    public static MutinyTimerStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyTimerStub(channel);
    }

    public static class MutinyTimerStub extends io.grpc.stub.AbstractStub<MutinyTimerStub> implements io.quarkus.grpc.MutinyStub {

        private TimerGrpc.TimerStub delegateStub;

        private MutinyTimerStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = TimerGrpc.newStub(channel);
        }

        private MutinyTimerStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = TimerGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyTimerStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyTimerStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Multi<streamin_service.TickResponse> tick(com.google.protobuf.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::tick);
        }
    }

    public static abstract class TimerImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public TimerImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Multi<streamin_service.TickResponse> tick(com.google.protobuf.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(streamin_service.TimerGrpc.getTickMethod(), asyncServerStreamingCall(new MethodHandlers<com.google.protobuf.Empty, streamin_service.TickResponse>(this, METHODID_TICK, compression))).build();
        }
    }

    private static final int METHODID_TICK = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final TimerImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(TimerImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_TICK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<streamin_service.TickResponse>) responseObserver, compression, serviceImpl::tick);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
