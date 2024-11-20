package com.mj.config;


import com.mj.grpc.GreetingRequest;
import com.mj.grpc.GreetingResponse;
import com.mj.grpc.GreetingServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class AppRunner implements ApplicationRunner {

    private final GreetingServiceGrpc.GreetingServiceBlockingStub stub;

    public AppRunner(GreetingServiceGrpc.GreetingServiceBlockingStub stub) {
        this.stub = stub;
    }

    @Override
    public void run(ApplicationArguments args) {

        var greetingRequest = GreetingRequest.newBuilder().setMessage("Jamil").build();
        GreetingResponse greeting = stub.greeting(greetingRequest);
        log.info("** Greeting: " + greeting.getMessage());


    }
}