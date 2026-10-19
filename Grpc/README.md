# Labs gRPC

Les labs sont independants, sauf `Lab1` qui se compose d'un serveur et d'un client gRPC a lancer separement.

## Organisation

- `Lab1` : `grpcServer` et `grpcClient`.
- `Lab2/customer_service` : service clients avec Spring Boot, JPA, H2 et gRPC.
- `Lab3/mediaappgrpc` : projet Maven multi-module avec `proto`, `mediaserver` et `mediaclient`.

Chaque application contient son propre Maven Wrapper. Les dossiers `target/` sont des sorties de build et ne doivent pas etre versionnes.
