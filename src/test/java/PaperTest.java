import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void shouldStoreStringOnPaperWhenStoreTextIsCalled(){
        Paper paper = new Paper();
        String expectedStringToStore = "Happy Birthday";
        paper.storeText(expectedStringToStore);

        String spaceBetweenStrings = " ";
        assertEquals(expectedStringToStore + spaceBetweenStrings, paper.getText());
    }

    @Test
    public void shouldAppendStringOnPaperWhenStoredTextIsCalled(){
        Paper paper = new Paper();
        String expectedString1 = "Random Words";
        paper.storeText(expectedString1);

        String expectedString2 = "placed here";
        paper.storeText(expectedString2);

        String spaceBetweenText = " ";
        assertEquals(expectedString1 + spaceBetweenText + expectedString2 + spaceBetweenText, paper.getText());
    }



}