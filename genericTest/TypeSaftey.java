package genericTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TypeSaftey {
    public static void main(String args[]){
        String []myStringArray=new String[10];
        myStringArray[0]="Ashif";
        myStringArray[1]="Shadab";
        myStringArray[2]=new String("Raja");
        /*myStringArray[3]=new Integer(10);
        Compile time Error
        Incompatible types.Found:'java.lang.Integer',required:'java.lang.String*/
        System.out.println("Printing Element of Array");
        for(int i=0;i<myStringArray.length;i++){
            System.out.println(myStringArray[i]);
        }

        ArrayList myArrayList=new ArrayList();
        myArrayList.add("Ashif");
        myArrayList.add("Shadab");
        myArrayList.add(new String("Raja"));
        myArrayList.add(new Integer(10));

        System.out.println("Printing Element of ArrayList");
        for(int i=0;i<myArrayList.size();i++){
            String elemnet=(String) myArrayList.get(i);
            /**Got Runtime Exception ClassCastException on new Integer(10)*/
            System.out.println(elemnet);
        }

        ArrayList<String> al=new ArrayList<String>();
        List<String>li=new ArrayList<String>();
        Collection<String>coll=new ArrayList<String>();
        /*Compile time Error
        Incompatible types.Found:'java.util.ArrayList<java.lang.String>',
        required:'java.lang.Object
        ArrayList<Object>all=new ArrayList<String>();*/

        /*Compile time Error
        Unexpected type
        found:int, required:reference

        ArrayList<int> alb=new ArrayList<int>();*/
    }
}
