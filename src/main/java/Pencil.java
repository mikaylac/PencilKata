import java.util.ArrayList;

public class Pencil {

    public Paper paperToWriteOn;
    public Graphite pencilLead;

    public void write(String expectedStringToStore) {
        this.paperToWriteOn.writtenText += expectedStringToStore;
        dullPencil(expectedStringToStore);
    }

    public void dullPencil(String stringToStore){
        for(int i = 0; i < stringToStore.length(); i++){
            if(stringToStore.charAt(i) != ' ' && Character.isUpperCase(stringToStore.charAt(i))){
                this.pencilLead.pointLevel --;
                this.pencilLead.pointLevel --;
            } else if(stringToStore.charAt(i) != ' ' && Character.isLowerCase(stringToStore.charAt(i))){
                this.pencilLead.pointLevel --;
            }
        }

        }

    }

