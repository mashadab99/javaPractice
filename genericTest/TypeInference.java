package genericTest;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static void main(String args[]){
        List<String> arrayList= new ArrayList<>();
        arrayList.add("Ashif");
        arrayList.addAll(new ArrayList<>());

        List<? extends TypeInference> arrayList1= new ArrayList<>();
        //arrayList1.add(new String("Ashif"));
        arrayList1.addAll(new ArrayList<>());
       // arrayList1.addAll(new ArrayList<String>());

    }


}


