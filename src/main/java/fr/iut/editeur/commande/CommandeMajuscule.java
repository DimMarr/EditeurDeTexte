package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscule;start;end");
            return;
        }
        String start = parameters[1];
        String end = parameters[2];
        this.document.majuscules(Integer.parseInt(start),Integer.parseInt(end));
        super.executer();
    }
}
