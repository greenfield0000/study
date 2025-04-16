package ru.greenfield.study.grpc.streamingservice.service;

import java.time.Duration;

import com.google.protobuf.Empty;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Multi;
import streaming_service.*;

@GrpcService
public class GrpcTimerService implements TimerService {

    @Override
    public Multi<TickResponse> tick(Empty request) {
        return Multi.createFrom()
            .ticks()
            .every(Duration.ofMillis(1_000))
            .map((l) -> TickResponse.newBuilder().setCounter(String.valueOf(l)).build());
    }



}
