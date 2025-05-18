package ru.greenfield.study.grpc.client.interceptors;

import jakarta.enterprise.context.ApplicationScoped;

import io.grpc.*;

@ApplicationScoped
public class JwtTokenClientInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> methodDescriptor,
            CallOptions callOptions,
            Channel next) {

        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
                next.newCall(methodDescriptor, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Metadata.Key.of("x-client-header", Metadata.ASCII_STRING_MARSHALLER), "quarkus-client");
                super.start(responseListener, headers);
            }

        };
    }

}
