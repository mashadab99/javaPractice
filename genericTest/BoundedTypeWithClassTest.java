package genericTest;

public class BoundedTypeWithClassTest <T extends Number>{
    public static void main(String args[]){
        BoundedTypeWithClassTest <Integer>ob1=new BoundedTypeWithClassTest<Integer>();
        BoundedTypeWithClassTest <Double>ob2=new BoundedTypeWithClassTest<Double>();
        /*Compile Time Error:
        java: type argument java.lang.String is not within bounds of type-variable T

        BoundedTypeWithClassTest <String>ob3=new BoundedTypeWithClassTest<String>();

         */
    }
}
