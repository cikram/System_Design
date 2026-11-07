# Video Service GraphQL

Service Spring Boot de gestion d'un catalogue vidéo avec GraphQL, JPA et une
base H2 en mémoire.

## Opérations GraphQL

Le schéma de `src/main/resources/graphql/Queries.graphqls` expose :

- `videoList` pour lister les vidéos ;
- `creatorById(id)` pour rechercher un créateur ;
- `saveVideo(video)` pour enregistrer une vidéo ;
- `saveCreator(creator)` pour enregistrer un créateur.

## Lancer

```powershell
.\mvnw.cmd spring-boot:run
```

L'application écoute sur le port HTTP `8090`. L'endpoint GraphQL est
accessible à `/graphql`.

## Tester

```powershell
.\mvnw.cmd test
```

Pour produire le package :

```powershell
.\mvnw.cmd clean package
```

Java 21 est requis. Les types et entrées GraphQL sont définis dans les
fichiers `.graphqls` de `src/main/resources/graphql`.
