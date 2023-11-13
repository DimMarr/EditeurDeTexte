package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;start;end;texte");
            return;
        }
        String texte = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]) ,Integer.parseInt(parameters[2]),texte);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("=== Remplacer ===");
        System.out.println("La commande ajouter se présente sous la forme: remplacer;début;fin;texte");
        System.out.println("Elle permet de remplacer le texte pas le texte indiqué entre le début et la fin");
    }

}
