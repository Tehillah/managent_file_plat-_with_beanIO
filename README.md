# Guide d'utilisation du programme

    Aller sur : creation-fichier-pla\src\main\resources
    - On y retrouve des répertoires : BAP, BAPRF, FLUX, INPUT et RF
    - Supprimer ces répertoires sauf INPUT
    
    Aller sur : creation-fichier-pla\src\main\resources\input
    - Dans les fichiers .csv, dans les "Bannière", modifier la date par exemple
    
    Aller sur : creation-fichier-pla\src\main\java\fr\scnf\lanceur
    - On y retrouve les fichiers : lanceurBAP.java, lanceurBAPRF.java, lanceurFinal.java et lanceurRF.java
    - Modifier la date qui se trouve à la fin de la ligne BeanWriter au niveau de la première boucle "for"
    - Lancer le RUN en cliquant sur le bouton vert blanc
    - Vérifier que les répertoires BAP, BAPRF, FLUX et RF réapparaissent dans : creation-fichier-pla\src\main\resources
    - Consulter les contenus des fichiers et corriger si d'éventuelles erreurs s'y trouvent
    - Intégrer les fichiers dans SAT et poursuivre les tests de bout-en-bout intra-filière
