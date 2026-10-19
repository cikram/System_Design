# Lab 3 - Media App gRPC

Projet Maven multi-module compose de :

- `mediaappgrpc/proto` : contrats Protocol Buffers.
- `mediaappgrpc/mediaserver` : serveur media.
- `mediaappgrpc/mediaclient` : client media.

## Compiler

```powershell
cd mediaappgrpc
.\mvnw.cmd clean package
```

L'application utilise Java 21. Les modules peuvent ensuite etre lances depuis leurs dossiers respectifs.
