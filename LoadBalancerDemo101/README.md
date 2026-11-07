# Load Balancer Demo

Démonstration d'un service Spring Boot répliqué derrière un reverse proxy
Nginx. Chaque réponse expose l'identifiant de l'instance et le nombre de
requêtes traitées par cette instance.

## API

- `GET /products/{id}` : retourne un produit de démonstration ;
- `GET /health` : vérifie la disponibilité de l'instance.

## Lancer une instance

```powershell
.\mvnw.cmd spring-boot:run
```

Par défaut, l'application utilise le port Spring Boot configuré localement.
La variable d'environnement `INSTANCE_ID` permet d'identifier une instance.

## Tester

```powershell
.\mvnw.cmd test
```

Java 21 est requis.

## Nginx

La configuration de `nginx/nginx.conf` écoute sur `8080` et distribue les
requêtes vers `host.docker.internal:8081`, `8082` et `8083`. Démarrer trois
instances de l'application sur ces ports ou adapter la configuration Nginx
aux ports utilisés localement.
