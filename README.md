# JEE
TP1 (inversion_controle): Injection des dépendances
Dans ce TP, j'ai créé une interface IDAO une méthode getDate pour récuperer la date. Par la suite j'ai créé l'interface IMetier comportant une méthode calcul. J'ai utilisé le couplage faible pour implémenter ces interfaces (dépendance entre classe et interface), je n'ai pas besoin de modifier le code source à chaque maintenance car la classe peut travailler avec n'importe quelle classe qui implémente l'interface. De ce fait, l'application est ouverte à l'extension et fermée à la modification. Pour l'injection des dépendances, je l'ai fais par instanciation statique, qui code les dépendances directement, et par instanciation dynamique, qui les code en dehors du code source. Finalement, j'ai utilisé le framework Spring pour la gestion des dépendances.

TP2 (hospital_tp2): ORM JPA HIbernate Spring Data
Dans ce TP, j'ai créé un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock sur IntelliJ Ultimate. J'ai créé les entités Patient, Medecin, RendezVous, StatusRDV et Consultation avec des attributs pour chacun et des relations @ManyToOne, @OneToMany et @OneToOne. Configuration de l'unité de persistance dans le ficher application.properties et création l'interface JPA Repository basée sur Spring data.
Tests opérations CRUD et migration de H2 Database vers MySQL.

![hospital_tp2_screen](https://github.com/Amyine42/JEE/assets/132317090/1e8023c6-5b0c-4dd9-9d20-655268956ff5)

TP3 (Part1): Spring MVC
Le but de ce TP est de créer une application Web JEE basée sur Spring MVC, Thymeleaf et Spring Data JPA qui permet de gérer les patients. L'application permet d'afficher les patients avec pagination pour un grand nombre de patients, chercher les patients avec un système de recherche rapide et la suppression rapide d'un patient.

![tp3_screen](https://github.com/Amyine42/JEE/assets/132317090/70dd74a8-83ce-42b6-988b-199ea98743ed)

(Part 2)
Nous avons créé une page template, grâce à la dépendance thymeleaf layout dialect et bootstrap pour le style css, qui nous permet de saisir et créer un patient. Ensuite nous avons validé le formulaire grâce à la dépendance Spring boot validation aux annotations de validations pour donner des contraintes au formulaire. On a utilisé th:errors afin d'afficher les messages d'erreur associés à un champ spécifique. On a créé un bouton Edit pour modifier les données du patient.
![tp3jee1](https://github.com/Amyine42/JEE/assets/132317090/df47bdf7-835e-44b4-8964-c89038f049b4)

![tp3jee2](https://github.com/Amyine42/JEE/assets/132317090/dbb9b6ba-fe6f-42a3-aa81-ae08890fdf16)

![tp3jee3](https://github.com/Amyine42/JEE/assets/132317090/44ada016-b7ff-4036-994e-50b2cf2b76f2)

(Part 3)
Nous avons vu comment instaurer le système d'authentification basé sur Spring Security. Nous avons créé trois utilisateurs avec le rôle USER dont un ADMIN qui est le seul à pouvoir modifier, supprimer et enregistrer un patient. On a utilisé la stratégie JDBC Authentication qui permet de stocker les utilisateurs et les rôles dans une base de donnée relationnelle avec un accès JDBC. On a aussi utilisé UserDetailsService qui permet à Spring Security de chercher les utilisateurs à partir de la base de données.

![tp331](https://github.com/Amyine42/JEE/assets/132317090/421198d1-f192-4458-934c-6368bf0966f8)
Projet Digital Banking, Partie 1: Backend
Dans ce projet Spring Angular JWT de Digital Banking, nous souhaitons créer une application qui permet de gérer des comptes bancaires. Chaque compte appartient à un client. Un compte peut subir plusieurs opérations de type DEBIT ou CREDIT. Il existe deux types de comptes : Comptes courants et comptes épargnes.
Dans cette partie, nous avons créé un projet Spring Boot avec les entités JPA Customer, BankAccount, Saving Account, CurrentAccount, AccountOperation. Nous avons aussi créé les interfaces
JPA Repository basées sur Spring Data et testé la couche DAO.

![tp332](https://github.com/Amyine42/JEE/assets/132317090/50a0c535-2a75-49f8-be7a-e85c1eefba09)

![tp333](https://github.com/Amyine42/JEE/assets/132317090/663f7893-6658-44a3-bc5a-64f0bcec9889)


