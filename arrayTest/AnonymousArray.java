package arrayTest;
/**
 * Java supports the feature of an anonymous array,
 * so you don't need to declare the array while passing an array to the method.
 * **/
public class AnonymousArray {
    public static void main(String args[]){
        printArray(new int[]{10,22,44,66});//passing anonymous array to method
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print("\t"+arr[i]);
    }
}
