# Lab 2 - Customer Service

Service Spring Boot de gestion des clients avec persistance JPA/H2 et
exposition gRPC.

## API gRPC

Le service `CustomerService` fournit les opérations suivantes :

- `getAllCustomers` ;
- `getCustomerById` ;
- `saveCustomer`.

Le contrat est disponible dans
`customer_service/src/main/resources/CustomerService.proto`.

## Lancer

```powershell
cd customer_service
.\mvnw.cmd spring-boot:run
```

Le serveur gRPC écoute sur le port `9090`. La base H2 est en mémoire et
utilise la configuration de
`customer_service/src/main/resources/application.properties`.

## Tester

```powershell
.\mvnw.cmd test
```

Le projet utilise Java 17. Pour produire le package :

```powershell
.\mvnw.cmd clean package
```
