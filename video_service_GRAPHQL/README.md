# Video Service GraphQL

Service Spring Boot qui expose un catalogue video avec GraphQL. Les schemas sont dans `src/main/resources/graphql`.

## Lancer

```powershell
.\mvnw.cmd spring-boot:run
```

## Tester

```powershell
.\mvnw.cmd test
```

Java 21 est requis. Les requetes et mutations disponibles sont definies dans les fichiers `.graphqls` du dossier `src/main/resources/graphql`.
