package com.example.dao;

/**
 * Interface de persistance.
 * Définit le contrat pour récupérer une valeur numérique.
 */
public interface IDao {

    /**
     * Récupère la valeur depuis la source de données.
     * @return La valeur double récupérée.
     */
    double getValue();

    /**
     * Méthode conforme au diagramme de classes UML.
     * Redirige par défaut vers getValue() pour assurer la compatibilité.
     * @return La valeur double récupérée.
     */
    default double getData() {
        return getValue();
    }
}
