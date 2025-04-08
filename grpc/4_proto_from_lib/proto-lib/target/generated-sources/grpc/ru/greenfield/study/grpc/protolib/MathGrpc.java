package ru.greenfield.study.grpc.protolib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: math.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MathGrpc {

    private MathGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "protolib.Math";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse> getAddMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "add", requestType = ru.greenfield.study.grpc.protolib.AddRequest.class, responseType = ru.greenfield.study.grpc.protolib.AddResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse> getAddMethod() {
        io.grpc.MethodDescriptor<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse> getAddMethod;
        if ((getAddMethod = MathGrpc.getAddMethod) == null) {
            synchronized (MathGrpc.class) {
                if ((getAddMethod = MathGrpc.getAddMethod) == null) {
                    MathGrpc.getAddMethod = getAddMethod = io.grpc.MethodDescriptor.<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "add")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.greenfield.study.grpc.protolib.AddRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.greenfield.study.grpc.protolib.AddResponse.getDefaultInstance())).setSchemaDescriptor(new MathMethodDescriptorSupplier("add")).build();
                }
            }
        }
        return getAddMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MathStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MathStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MathStub>() {

            @java.lang.Override
            public MathStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MathStub(channel, callOptions);
            }
        };
        return MathStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MathBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MathBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MathBlockingStub>() {

            @java.lang.Override
            public MathBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MathBlockingStub(channel, callOptions);
            }
        };
        return MathBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MathFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MathFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MathFutureStub>() {

            @java.lang.Override
            public MathFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MathFutureStub(channel, callOptions);
            }
        };
        return MathFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void add(ru.greenfield.study.grpc.protolib.AddRequest request, io.grpc.stub.StreamObserver<ru.greenfield.study.grpc.protolib.AddResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service Math.
     */
    public static abstract class MathImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MathGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service Math.
     */
    public static class MathStub extends io.grpc.stub.AbstractAsyncStub<MathStub> {

        private MathStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MathStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MathStub(channel, callOptions);
        }

        /**
         */
        public void add(ru.greenfield.study.grpc.protolib.AddRequest request, io.grpc.stub.StreamObserver<ru.greenfield.study.grpc.protolib.AddResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service Math.
     */
    public static class MathBlockingStub extends io.grpc.stub.AbstractBlockingStub<MathBlockingStub> {

        private MathBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MathBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MathBlockingStub(channel, callOptions);
        }

        /**
         */
        public ru.greenfield.study.grpc.protolib.AddResponse add(ru.greenfield.study.grpc.protolib.AddRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAddMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service Math.
     */
    public static class MathFutureStub extends io.grpc.stub.AbstractFutureStub<MathFutureStub> {

        private MathFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MathFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MathFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<ru.greenfield.study.grpc.protolib.AddResponse> add(ru.greenfield.study.grpc.protolib.AddRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAddMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_ADD = 0;

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
                case METHODID_ADD:
                    serviceImpl.add((ru.greenfield.study.grpc.protolib.AddRequest) request, (io.grpc.stub.StreamObserver<ru.greenfield.study.grpc.protolib.AddResponse>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getAddMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<ru.greenfield.study.grpc.protolib.AddRequest, ru.greenfield.study.grpc.protolib.AddResponse>(service, METHODID_ADD))).build();
    }

    private static abstract class MathBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MathBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return ru.greenfield.study.grpc.protolib.MathService.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Math");
        }
    }

    private static final class MathFileDescriptorSupplier extends MathBaseDescriptorSupplier {

        MathFileDescriptorSupplier() {
        }
    }

    private static final class MathMethodDescriptorSupplier extends MathBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MathMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (MathGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MathFileDescriptorSupplier()).addMethod(getAddMethod()).build();
                }
            }
        }
        return result;
    }
}
