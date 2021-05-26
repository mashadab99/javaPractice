package genericTest;
import java.io.Serializable;
//Valid:-
public class BoundedTypeTest <T extends Number & Runnable> {



//Valid multiple inheritance allowed with help of interface
// public class BoundedTypeTest <T extends Number & Runnable & Serializable> {

//Invalid Multiple inheritance not allowed with help of class
//public class BoundedTypeTest <T extends Number & Thread> {

//Invalid Order class will be first then Interface
//public class BoundedTypeTest <T extends Runnable & Number> {
    public static void main(String args[]){

    }
}
