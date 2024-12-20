### Spring Boot gRPC Example

This project covers usage of gRPC in a Spring Boot application

### Testing Commands

```
  grpcurl --plaintext localhost:9090 list
  grpcurl --plaintext localhost:9090 list com.mj.grpc.GreetingService
  grpcurl --plaintext -d '{"message": "Mj"}' localhost:9090 com.mj.grpc.GreetingService/greeting
```

## Reference

- [Mike's Spring Boot gRPC Starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html)

### What is gRPC 

![1733030012016](https://github.com/user-attachments/assets/8f3dac9a-dc3e-4f95-a3dc-2c4870cf6d91)


### Why gRPC

- Communication via gRPC does not work natively work out of the box for web browser
- Used in communication between MS and not much used for communication between FE and BE

### How do Protocol Buffers Work?

The following diagram shows how you use protocol buffers to work with your data.

![image](https://github.com/user-attachments/assets/419fec5d-6e1b-49ee-b85d-7aacb40953f4)


### Reference

- https://www.youtube.com/watch?v=jG6sYey45G8
- https://www.youtube.com/watch?v=hVrwuMnCtok&t=274s
- https://www.youtube.com/watch?v=4SuFtQV8RCk
- https://www.youtube.com/watch?v=2CWYorTWyGs&t=191s
- https://manerajona.medium.com/building-microservices-with-spring-boot-and-grpc-b770ff4ff61b 

