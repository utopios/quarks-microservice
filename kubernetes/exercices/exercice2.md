## Exercice : Gérer la Réplication avec un ReplicaSet dans Kubernetes

**Objectif :** Créer un ReplicaSet pour maintenir un nombre spécifique de réplicas d'un Pod et observer la gestion automatique des Pods.

### Instructions :

1. **Écrivez la spécification YAML** pour un ReplicaSet nommé `frontend-replicaset` qui maintient trois réplicas du Pod qui exécute l'image `nginx`.

2. **Appliquez la spécification** en utilisant la commande `kubectl apply -f frontend-replicaset.yaml`.

3. **Vérifiez le statut** du ReplicaSet en utilisant `kubectl get rs` et assurez-vous qu'il y a trois Pods en cours d'exécution.

4. **Testez la résilience** en supprimant manuellement un des Pods créés par le ReplicaSet avec `kubectl delete pod <nom-du-pod>`. Observez si un nouveau Pod est créé automatiquement pour remplacer celui qui a été supprimé.

5. **Mettez à jour le ReplicaSet** pour utiliser une version différente de `nginx` (par exemple, `nginx:1.17.6`). Mettez à jour le fichier YAML et appliquez-le à nouveau avec `kubectl apply`.

6. **Observez le comportement du ReplicaSet** après la mise à jour. Notez que les Pods existants ne seront pas mis à jour automatiquement.

7. **Augmentez le nombre de réplicas** à cinq en modifiant le champ `replicas` dans le fichier YAML et appliquez les modifications.

8. **Vérifiez que deux nouveaux Pods ont été créés** pour satisfaire la nouvelle demande de réplicas.

9. **Nettoyez vos ressources** en supprimant le ReplicaSet une fois que vous avez terminé de tester : `kubectl delete rs frontend-replicaset`.
