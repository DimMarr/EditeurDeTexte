package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String textMaj =  texte.substring(start,end).toUpperCase();
        remplacer(start,end,textMaj);
    }
    public void minuscules(int start, int end) {
        String textMin =  texte.substring(start,end).toLowerCase();
        remplacer(start,end,textMin);
    }
    public void inserer(int index,String inserer){
        String leftPart = texte.substring(0,index);
        String rightPart = texte.substring(index);
        texte = leftPart + inserer + rightPart;
    }
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }
    public void clear(){
        texte = "";
    }
    @Override
    public String toString() {
        return this.texte;
    }
}
