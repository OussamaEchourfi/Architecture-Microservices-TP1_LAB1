package com.example.presentation;

import com.example.dao.DaoImpl;
import com.example.metier.MetierImpl;

/**
 * Présentation 1 : Instanciation statique (Couplage fort).
 * Les dépendances sont créées directement avec l'opérateur 'new'.
 */
public class Presentation1 {

    public static void main(String[] args) {
        /*
         * Injection de dépendances par instanciation statique.
         * Inconvénient : Couplage fort. Pour changer l'implémentation de IDao,
         * il est obligatoire de modifier le code source de cette classe.
         */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();

        // Injection de la dépendance via le setter
        metier.setDao(dao);

        // Exécution du calcul métier
        double resultat = metier.calcul();
        System.out.println("Résultats (statique) = " + resultat);
    }
}
