# Lab 2 - Customer Service

Service Spring Boot de gestion des clients, avec JPA, base H2 et exposition gRPC.

## Lancer

```powershell
cd customer_service
.\mvnw.cmd spring-boot:run
```

## Tester

```powershell
.\mvnw.cmd test
```

Le projet utilise Java 17. Les donnees H2 sont configurees dans `customer_service/src/main/resources`.
