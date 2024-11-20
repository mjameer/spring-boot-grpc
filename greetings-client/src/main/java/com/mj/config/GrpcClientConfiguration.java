package com.mj.config;

import com.mj.grpc.GreetingServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

@Configuration
class GrpcClientConfiguration {

    @Bean
    GreetingServiceGrpc.GreetingServiceBlockingStub greetingServiceBlockingStub() {
        Channel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
            .usePlaintext()
            .build();

        return GreetingServiceGrpc.newBlockingStub(channel);
    }
}
