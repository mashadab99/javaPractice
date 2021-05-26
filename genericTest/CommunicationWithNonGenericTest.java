package genericTest;

import java.util.ArrayList;

public class CommunicationWithNonGenericTest {
    public static void main(String args[]){
        ArrayList<String>arrayList=new ArrayList<String>();
        arrayList.add("Ashif");
        arrayList.add("shadab");
        //arrayList.add(new Integer(10));
        nonGenericMethod(arrayList);
        //arrayList.add(new Integer(20));
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    private static void nonGenericMethod(ArrayList arrayList) {
        arrayList.add("Ram");
        arrayList.add(new Integer(10));//Behaviour change it is working like non generic
    }
}
