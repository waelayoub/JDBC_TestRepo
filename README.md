# JDBC_TestRepo
testing jdbc on a local database using mysql


1)	Il faut d’abord spécifier l’url de la base de donne que je veux connecter dans mon cas c’est MySQL 8.0.32 donc
pour cela j’ai au début jdbc:myql puis c’est dans le local host et MySQL utilise le port 3306 pour cela on a //localhost:3306 
et enfin le nom de notre BDD. Après cela on ajoute le user est le password que j’ai effacer maintenant.

2)	Class.forName (…) est utiliser pour enregistrer le driver (Dans mon cas c’est le jconnector 8.0.32)
de classpath (ensemble de répertoire que le java runtime utilise quand il installe les classes) dans la mémoire.
Cette commande n’est pas obligatoire car depuis jdbc 4.0 venant de java 6 cela se fait automatiquement si le driver est dans classpath.
Il faut juste être sure qu’on l’a ajouter dans classpath (en utilisant la ligne de commande on doit le spécifier dans l’exécution 
par ex : "java -cp ./mysql-connector-j-8.0.32/mysql-connector-j-8.0.32.jar trying.java”

3)	Connection fait la connexion avec la BDD en utilisant les paramètre comme url user et pass. 
Statement vas exécuter les Querry et le résultat va être dans un objet ResultSet
qu’on va itérer pour prendre les informations les convertir en java class comme int et String et les afficher. 

NB : la fermeture de connection et de statement doit se faire explicitement.

<img width="304" alt="image" src="https://user-images.githubusercontent.com/64162771/215298077-132fd92f-cc7b-43f6-9e1b-5616a0afea4d.png">

<img width="468" alt="image" src="https://user-images.githubusercontent.com/64162771/215298132-fea8c9f4-0e04-49a1-9c49-7e91bd4aae18.png">
