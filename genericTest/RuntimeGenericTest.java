package genericTest;

import java.util.ArrayList;

public class RuntimeGenericTest {

    public static void main(String args[]){

        ArrayList arrayList=new ArrayList<String>();
        arrayList.add("Ashif");
        arrayList.add(true);
        arrayList.add(10);
        System.out.println(arrayList);

    }

    /**
     *
     * error: name clash: test(ArrayList<Integer>) and test(ArrayList<String>) have the same erasure
     *     public void test(ArrayList<Integer>arrayList){
     *                 ^
     * Note: RuntimeGenericTest.java uses unchecked or unsafe operations.
     * Note: Recompile with -Xlint:unchecked for details.
     * 1 error
     *
    public void test(ArrayList<String>arrayList){

    }

    public void test(ArrayList<Integer>arrayList){

    }
     */
}
