package ru.greenfield.study.grpc.interceptor;

import jakarta.enterprise.context.ApplicationScoped;

import io.grpc.*;
import io.grpc.ServerCall.Listener;


@ApplicationScoped
public class HeaderConsoleInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        System.out.println("header is %s" + headers.toString());
        return next.startCall(call, headers);
    }

}
