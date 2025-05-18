package ru.greenfield.strudy.grpc.genproto.calendar;

import static ru.greenfield.strudy.grpc.genproto.calendar.CalendarServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: calendar.proto")
public final class MutinyCalendarServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyCalendarServiceGrpc() {
    }

    public static MutinyCalendarServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyCalendarServiceStub(channel);
    }

    public static class MutinyCalendarServiceStub extends io.grpc.stub.AbstractStub<MutinyCalendarServiceStub> implements io.quarkus.grpc.MutinyStub {

        private CalendarServiceGrpc.CalendarServiceStub delegateStub;

        private MutinyCalendarServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = CalendarServiceGrpc.newStub(channel);
        }

        private MutinyCalendarServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = CalendarServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyCalendarServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyCalendarServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getCurrentDate);
        }
    }

    public static abstract class CalendarServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public CalendarServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.google.protobuf.Timestamp> getCurrentDate(com.google.protobuf.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(ru.greenfield.strudy.grpc.genproto.calendar.CalendarServiceGrpc.getGetCurrentDateMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.Empty, com.google.protobuf.Timestamp>(this, METHODID_GET_CURRENT_DATE, compression))).build();
        }
    }

    private static final int METHODID_GET_CURRENT_DATE = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final CalendarServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(CalendarServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_CURRENT_DATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<com.google.protobuf.Timestamp>) responseObserver, compression, serviceImpl::getCurrentDate);
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
