package arrayTest;
/**
 * Java Array: Pass by reference
 * Arrays are passed to functions by reference, or as a pointer to the original.
 * This means anything you do to the Array inside the function affects the original.
 * ***/
public class ArrayPassByReference {
    public static void main(String args[]){
        String[]myArray={"Ashif","Shadab","Raja"};
        System.out.println("Orginal Array");
        print(myArray);
        passByReference(myArray);
        System.out.println("Array after Modification");
        print(myArray);
    }

    private static void print(String[] myArray) {
        for (String element: myArray) {
            System.out.print("\t"+element);
        }
        System.out.println("");
    }

    private static void passByReference(String[] myArray) {
        myArray[1]="Rohit";
    }
}
