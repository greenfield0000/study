package ru.greenfield.study.grpc.protolib;

import static ru.greenfield.study.grpc.protolib.MathGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: math.proto")
public final class MutinyMathGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMathGrpc() {
    }

    public static MutinyMathStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMathStub(channel);
    }

    public static class MutinyMathStub extends io.grpc.stub.AbstractStub<MutinyMathStub> implements io.quarkus.grpc.MutinyStub {

        private MathGrpc.MathStub delegateStub;

        private MutinyMathStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MathGrpc.newStub(channel);
        }

        private MutinyMathStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MathGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMathStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMathStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::add);
        }
    }

    public static abstract class MathImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MathImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(ru.greenfield.study.grpc.protolib.MathGrpc.getAddMethod(), asyncUnaryCall(new MethodHandlers<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse>(this, METHODID_ADD, compression))).build();
        }
    }

    private static final int METHODID_ADD = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MathImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MathImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_ADD:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((ru.greenfield.study.grpc.protolib.AddRequest) request, (io.grpc.stub.StreamObserver<ru.greenfield.study.grpc.protolib.AddResponse>) responseObserver, compression, serviceImpl::add);
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
