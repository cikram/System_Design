# Labs gRPC

Ensemble de trois travaux pratiques indépendants autour de gRPC, Protocol
Buffers et Spring Boot.

## Organisation

- `Lab1` : service bancaire avec un serveur et un client gRPC.
- `Lab2/customer_service` : gestion de clients avec Spring Boot, JPA, H2 et gRPC.
- `Lab3/mediaappgrpc` : application média multi-module avec contrats protobuf,
  serveur gRPC et client HTTP.

Chaque application possède son propre Maven Wrapper. Les dossiers `target/`
sont générés par Maven et ne doivent pas être versionnés.

## Prérequis

- JDK 21 pour `Lab1` et `Lab3`.
- JDK 17 pour `Lab2`.
- PowerShell sous Windows ou un terminal compatible avec Maven Wrapper.

## Démarrage

Consulter le README du lab concerné pour les commandes détaillées. `Lab1`
nécessite deux terminaux : le serveur doit être démarré avant le client.
