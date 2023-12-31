package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe abstraite CommandeDocument implémente l'interface Commande et fournit une base pour les commandes agissant sur un document.
 */
public abstract class CommandeDocument implements Commande {

    /** Le document sur lequel la commande agit. */
    protected Document document;

    /** Les paramètres de la commande. */
    protected String[] parameters;

    /**
     * Constructeur de la classe CommandeDocument.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Exécute la commande en affichant le contenu actuel du document.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
