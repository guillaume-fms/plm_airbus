# plm_airbus

Travail individuel, sans utiliser la programmation orientée objet pour l’instant et en générant
dorénavant la javado.

Vous devez réaliser une appli de gestion du cycle de vie d’avions Airbus. Un avion est caractérisé
par son identifiant unique, son programme (A320, A400M, A380, A300...), sa phase actuelle (étude
de faisabilité, conception, définition, construction, en service, clôturé), son type (Fret, transport
passager, militaire, avions d’affaires...)
Mais avant tout, vous devez vous imprégner du plm d’airbus aussi, je vous invite à lire le
doc : « PLM pour les nuls ». De plus, vous devrez utiliser des noms de variables en anglais.

1/ Votre application doit permettre d’afficher tous les avions (id, programme, phase, type) si
l’utilisateur le souhaite.

  - Trouver plusieurs moyens de les afficher (j’en ai trouvé 5)
  - Vous devez gérer les saisies erronées ?
  
2/ Rechercher une liste d’avions à partir d’un mot clé affichant tous les avions dont le programme
contient par ex la lettre A ou 320 ou A350...

3/ Votre application doit permettre d’ajouter(acheter) des pièces pour un avion donné
Une pièce est caractérisée par : nom, catégorie, prix
Delors dans le menu principal, afficher un avion donnera : id, programme, phase, type,
nomPièce1, nomPièce2, ...

4/ Votre appli permet de supprimer une pièce pour un avion, suite à une erreur par ex.

5/ Afficher les infos détaillées d’un avion revient à afficher toutes les pièces d’un avion donné.
