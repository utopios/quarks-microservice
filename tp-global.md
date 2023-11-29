**Objectif :** Créer une application microservice réactive qui utilise trois services (ServiceA, ServiceB, ServiceC), en utilisant Quarkus pour les microservices, Docker pour la construction et le déploiement, JWT pour la sécurité, et exposant des services via REST et gRPC. `ServiceC` sera responsable de la composition des services.

**Exigences :**

1. **Architecture Microservice Réactive :**
   - Développer deux microservices réactifs : `ServiceA` (gestion d'utilisateurs) et `ServiceB` (traitement de données).
   - Utiliser le modèle de programmation réactive dans les services pour gérer les flux de données de manière non bloquante.

2. **Quarkus pour le Développement de Microservices :**
   - Implémenter les services en utilisant Quarkus, en tirant parti de ses capacités réactives.
   - Chaque service doit être un projet Quarkus distinct.

3. **Dockerisation des Services :**
   - Conteneuriser chaque service avec Docker.
   - Utiliser Docker Compose pour l'orchestration des services.

4. **Sécurité avec JWT :**
   - Sécuriser les services avec JSON Web Tokens (JWT).
   - `ServiceA` doit implémenter une authentification réactive qui génère un JWT.

5. **Exposition des Services via REST et gRPC :**
   - Exposer `ServiceA` avec une API REST réactive.
   - Utiliser gRPC dans `ServiceB` pour un traitement réactif des données.

6. **Communication Inter-Service Réactive :**
   - `ServiceA` doit communiquer avec `ServiceB` via gRPC de manière réactive.

7. **Composition dans ServiceC :**
   - `ServiceC` doit utiliser REST ou gRPC pour communiquer avec `ServiceA` et `ServiceB`.
   - Implémenter des fonctionnalités réactives pour composer et traiter les données de `ServiceA` et `ServiceB`.

**Étapes Suggérées :**

1. **Création des Projets Quarkus Réactifs :**
   - Créer des projets Quarkus pour `ServiceA` et `ServiceB` avec les extensions réactives nécessaires.

2. **Développement des Fonctionnalités Réactives :**
   - Implémenter la logique d'authentification réactive dans `ServiceA`.
   - Développer une API REST réactive dans `ServiceA`.
   - Créer des services gRPC réactifs dans `ServiceB`.

3. **Dockerisation et Orchestration :**
   - Écrire des `Dockerfile` pour chaque service et configurer Docker Compose.

4. **Test et Déploiement Réactifs :**
   - Tester les services pour s'assurer qu'ils fonctionnent de manière réactive et efficace.
   - Déployer l'application en utilisant Docker Compose.
