# 🏨 HotelBookingPro — Système de Réservation d'Hôtel

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

**HotelBookingPro** est une application web moderne de réservation d'hôtels développée en Java avec le framework **Spring Boot** et le moteur de templates **Thymeleaf**. Elle permet aux utilisateurs de parcourir une sélection d'hôtels, de consulter leurs fiches détaillées (galerie photos, équipements, prix), d'effectuer des réservations en ligne et de contacter l'établissement.

---

## 🌟 Fonctionnalités Principales

- **🏠 Page d'Accueil (`/`)** : Présentation du service, recherche rapide et mise en avant des destinations populaires.
- **🏨 Liste des Hôtels (`/hotels`)** : Catalogue interactif des établissements disponibles avec filtrage et tarification.
- **🔍 Fiche Détaillée (`/hotels/{id}`)** : Galerie d'images haute définition, liste des équipements (Spa, Piscine, WiFi, etc.), avis et description.
- **📅 Formulaire de Réservation (`/reservation`)** : Processus fluide pour effectuer une demande de réservation de chambre.
- **🔑 Authentification / Connexion (`/login`)** : Espace de connexion utilisateur et gestion de session.
- **✉️ Page de Contact (`/contact`)** : Formulaire de demande d'informations et support client.

---

## 🛠️ Stack Technique

- **Backend** : Java 17, Spring Boot 3.1.5
  - *Spring MVC* (Gestion des routes et du contrôleur)
  - *Spring Data JPA / Hibernate* (ORM et accès aux données)
  - *Lombok* (Réduction du code boilerplate)
  - *Spring Boot DevTools* (Rechargement à chaud en développement)
- **Frontend** : HTML5, CSS3, JavaScript, Thymeleaf
- **Base de données** : MySQL (`hotel_db`)
- **Gestionnaire de dépendances** : Apache Maven

---

## 📂 Structure du Projet

```text
HotelBookingPro/
├── src/
│   ├── main/
│   │   ├── java/com/hotelbookingpro/
│   │   │   ├── HotelBookingProApplication.java   # Classe principale Spring Boot
│   │   │   ├── controller/                        # Contrôleurs Web (MVC)
│   │   │   │   ├── ContactController.java
│   │   │   │   ├── HomeController.java
│   │   │   │   ├── HotelController.java
│   │   │   │   ├── LoginController.java
│   │   │   │   └── ReservationController.java
│   │   │   └── model/                             # Modèles de données / Entités JPA
│   │   │       └── Hotel.java
│   │   └── resources/
│   │       ├── application.properties             # Configuration Spring Boot (DB, Port...)
│   │       └── templates/                         # Vues Thymeleaf (HTML)
│   │           ├── contact.html
│   │           ├── hotel_details.html
│   │           ├── hotels.html
│   │           ├── index.html
│   │           ├── login.html
│   │           └── reservation_form.html
├── pom.xml                                        # Fichier de configuration Maven
└── README.md                                      # Documentation du projet
