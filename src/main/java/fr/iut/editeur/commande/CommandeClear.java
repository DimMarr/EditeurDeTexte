package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeClear représente une commande pour effacer tout le texte d'un document.
 */
public class CommandeClear extends CommandeDocument {

    /**
     * Constructeur de la commande Clear.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande (il ne devrait pas y avoir de paramètres pour la commande Clear).
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande Clear en supprimant tout le texte du document.
     */
    @Override
    public void executer() {
        if (parameters.length > 1) {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }

    /**
     * Obtient la description de la commande Clear.
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Clear ===");
        System.out.println("La commande clear se présente sous la forme : clear");
        System.out.println("Elle permet de supprimer tout le texte déjà écrit.");
    }
}
