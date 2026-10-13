package com.example.metier;

import com.example.dao.IDao;

/**
 * Implémentation concrète de l'interface IMetier.
 * Dépend d'une instance d'IDao pour récupérer les données.
 */
public class MetierImpl implements IMetier {

    // Dépendance injectable
    private IDao dao;

    /**
     * Constructeur sans argument (requis pour l'instanciation dynamique).
     */
    public MetierImpl() {
    }

    /**
     * Constructeur avec argument (pour l'injection de dépendances par constructeur si nécessaire).
     * @param dao L'instance de IDao à injecter.
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    /**
     * Méthode d'injection de la dépendance.
     * Appelée dynamiquement par le conteneur de chargement.
     * @param dao L'instance de IDao à injecter.
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        if (dao == null) {
            throw new IllegalStateException("Le DAO n'a pas été injecté.");
        }

        // Récupère la valeur depuis le DAO
        double valeurBase = dao.getValue();

        // Logique métier : double la valeur
        double resultat = valeurBase * 2;

        System.out.println("[METIER] Calcul effectué. Résultat : " + resultat);
        return resultat;
    }
}
