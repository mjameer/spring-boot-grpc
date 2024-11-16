package com.mj.grpc.service;

import com.mj.grpc.GreetingRequest;
import com.mj.grpc.GreetingResponse;
import com.mj.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        System.out.println("Received Message: " + message);

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
            .setMessage("Welcome " + message + ". Hello From gRPC. ")
            .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }
}
