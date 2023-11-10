## Reference

#### Filtre CROS

https://quarkus.io/guides/http-reference#cors-filter


## Commande build image

docker build -f <path_dockerfile> -t <nom_image> .

## Command run container

docker run <options> <image_name>

**exemple**
```bash
docker run -d -p 8080:8080 --name containername imagename
```