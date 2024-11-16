# Spring Boot gRPC Example

This project covers usage of gRPC in a Spring Boot application

## Commands used

```
  grpcurl --plaintext localhost:9090 list
  grpcurl --plaintext localhost:9090 list com.mj.grpc.GreetingService
  grpcurl --plaintext -d '{"message": "Mj"}' localhost:9090 com.mj.grpc.GreetingService/greeting
```

## Reference

- [Mike's Spring Boot gRPC Starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html)