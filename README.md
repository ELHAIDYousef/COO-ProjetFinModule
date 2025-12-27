# Pizzeria : Abstract Factory & Rétro-ingénierie Logicielle

## 🎓 Contexte Académique

* 
**Établissement** : École Normale Supérieure de l'Enseignement Technique (ENSET) Mohammedia.


* 
**Filière** : II-BDCC 2 / GLSID 2.


* 
**Module** : Conception Orientée Objet (COO).


* 
**Année Universitaire** : 2025/2026.


* 
**Encadré par** : Prof. Sara RETAL.


* 
**Réalisé par** : **Yousef ELHAID**.



---

## 📝 Description du Projet

Ce projet a pour but de mettre en pratique les concepts de la **rétro-ingénierie logicielle**. Il s'appuie sur l'implémentation en Java du design pattern **Abstract Factory** appliqué à l'exemple d'une Pizzeria multi-régionale.

L'objectif est d'analyser le code source pour produire automatiquement un modèle UML abstrait afin de faciliter la maintenance et la compréhension du système.

---

## 🏗️ Architecture du Logiciel

Le projet est structuré en plusieurs packages pour garantir le respect du principe d'inversion des dépendances:

1. 
**`pizzeria.fabrique`** : Définit l'interface `FabriqueIngredientsPizza` et les abstractions pour chaque type d'ingrédient (Pâte, Sauce, Fromage, etc.).


2. 
**`pizzeria.ingredients`** : Contient les implémentations concrètes des ingrédients pour les régions de **Brest** et **Strasbourg**.


3. 
**`pizzeria.produits`** : Inclut la classe abstraite `Pizza` et ses déclinaisons (`PizzaFromage`, `PizzaVegetarienne`, etc.) qui utilisent les fabriques d'ingrédients.


4. 
**`pizzeria.boutiques`** : Gère les points de vente régionaux (`PizzeriaBrest`, `PizzeriaStrasbourg`) qui injectent les fabriques appropriées dans les produits.



---

## 🚀 Fonctionnalités Clés

* 
**Design Pattern Abstract Factory** : Création de familles d'objets (ingrédients) sans spécifier leurs classes concrètes.


* 
**Découplage Total** : Les classes de pizzas dépendent uniquement d'abstractions.


* 
**Processus Standardisé** : Cuisson uniforme à  pendant 25 minutes pour toutes les pizzas.



---

## 🛠️ Méthodologie de Rétro-ingénierie

Le projet démontre deux méthodes pour générer le diagramme de classes UML à partir du code source:

1. 
**StarUML** : Utilisation de l'extension Java et de la fonction *Reverse Code* pour une analyse structurelle approfondie.


2. **IntelliJ IDEA** : Génération rapide de diagrammes de dépendances via l'outil intégré de l'IDE.

---

## 💻 Installation et Utilisation

1. Cloner le dépôt :
```bash
git clone https://github.com/votre-username/Pizzeria-Abstract-Factory.git

```


2. Ouvrir le projet dans votre IDE préféré (IntelliJ recommandé).
3. Exécuter la classe `Main.java` pour observer le mécanisme d'injection des fabriques dans la console.

---

## 🎥 Démonstration

Une vidéo de présentation (3 minutes maximum) détaillant le code et le processus de rétro-ingénierie accompagne ce projet. Elle explique comment transformer cette implémentation Java en un modèle visuel UML clair et précis.
