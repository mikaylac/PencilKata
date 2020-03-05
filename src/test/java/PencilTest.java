
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PencilTest {

    @Test
    public void shouldAppendStringToPaperWhenWriteIsCalled(){
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        pencil.paperToWriteOn = paper;
        String expectedStringToStore = "Bonjour";

        pencil.write(expectedStringToStore);
        assertEquals(expectedStringToStore, paper.writtenText);

        pencil.write(" World");
        String expectedAppendedString = "Bonjour World";
        assertEquals(expectedAppendedString, paper.writtenText);
    }

}