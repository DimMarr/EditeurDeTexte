package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeAjouter représente une commande pour ajouter du texte à un document.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la commande Ajouter.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande, le deuxième paramètre est le texte à ajouter.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande Ajouter en ajoutant le texte spécifié au document.
     */
    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    /**
     * Obtient la description de la commande Ajouter.
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Ajouter ===");
        System.out.println("La commande ajouter se présente sous la forme : ajouter;texte");
        System.out.println("Elle permet d'ajouter du texte, tout simplement...");
    }

}
