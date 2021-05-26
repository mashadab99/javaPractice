package genericTest;

public class BoundedTypeWithInterfaceTest <T extends Runnable>{
    public static void main(String args[]){

        BoundedTypeWithInterfaceTest<Runnable>ob=new BoundedTypeWithInterfaceTest<Runnable>();
        BoundedTypeWithInterfaceTest<Thread>ob1=new BoundedTypeWithInterfaceTest<Thread>();
        /*Compile Time Error
        java: type argument java.lang.Integer is not within bounds of type-variable T
        BoundedTypeWithInterfaceTest<Integer>ob2=new BoundedTypeWithInterfaceTest<Integer>();
        */

    }
}
