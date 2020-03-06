public class Graphite {

    public int totalGraphiteLevel;
    public int pointLevel;

    public Graphite(){
        this.totalGraphiteLevel = 100;
        this.pointLevel = 20;
    }

    public void use() {
        this.totalGraphiteLevel--;
        this.pointLevel--;
    }
}
