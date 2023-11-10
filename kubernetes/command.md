## command 
git clone https://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@github.com/utopios/formation_kubernetes_novembre.git

## Install docker par script
curl https://get.docker.com/ > docker.sh
chmod +x docker.sh
./docker.sh
sudo systemctl start docker

## Install kind
https://kind.sigs.k8s.io/docs/user/quick-start/

```bash
curl -Lo ./kind https://kind.sigs.k8s.io/dl/v0.11.1/kind-linux-amd64
chmod +x ./kind
sudo mv ./kind /usr/local/bin
```

## Command création d'un cluster kind

```bash
# Créer un cluster
kind create cluster --name <name_cluster>

# Supprimer un cluster
kind delete cluster --name <name_cluster>

# Créer un cluster avec un fichier de config
kind create cluster --name <name_cluster> --config <path/configfile.yml>
```

## Command pour installer 

```bash
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin
```

## Command création de ressources avec kubectl
```bash
kubectl create -f <path_resource_file>
```

## Command suppression de ressources avec kubectl
```bash
kubectl delete -f <path_resource_file>
```

## Command pour afficher les sorties d'un container à l'interieur d'un pod
```bash
kubectl logs <nom_pod> -c <nom_container>
```

## Changement de replicas pour un replicaset
kubectl scale --replicas=4 replicaset <nom_replicaset>

## Changement d'image pour un déploiement 
kubectl set image deployment/<nom_deploiement> <nom_container>=<nouvelle image>

## Accéder à l'historique du déploiement 
kubectl rollout history deployment/<nom_deployment>
## retour vers une version d'un deploiement
kubectl rollout undo deployment/<nom_deployment> --to-revision=1

### Utilisation du autoscale avec les deployments
kubectl autoscale deployment <nom_deployment> --min=2 --max=5

### Load images to kind cluster
```bash
kind load docker-image <nom_image> --name <cluster_name>
```

### Docker command

```
docker build -t <name_image> ./path/to/dockerfile
```