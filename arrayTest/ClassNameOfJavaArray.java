package arrayTest;

/**
 * In Java, an array is an object.
 * For array object, a proxy class is created whose name can be obtained
 * by getClass().getName() method on the object.
 * **/
public class ClassNameOfJavaArray {
    public static void main(String args[]){
        int arr[]={4,4,5};
        //String arr[]={"Ashif","Shadab"};
        Class classObj= arr.getClass();
        getArrayClassName(classObj);
    }

    private static void getArrayClassName(Class classObj) {
        //printting the class name of Java array
        System.out.println(classObj.getName());
    }
}
