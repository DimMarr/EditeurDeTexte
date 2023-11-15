package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

/**
 * La classe CommandeFactory est une fabrique de commandes permettant de créer des instances de différentes commandes en fonction de leur nom.
 */
public class CommandeFactory {

    /** Instance unique de la fabrique de commandes. */
    private static CommandeFactory instance;

    /**
     * Obtient l'instance unique de la fabrique de commandes, en la créant si elle n'existe pas encore.
     *
     * @return L'instance de la fabrique de commandes.
     */
    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    /** Constructeur privé de la fabrique de commandes. */
    private CommandeFactory() {}

    /**
     * Crée une instance de commande en fonction de son nom, associant le document et les paramètres nécessaires.
     *
     * @param name       Le nom de la commande à créer.
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande.
     * @return Une instance de la commande correspondante, ou null si le nom de la commande n'est pas reconnu.
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscule(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document, parameters);
            case "inserer" : return new CommandeInserer(document, parameters);
            case "minuscules" : return new CommandeMinuscule(document, parameters);
            default: return null;
        }
    }

}
