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
## Commande k8s

kubectl get pods 
kubectl get deployment
kubectl get services


## Commande k8s autoscale deployment

kubectl autoscale deployment <deployment_name> --min=3 --max=6


## Commande création d'une extension quarkus

mvn io.quarkus.platform:quarkus-maven-plugin:3.6.0:create-extension -DgroupId=com.example -DextensionId=custom-extestion -DwithoutTests