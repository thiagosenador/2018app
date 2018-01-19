```sh
gradle endpointsopenapidocs
```

```sh
gcloud endpoints services deploy build\endpointsOpenApiDocs\openapi.json
```

```sh
gcloud endpoints configs list --service=airie-app.appspot.com
```

```sh
gradle appenginedeploy
```