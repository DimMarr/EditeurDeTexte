package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument{
    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscule;start;end");
            return;
        }
        String start = parameters[1];
        String end = parameters[2];
        this.document.minuscules(Integer.parseInt(start),Integer.parseInt(end));
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Minuscule ===");
        System.out.println("La commande majuscule se présente sous la forme : majuscule;départ;fin");
        System.out.println("Elle permet de mettre en majuscule le texte entre le départ et la fin.");
    }
}

