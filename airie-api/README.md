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

```sh
set ENDPOINTS_SERVICE_NAME="airie-app.appspot.com"
```

```sh
gcloud auth application-default login
```

```sh
gradle appenginerun
```