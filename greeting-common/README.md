### This is a common Library
- Its used by both gRPC server and gRPC client


### Lib needed for gRPC Server
```xml
    <dependencies>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <version>${protobuf.version}</version>
        </dependency>
        
        <dependency>
            <groupId>jakarta.annotation</groupId>
            <artifactId>jakarta.annotation-api</artifactId>
            <version>3.0.0</version>
            <optional>true</optional>
        </dependency>
    </dependencies>
```

### Lib needed for gRPC Client


```xml
        <dependency>
            <artifactId>grpc-netty-shaded</artifactId>
            <groupId>io.grpc</groupId>
            <scope>runtime</scope>
            <version>${grpc.version}</version>
        </dependency>
```

