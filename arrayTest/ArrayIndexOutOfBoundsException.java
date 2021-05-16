package arrayTest;
/**
 * The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException
 * if length of the array in negative, equal to the array size or greater than the array size
 * while traversing the array.
 * **/
public class ArrayIndexOutOfBoundsException {
    public static void main(String args[]){
        int arr[]={50,60,70,80};
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
