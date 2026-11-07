# System Design

Collection de travaux pratiques Java et Spring Boot autour de gRPC, GraphQL et de la repartition de charge.

## Projets

- `Grpc/Lab1` : client et serveur gRPC autour d'un service bancaire (Java 21).
- `Grpc/Lab2/customer_service` : service de gestion des clients avec Spring Boot, JPA, H2 et gRPC (Java 17, port gRPC `9090`).
- `Grpc/Lab3/mediaappgrpc` : application media gRPC multi-module (`proto`, serveur et client), avec serveur gRPC sur `9090` et client HTTP sur `8080` (Java 21).
- `LoadBalancerDemo101` : demonstration Spring Boot avec configuration Nginx (Java 21, Nginx sur `8080` vers les instances `8081` a `8083`).
- `video_service_GRAPHQL` : service video avec GraphQL (Java 21, port HTTP `8090`).

## Prerequis

- JDK 17 pour `Grpc/Lab2`.
- JDK 21 pour les autres projets.
- Maven Wrapper fourni dans chaque application. Pour `Grpc/Lab3`, il se trouve dans `mediaserver` et `mediaclient`.

## Lancer un projet

Depuis le dossier du projet concerne :

```powershell
.\mvnw.cmd spring-boot:run
```

Pour executer les tests :

```powershell
.\mvnw.cmd test
```

Pour `Grpc/Lab1`, lancer d'abord `grpcServer`, puis `grpcClient` dans deux terminaux.
Pour `Grpc/Lab3`, compiler depuis `Grpc/Lab3/mediaappgrpc` avec Maven, puis lancer
le serveur et le client depuis leurs dossiers respectifs.

Consulter le README de chaque projet pour les commandes et ports specifiques.
