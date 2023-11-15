package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeMajuscule représente une commande pour convertir en majuscules une partie spécifiée du texte d'un document.
 */
public class CommandeMajuscule extends CommandeDocument {

    /**
     * Constructeur de la commande Majuscule.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande, le deuxième paramètre est le point de départ et le troisième est le point de fin.
     */
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande Majuscule en convertissant en majuscules le texte entre les points de départ et de fin spécifiés dans le document.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : majuscule;start;end");
            return;
        }
        String start = parameters[1];
        String end = parameters[2];
        this.document.majuscules(Integer.parseInt(start), Integer.parseInt(end));
        super.executer();
    }

    /**
     * Obtient la description de la commande Majuscule.
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Majuscule ===");
        System.out.println("La commande majuscule se présente sous la forme : majuscule;départ;fin");
        System.out.println("Elle permet de mettre en majuscule le texte entre le départ et la fin.");
    }
}
