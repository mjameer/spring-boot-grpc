package com.mj.grpc.service;

import com.mj.grpc.GreetingRequest;
import com.mj.grpc.GreetingResponse;
import com.mj.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        log.info("Received Message: {} ", message);

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
            .setMessage("Welcome " + message + ". Hello From gRPC Server. ")
            .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
