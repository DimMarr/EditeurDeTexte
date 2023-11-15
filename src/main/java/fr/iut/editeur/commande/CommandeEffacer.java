package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeEffacer représente une commande pour effacer une partie spécifiée du texte d'un document.
 */
public class CommandeEffacer extends CommandeDocument {

    /**
     * Constructeur de la commande Effacer.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande, le deuxième paramètre est le point de départ et le troisième est le point de fin.
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande Effacer en supprimant le texte entre les points de départ et de fin spécifiés dans le document.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : effacer;start;end");
            return;
        }
        String start = parameters[1];
        String end = parameters[2];
        this.document.effacer(Integer.parseInt(start), Integer.parseInt(end));
        super.executer();
    }

    /**
     * Obtient la description de la commande Effacer.
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Effacer ===");
        System.out.println("La commande effacer se présente sous la forme : effacer;départ;fin");
        System.out.println("Elle permet d'effacer le texte entre le départ et la fin indiquée.");
    }
}
