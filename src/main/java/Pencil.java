public class Pencil {

    public Paper paperToWriteOn;

    public void write(String expectedStringToStore) {
        this.paperToWriteOn.storeText(expectedStringToStore);
    }
}
