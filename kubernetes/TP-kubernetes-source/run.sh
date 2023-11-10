## Build des images
docker build -t result-image ./result/.
docker build -t vote-image ./vote/.
docker build -t worker-image ./worker/.

# Creation du cluster
kind create cluster --name tp-kubernetes --config ./sources/kind/kind-config.yml

#Load docker images to k8s cluster
kind load docker-image result-image --name tp-kubernetes
kind load docker-image vote-image --name tp-kubernetes
kind load docker-image worker-image --name tp-kubernetes


#Creation des ressources kubernetes
kubectl create -f sources/k8s/namespace.yml
kubectl create -f sources/k8s/configmap.yml
kubectl create -f sources/k8s/secrets.yml
kubectl create -f sources/k8s/services/clusterip-postgres.yml
kubectl create -f sources/k8s/services/clusterip-redis.yml
kubectl create -f sources/k8s/services/nodeport-vote.yml
kubectl create -f sources/k8s/services/nodeport-result.yml
kubectl create -f sources/k8s/deployments/postgres-deployment.yml
kubectl create -f sources/k8s/deployments/redis-deployment.yml
kubectl create -f sources/k8s/deployments/vote-deployment.yml
kubectl create -f sources/k8s/deployments/worker-deployment.yml
kubectl create -f sources/k8s/deployments/result-deployment.yml