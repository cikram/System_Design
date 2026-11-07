# Lab 1 - Service bancaire gRPC

Ce lab montre un échange gRPC entre une application serveur et une
application cliente Spring Boot. Le contrat protobuf est défini dans
`Bank.proto`.

## Services disponibles

`BankService` expose :

- `convert` pour une conversion simple ;
- `getCurrencyStream` pour un flux serveur ;
- `performStream` pour un flux client ;
- `fullCurrencyStream` pour un flux bidirectionnel.

## Démarrage

Depuis `Grpc/Lab1`, lancer le serveur dans un premier terminal :

```powershell
cd grpcServer
.\mvnw.cmd spring-boot:run
```

Dans un second terminal, lancer le client :

```powershell
cd grpcClient
.\mvnw.cmd spring-boot:run
```

## Tests et compilation

Dans chacun des dossiers `grpcServer` et `grpcClient` :

```powershell
.\mvnw.cmd test
.\mvnw.cmd clean package
```

Les deux applications utilisent Java 21. Le fichier `1.Atelier gRPC.pdf`
contient le sujet du lab.
