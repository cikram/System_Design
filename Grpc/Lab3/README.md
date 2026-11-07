# Lab 3 - Media App gRPC

Application média construite avec un projet Maven multi-module. Le client
HTTP communique avec le serveur média via gRPC.

## Modules

- `mediaappgrpc/proto` : contrats Protocol Buffers.
- `mediaappgrpc/mediaserver` : serveur gRPC avec JPA et H2.
- `mediaappgrpc/mediaclient` : façade HTTP qui appelle le serveur gRPC.

Le contrat définit notamment `CreatorService` et `VideoService`, avec les
opérations de lecture des créateurs, récupération des vidéos et dépôt d'une
vidéo.

## Compiler

Depuis `Grpc/Lab3/mediaappgrpc` :

```powershell
.\mediaserver\mvnw.cmd -f pom.xml clean package
```

L'application utilise Java 21.

## Démarrer

Dans un premier terminal :

```powershell
cd mediaserver
.\mvnw.cmd spring-boot:run
```

Le serveur gRPC écoute sur `9090`.

Dans un second terminal :

```powershell
cd mediaclient
.\mvnw.cmd spring-boot:run
```

Le client HTTP écoute sur `8080` et se connecte à `localhost:9090`.

## Tester

Depuis `mediaserver` ou `mediaclient` :

```powershell
.\mvnw.cmd test
```
