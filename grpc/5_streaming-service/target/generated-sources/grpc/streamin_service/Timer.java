package streamin_service;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: timer.proto")
public interface Timer extends MutinyService {

    io.smallrye.mutiny.Multi<streamin_service.TickResponse> tick(com.google.protobuf.Empty request);
}
