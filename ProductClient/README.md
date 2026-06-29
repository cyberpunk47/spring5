# Synchronous service call demo

This folder contains two Spring Boot applications:

- `ProductClient` runs on port `8020` and exposes `GET /getproduct`.
- `ProductService` runs on port `8030` and exposes `GET /product`.

Start the service in one terminal:

```bash
./mvnw -f ProductService/pom.xml spring-boot:run
```

Start the client in another terminal:

```bash
./mvnw spring-boot:run
```

Then call the client:

```bash
curl http://localhost:8020/getproduct
```

The client waits for the response from `ProductService`, demonstrating a synchronous HTTP call.
