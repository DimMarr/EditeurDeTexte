package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {


    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length > 1) {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Clear ===");
        System.out.println("La commande clear se présente sous la forme: clear");
        System.out.println("Elle permet de surppimer tout le texte déjà écrit");
    }

}
