import java.util.ArrayList;

public class Paper {

    public ArrayList<String> storedText = new ArrayList<>();

    public void storeText(String stringToStore) {
        this.storedText.add(stringToStore);
    }

    public String getText() {
        String rawText = "";

        for (String text : this.storedText) {
            rawText += text + " ";
        }
        return rawText;
    }
}
