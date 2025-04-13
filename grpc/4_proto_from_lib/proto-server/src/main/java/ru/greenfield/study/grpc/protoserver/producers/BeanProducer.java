package ru.greenfield.study.grpc.protoserver.producers;

import jakarta.enterprise.context.*;

import io.quarkus.arc.Unremovable;
import ru.greenfield.study.grpc.protolib.MathService;
import ru.greenfield.study.grpc.protoserver.GrpcMathService;

@Dependent
public class BeanProducer {

    @Unremovable
    @ApplicationScoped
    MathService mathService() {
        return new GrpcMathService();
    }

}
