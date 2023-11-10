## Exercice : Déployer un Pod avec des Variables d'Environnement

**Objectif :** Créer un pod qui exécute un conteneur basé sur l'image `busybox` et utilise des variables d'environnement.

### Instructions :

1. Préparez un fichier de spécification pour un pod nommé `env-pod` qui utilise l'image `busybox`.
2. Dans ce pod, définissez une variable d'environnement `MESSAGE` avec la valeur "Bienvenue dans Kubernetes!".
3. Configurez le conteneur pour afficher le contenu de la variable `MESSAGE` lors de son exécution.
4. Déployez le pod et vérifiez son statut.
5. Affichez les logs du pod pour voir le message de bienvenue.
6. Nettoyez vos ressources après avoir terminé l'exercice.


## Correction Exercice 1


```yml
apiVersion: v1
kind: Pod
metadata:
  name: busyboxpod
  labels:
    name: myapp
spec:
  containers:
  - name: busyboxcontainer
    image: busybox
    resources:
      limits:
        memory: "128Mi"
        cpu: "500m"
      requests:
        memory: "64Mi"
        cpu: "100m"
    command: ["sh", "-c", "echo $MESSAGE && sleep 3600"]
    
    env:
    - name: MESSAGE
      value: "Bienvenue dans kubernetes!"    
```