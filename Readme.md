Mon Application Clair - Apprentissage Android
Ce projet est une introduction au développement Android moderne utilisant Jetpack Compose.
Voici un résumé des concepts clés implémentés dans ce code.

🚀 Notions Clés Apprises

1. Structure de l'Activité (MainActivity)

L'activité est le point d'entrée de l'application.

ComponentActivity: La classe de base moderne pour les activités utilisant Compose.

setContent: Remplace les anciens fichiers XML. C'est ici que l'on définit l'interface utilisateur (UI) en appelant des fonctions composables.

enableEdgeToEdge(): Permet à l'application de s'afficher sur tout l'écran, y compris derrière la barre d'état et la barre de navigation.

2. Jetpack Compose (UI déclarative)

Contrairement à l'ancien système de vues, on décrit l'interface par des fonctions annotées @Composable.

Column: Un composant de mise en page qui empile ses enfants verticalement (équivalent à un LinearLayoutvertical).

Modifier: L'outil pour modifier le comportement ou l'apparence des composants (ex: fillMaxSize(), padding()).

3. Mise en page et alignement

Le code utilise des propriétés cruciales pour centrer le contenu :

verticalArrangement = Arrangement.Center: Centrer les éléments verticalement dans la colonne.

horizontalAlignment = Alignment.CenterHorizontally: Centrer les éléments horizontalement.

Spacer: Utilisé pour créer de l'espace vide entre les éléments (au lieu de marges complexes).

4. Conception matérielle 3

L'application utilise le dernier système de conception de Google :

MaterialTheme: Permet d'accéder aux styles de texte (displayLarge, bodyMedium) et aux couleurs prédéfinies pour garder une cohérence visuelle.

Button&Text : Composants standards qui s'adaptent automatiquement au thème.

5. Aperçu et Débogage
   @Preview: Une fonctionnalité de l'IDE qui permet de voir le design sans avoir à lancer l'émulateur ou un téléphone physique.

onClick: Introduction à la gestion des événements (ici, un simple println dans la console).