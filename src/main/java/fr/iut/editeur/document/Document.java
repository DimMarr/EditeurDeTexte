package fr.iut.editeur.document;

/**
 * La classe Document représente un document textuel avec des opérations de manipulation de texte.
 */
public class Document {

    private String texte;

    /**
     * Constructeur par défaut qui initialise le texte à une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Obtient le texte actuel du document.
     *
     * @return Le texte du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Modifie le texte du document.
     *
     * @param texte Le nouveau texte à définir.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     *
     * @param texte Le texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace une partie du texte du document.
     *
     * @param start        Index du début à remplacer.
     * @param end          Index de fin à remplacer.
     * @param remplacement Texte de remplacement.
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Convertit une partie du texte en majuscules.
     *
     * @param start Index du début de la conversion.
     * @param end   Index de fin de la conversion.
     */
    public void majuscules(int start, int end) {
        String textMaj = texte.substring(start, end).toUpperCase();
        remplacer(start, end, textMaj);
    }

    /**
     * Convertit une partie du texte en minuscules.
     *
     * @param start Index du début de la conversion.
     * @param end   Index de fin de la conversion.
     */
    public void minuscules(int start, int end) {
        String textMin = texte.substring(start, end).toLowerCase();
        remplacer(start, end, textMin);
    }

    /**
     * Insère du texte à une position spécifique dans le document.
     *
     * @param index   Index où insérer le texte.
     * @param inserer Texte à insérer.
     */
    public void inserer(int index, String inserer) {
        String leftPart = texte.substring(0, index);
        String rightPart = texte.substring(index);
        texte = leftPart + inserer + rightPart;
    }

    /**
     * Efface une partie du texte du document.
     *
     * @param start Index du début à effacer.
     * @param end   Index de fin à effacer.
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface tout le texte du document.
     */
    public void clear() {
        texte = "";
    }

    /**
     * Retourne une représentation textuelle du document.
     *
     * @return Le texte du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
