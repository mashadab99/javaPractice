package arrayTest;

/**
 * Cloning an Array in Java
 * Since, Java array implements the Cloneable interface,
 * we can create the clone of the Java array.
 * If we create the clone of a single-dimensional array,
 * it creates the deep copy of the Java array.
 * It means, it will copy the actual value.
 * But, if we create the clone of a multidimensional array,
 * it creates the shallow copy of the Java array which means it copies the references.
 * ***/
public class CloningArray {

    public static void main(String args[]){
        singleDimensionalArrayClonningTest();

        //twoDimensionalArrayClonningTest();
    }

    private static void twoDimensionalArrayClonningTest() {

        int twoD[][]={{1,2,3},{2,4,5},{4,4,5}};
        int clonetwoD[][]=twoD.clone();
        //isEqual(twoD, clonetwoD);
        shallowOrDeepCopy(twoD, clonetwoD);
    }

    private static void shallowOrDeepCopy(int[][] twoD, int[][] clonetwoD) {
        printTwoD(twoD,"Printing original array:");
        twoD[1][1]=67;
        printTwoD(clonetwoD,"Printing clone of the array:");
    }

    private static void isEqual(int[][] twoD, int[][] clonetwoD) {
        printTwoD(twoD,"Printing original array:");
        printTwoD(clonetwoD,"Printing clone of the array:");
        System.out.println("Are both equal?");
        System.out.println(twoD == clonetwoD);
    }

    private static void printTwoD(int[][] twoD,String msg) {
        System.out.println(msg);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void singleDimensionalArrayClonningTest() {
        int arr[]={33,3,4,5};
        int carr[]=arr.clone();
        //isEqual(arr, carr);

        shallowOrDeepCopy(arr, carr);

    }

    private static void isEqual(int[] arr, int[] carr) {
        print(arr,"Printing original array:");
        print(carr,"Printing clone of the array:");
        System.out.println("Are both equal?");
        System.out.println(arr == carr);
    }

    private static void shallowOrDeepCopy(int[] arr, int[] carr) {
        print(arr,"Printing original array:");
        arr[1]=55;
        print(carr,"Printing clone of the array:");
    }

    private static void print(int[] arr,String msg) {
        System.out.println(msg);
        for (int i : arr)
            System.out.print("\t"+i);
        System.out.println("");
    }
}
