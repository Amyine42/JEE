# JEE
TP1 (inversion_controle): Injection des dépendances
Dans ce TP, j'ai créé une interface IDAO une méthode getDate pour récuperer la date. Par la suite j'ai créé l'interface IMetier comportant une méthode calcul. J'ai utilisé le couplage faible pour implémenter ces interfaces (dépendance entre classe et interface), je n'ai pas besoin de modifier le code source à chaque maintenance car la classe peut travailler avec n'importe quelle classe qui implémente l'interface. De ce fait, l'application est ouverte à l'extension et fermée à la modification. Pour l'injection des dépendances, je l'ai fais par instanciation statique, qui code les dépendances directement, et par instanciation dynamique, qui les code en dehors du code source. Finalement, j'ai utilisé le framework Spring pour la gestion des dépendances.

TP2 (hospital_tp2): ORM JPA HIbernate Spring Data
Dans ce TP, j'ai créé un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock sur IntelliJ Ultimate. J'ai créé les entités Patient, Medecin, RendezVous, StatusRDV et Consultation avec des attributs pour chacun et des relations @ManyToOne, @OneToMany et @OneToOne. Configuration de l'unité de persistance dans le ficher application.properties et création l'interface JPA Repository basée sur Spring data.
Tests opérations CRUD et migration de H2 Database vers MySQL.

TP3 (Part1): Spring MVC
Le but de ce TP est de créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application permet d'afficher les patients avec pagination pour un grand nombre de patients, chercher les patients avec un système de recherche rapide et la suppression rapide d'un patient.
