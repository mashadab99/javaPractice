package genericTest;

import java.util.ArrayList;

public class GenericMethodTest {

    public static void main(String args[]){

        GenericMethodTest genericMethodTest=new GenericMethodTest();

        ArrayList<String>stringlist=new ArrayList<String>();
        stringlist.add("Ashif");
        //Compile Time Error: java.util.ArrayList cannot be applied to 'java.lang.Integer
        //stringlist.add(new Integer(10));
        //genericMethodTest.print(stringlist);
        ArrayList<Integer>integersList=new ArrayList<Integer>();
        genericMethodTest.print(integersList);

        assignmentTest();
    }

    private static void assignmentTest() {

        ArrayList<? super String>al=new ArrayList<Object>();//valid
        /**Invalid
         * rror: unexpected type
         *         ArrayList<?>al1=new ArrayList<?>();
         *                                      ^
         *   required: class or interface without bounds
         *   found:    ?

        ArrayList<?>al1=new ArrayList<?>();
         */

        /**
         * Invalid
         * error: unexpected type
         *        ArrayList<?>al2=new ArrayList<? extends Number>();
         *                                     ^
         *   required: class or interface without bounds
         *   found:    ? extends Number

        ArrayList<?>al2=new ArrayList<? extends Number>();
         */

    }

    public void print(ArrayList<? extends Number>list){
        //list.add(new Double(10.9));
    }
    /*public void print(ArrayList<?>list){
        //adding element before print
        //Compile Time error: no suitable method found for add(String)
        //list.add("Shadab");
        list.add(null);

    }*/

    /*public void print(ArrayList<String>list){
        //adding element before print
        list.add("Shadab");
        list.add(null);
        stringlist.add(new Integer(10));
        for (String element:list) {
            System.out.println(element);
        }
    }*/
}
