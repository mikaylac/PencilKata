
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class PencilTest {

    @Test
    public void shouldAppendStringToPaperWhenWriteIsCalled() {
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        Graphite graphite = new Graphite();
        pencil.paperToWriteOn = paper;
        pencil.pencilLead = graphite;
        String expectedStringToStore = "Bonjour";

        pencil.write(expectedStringToStore);
        assertEquals(expectedStringToStore, paper.writtenText);

        pencil.write(" World");
        String expectedAppendedString = "Bonjour World";
        assertEquals(expectedAppendedString, paper.writtenText);
    }

    @Test
    public void shouldDegradePointDurabilityByOneForEachLowerCaseLetter() {
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        Graphite graphite = new Graphite();
        pencil.paperToWriteOn = paper;
        pencil.pencilLead = graphite;
        int expectedPointDurabilityAfterWriting = 10;

        pencil.write("hello world");

        assertEquals(expectedPointDurabilityAfterWriting, pencil.pencilLead.pointLevel);
    }

    @Test
    public void shouldDegradePointDurabilityByTwoForEachUpperCaseLetter(){
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        Graphite graphite = new Graphite();
        pencil.paperToWriteOn = paper;
        pencil.pencilLead = graphite;
        int expectedPointDurabilityAfterwriting = 8 ;

        pencil.write("Hello World");

        assertEquals(expectedPointDurabilityAfterwriting, pencil.pencilLead.pointLevel);

    }
    
}