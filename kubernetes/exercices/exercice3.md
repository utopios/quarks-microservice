## Exercice : Stratégies de Déploiement dans Kubernetes

**Objectif :** Utiliser différentes stratégies de déploiement pour mettre à jour une application dans Kubernetes et observer les différences entre elles.

### Instructions :

1. **Déployez une application** en utilisant un déploiement Kubernetes nommé `advanced-deployment` avec l'image `httpd:2.4` et trois réplicas. Configurez le déploiement pour utiliser la stratégie `RollingUpdate`.

2. **Vérifiez le déploiement** en utilisant `kubectl get deployments`, et assurez-vous que les trois pods sont en cours d'exécution.

3. **Mettez à jour l'application** en changeant l'image vers `httpd:2.4.46`. Appliquez la mise à jour et utilisez `kubectl rollout status deployment/advanced-deployment` pour observer le déploiement progressif.

4. **Modifiez la stratégie de déploiement** pour `Recreate`. Mettez à jour le déploiement pour utiliser l'image `httpd:2.4.48`.

5. **Appliquez la mise à jour** et observez le comportement du déploiement. Contrairement au `RollingUpdate`, tous les anciens pods doivent être supprimés avant que les nouveaux ne soient créés.

6. **Après la mise à jour**, vérifiez à nouveau l'état des pods et le déploiement pour vous assurer que les nouveaux pods sont en cours d'exécution avec la nouvelle image.

7. **Nettoyez l'environnement** en supprimant le déploiement et le service après l'expérimentation.

### Points de Réflexion :

- Comment les deux stratégies de déploiement affectent-elles la disponibilité de l'application pendant la mise à jour ?
- Pourquoi choisiriez-vous un déploiement progressif par rapport à une stratégie de création immuable ?