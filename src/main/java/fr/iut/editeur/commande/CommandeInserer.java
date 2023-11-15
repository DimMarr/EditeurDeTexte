package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeInserer représente une commande pour insérer du texte à un index spécifié dans un document.
 */
public class CommandeInserer extends CommandeDocument {

    /**
     * Constructeur de la commande Inserer.
     *
     * @param document   Le document sur lequel la commande agit.
     * @param parameters Les paramètres de la commande, le deuxième paramètre est l'index et le troisième est le texte à insérer.
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande Inserer en insérant le texte à l'index spécifié dans le document.
     */
    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;texte");
            return;
        }
        String index = parameters[1];
        this.document.inserer(Integer.parseInt(index), parameters[2]);
        super.executer();
    }

    /**
     * Obtient la description de la commande Inserer.
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Inserer ===");
        System.out.println("La commande Inserer se présente sous la forme : inserer;index;texte");
        System.out.println("Elle permet d'insérer le texte à l'index indiqué.");
    }
}
