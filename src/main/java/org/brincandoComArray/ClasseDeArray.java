package org.brincandoComArray;
import java.util.ArrayList;

public class ClasseDeArray {
    ArrayList arrayList = new ArrayList<>();
    Integer a = 0;

    public void populate(){
        do {
            arrayList.add(a);
            a++;
        }
        while(a<10);
    }

    public ArrayList getArray(){
        return arrayList;
    }
}
