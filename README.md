# System Design

Collection de travaux pratiques Java et Spring Boot autour de gRPC, GraphQL et de la repartition de charge.

## Projets

- `Grpc/Lab1` : client et serveur gRPC autour d'un service bancaire.
- `Grpc/Lab2` : service de gestion des clients avec Spring Boot, JPA, H2 et gRPC.
- `Grpc/Lab3/mediaappgrpc` : application media gRPC multi-module (`proto`, serveur et client).
- `LoadBalancerDemo101` : demonstration Spring Boot avec configuration Nginx.
- `video_service_GRAPHQL` : service video avec GraphQL.

## Prerequis

- JDK 17 minimum pour `Grpc/Lab2`.
- JDK 21 pour les autres projets indiques.
- Maven Wrapper fourni dans les projets (`mvnw.cmd` sous Windows).

## Lancer un projet

Depuis le dossier du projet concerne :

```powershell
.\mvnw.cmd spring-boot:run
```

Pour executer les tests :

```powershell
.\mvnw.cmd test
```

Consulter le README de chaque projet pour les commandes et ports specifiques.
