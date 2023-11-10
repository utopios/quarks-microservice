# Exercice Kubernetes: Déployer un DaemonSet

## Contexte

Vous êtes l'administrateur d'un cluster Kubernetes. Votre tâche est de garantir qu'un agent de collecte de logs tourne sur chaque nœud du cluster pour centraliser la gestion des logs.

## Objectif

Votre objectif est de déployer un DaemonSet utilisant Fluentd pour collecter les logs de chaque nœud et de chaque pod dans le cluster Kubernetes.

## Consignes

1. **Création du DaemonSet**: Créez un manifeste YAML pour un DaemonSet qui déploie Fluentd sur chaque nœud du cluster. Assurez-vous d'utiliser la bonne image de Fluentd et de configurer les volumes nécessaires pour accéder aux logs du nœud et des pods `fluent/fluentd-kubernetes-daemonset:v1-debian-elasticsearch`.

2. **Déploiement**: Déployez le DaemonSet dans votre cluster et vérifiez qu'il se déploie correctement sur tous les nœuds.

3. **Vérification**: Assurez-vous que chaque nœud du cluster exécute une instance de Fluentd.

4. **Gestion des défaillances**: Simulez une panne d'un pod Fluentd et observez le comportement du DaemonSet. Assurez-vous qu'un nouveau pod est créé automatiquement pour remplacer le pod défaillant.

5. **Validation**: Validez que Fluentd collecte les logs comme attendu. Vous pourriez vérifier les logs d'un des pods Fluentd pour confirmer qu'il collecte les logs des autres pods du nœud.

## Ressources

Vous pouvez utiliser les ressources suivantes pour vous aider à accomplir ces tâches :

- Documentation de Kubernetes sur les DaemonSets: [Lien vers la documentation](https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/)
- Documentation de Fluentd, y compris des exemples de configuration pour Kubernetes: [Lien vers la documentation Fluentd](https://docs.fluentd.org/)