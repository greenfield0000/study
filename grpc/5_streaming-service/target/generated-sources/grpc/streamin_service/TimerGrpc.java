package streamin_service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: timer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TimerGrpc {

    private TimerGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "streamin_service.Timer";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty, streamin_service.TickResponse> getTickMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "Tick", requestType = com.google.protobuf.Empty.class, responseType = streamin_service.TickResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Empty, streamin_service.TickResponse> getTickMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Empty, streamin_service.TickResponse> getTickMethod;
        if ((getTickMethod = TimerGrpc.getTickMethod) == null) {
            synchronized (TimerGrpc.class) {
                if ((getTickMethod = TimerGrpc.getTickMethod) == null) {
                    TimerGrpc.getTickMethod = getTickMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Empty, streamin_service.TickResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tick")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(streamin_service.TickResponse.getDefaultInstance())).setSchemaDescriptor(new TimerMethodDescriptorSupplier("Tick")).build();
                }
            }
        }
        return getTickMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static TimerStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TimerStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TimerStub>() {

            @java.lang.Override
            public TimerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TimerStub(channel, callOptions);
            }
        };
        return TimerStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static TimerBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TimerBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TimerBlockingStub>() {

            @java.lang.Override
            public TimerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TimerBlockingStub(channel, callOptions);
            }
        };
        return TimerBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static TimerFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TimerFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<TimerFutureStub>() {

            @java.lang.Override
            public TimerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new TimerFutureStub(channel, callOptions);
            }
        };
        return TimerFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void tick(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<streamin_service.TickResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTickMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Timer.
     */
    public static abstract class TimerImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return TimerGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Timer.
     */
    public static class TimerStub extends io.grpc.stub.AbstractAsyncStub<TimerStub> {

        private TimerStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TimerStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TimerStub(channel, callOptions);
        }

        /**
         */
        public void tick(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<streamin_service.TickResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(getChannel().newCall(getTickMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Timer.
     */
    public static class TimerBlockingStub extends io.grpc.stub.AbstractBlockingStub<TimerBlockingStub> {

        private TimerBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TimerBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TimerBlockingStub(channel, callOptions);
        }

        /**
         */
        public java.util.Iterator<streamin_service.TickResponse> tick(com.google.protobuf.Empty request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(), getTickMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Timer.
     */
    public static class TimerFutureStub extends io.grpc.stub.AbstractFutureStub<TimerFutureStub> {

        private TimerFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TimerFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TimerFutureStub(channel, callOptions);
        }
    }

    private static final int METHODID_TICK = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_TICK:
                    serviceImpl.tick((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<streamin_service.TickResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getTickMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<com.google.protobuf.Empty, streamin_service.TickResponse>(service, METHODID_TICK))).build();
    }

    private static abstract class TimerBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        TimerBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return streamin_service.TimerOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Timer");
        }
    }

    private static final class TimerFileDescriptorSupplier extends TimerBaseDescriptorSupplier {

        TimerFileDescriptorSupplier() {
        }
    }

    private static final class TimerMethodDescriptorSupplier extends TimerBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        TimerMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (TimerGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new TimerFileDescriptorSupplier()).addMethod(getTickMethod()).build();
                }
            }
        }
        return result;
    }
}
