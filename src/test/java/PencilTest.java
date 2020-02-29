
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PencilTest {

    @Test
    public void shouldStoreStringOnPaperWhenWriteIsCalled(){
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        pencil.paperToWriteOn = paper;
        String expectedStringToStore = "Bonjour";

        pencil.write(expectedStringToStore);

        String blankSpace = " ";
        assertEquals(expectedStringToStore + blankSpace, paper.getRawText());
    }

}