package ru.greenfield.strudy.grpc.genproto.calendar;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.69.1)", comments = "Source: calendar.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalendarServiceGrpc {

    private CalendarServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "CalendarService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Timestamp> getGetCurrentDateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "GetCurrentDate", requestType = com.google.protobuf.Empty.class, responseType = com.google.protobuf.Timestamp.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Timestamp> getGetCurrentDateMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Timestamp> getGetCurrentDateMethod;
        if ((getGetCurrentDateMethod = CalendarServiceGrpc.getGetCurrentDateMethod) == null) {
            synchronized (CalendarServiceGrpc.class) {
                if ((getGetCurrentDateMethod = CalendarServiceGrpc.getGetCurrentDateMethod) == null) {
                    CalendarServiceGrpc.getGetCurrentDateMethod = getGetCurrentDateMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Timestamp>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentDate")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Timestamp.getDefaultInstance())).setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("GetCurrentDate")).build();
                }
            }
        }
        return getGetCurrentDateMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static CalendarServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CalendarServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceStub>() {

            @java.lang.Override
            public CalendarServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CalendarServiceStub(channel, callOptions);
            }
        };
        return CalendarServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static CalendarServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CalendarServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceBlockingStub>() {

            @java.lang.Override
            public CalendarServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CalendarServiceBlockingStub(channel, callOptions);
            }
        };
        return CalendarServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static CalendarServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<CalendarServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceFutureStub>() {

            @java.lang.Override
            public CalendarServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CalendarServiceFutureStub(channel, callOptions);
            }
        };
        return CalendarServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void getCurrentDate(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<com.google.protobuf.Timestamp> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentDateMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service CalendarService.
     */
    public static abstract class CalendarServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return CalendarServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service CalendarService.
     */
    public static class CalendarServiceStub extends io.grpc.stub.AbstractAsyncStub<CalendarServiceStub> {

        private CalendarServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CalendarServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CalendarServiceStub(channel, callOptions);
        }

        /**
         */
        public void getCurrentDate(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<com.google.protobuf.Timestamp> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetCurrentDateMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service CalendarService.
     */
    public static class CalendarServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalendarServiceBlockingStub> {

        private CalendarServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CalendarServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CalendarServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.google.protobuf.Timestamp getCurrentDate(com.google.protobuf.Empty request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetCurrentDateMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service CalendarService.
     */
    public static class CalendarServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalendarServiceFutureStub> {

        private CalendarServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected CalendarServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CalendarServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetCurrentDateMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_CURRENT_DATE = 0;

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
                case METHODID_GET_CURRENT_DATE:
                    serviceImpl.getCurrentDate((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<com.google.protobuf.Timestamp>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGetCurrentDateMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.Empty, com.google.protobuf.Timestamp>(service, METHODID_GET_CURRENT_DATE))).build();
    }

    private static abstract class CalendarServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        CalendarServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return ru.greenfield.strudy.grpc.genproto.calendar.Calendar.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("CalendarService");
        }
    }

    private static final class CalendarServiceFileDescriptorSupplier extends CalendarServiceBaseDescriptorSupplier {

        CalendarServiceFileDescriptorSupplier() {
        }
    }

    private static final class CalendarServiceMethodDescriptorSupplier extends CalendarServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        CalendarServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (CalendarServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new CalendarServiceFileDescriptorSupplier()).addMethod(getGetCurrentDateMethod()).build();
                }
            }
        }
        return result;
    }
}
