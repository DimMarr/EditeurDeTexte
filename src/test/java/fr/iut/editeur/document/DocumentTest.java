package fr.iut.editeur.document;
import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTest {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Hello, World!");
        document.remplacer(7, 12, "Universe");
        assertEquals("Hello, Universe!", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("abc");
        document.majuscules(0, 2);
        assertEquals("ABc", document.getTexte());
    }

    @Test
    public void testMinuscules() {
        Document document = new Document();
        document.setTexte("XYZ");
        document.minuscules(0, 2);
        assertEquals("xyZ", document.getTexte());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.setTexte("Hello");
        document.inserer(5, ", World!");
        assertEquals("Hello, World!", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.setTexte("Hello, World!");
        document.effacer(5, 12);
        assertEquals("Hello!", document.getTexte());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.setTexte("Hello, World!");
        document.clear();
        assertEquals("", document.getTexte());
    }

    @Test
    public void testToString() {
        Document document = new Document();
        document.setTexte("Hello, World!");
        assertEquals("Hello, World!", document.toString());
    }
}

