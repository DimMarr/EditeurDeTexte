package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;start;end");
            return;
        }
        String start = parameters[1];
        String end = parameters[2];
        this.document.effacer(Integer.parseInt(start),Integer.parseInt(end));
        super.executer();
    }
    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Effacer ===");
        System.out.println("La commande effacer se présente sous la forme: effacer;départ;fin");
        System.out.println("Elle permet d'éffacer le texte entre le départ et la fin indiquée");
    }
}
