package arrayTest;

public class Array {
    public static void main(String args[]){
        int[] myArray = arrayDeclartions();
        print(myArray);
    }

    private static int[] arrayDeclartions() {
        /**
         * basic syntax for array declaration.
         * dataType[] arrayName;
         * dataType: this can be any Java object or primitive data type
         * (such as int, byte, char, boolean, etc.)
         * arrayName: this is an identifier so you can access the array
         * **/
        int[] myArray={12,14,0,54,32};

        /** More Ways*/
        //int myArray[]={12,14,0,54,32};
        //int[] myArray = new int[5];

        /*int[] myArray;
        myArray = new int[5];*/

        return myArray;
    }

    private static int[] arrayDeclartionsAndInitilation(){
        //initialize arrays during declaration
        //int[] myArray={12,14,0,54,32};
        //Declare First and later initialize
        int[] myArray=new int[5]; ;
        myArray[0]=12;
        myArray[1]=14;
        myArray[2]=0;
        myArray[3]=54;
        myArray[4]=32;

        return myArray;
    }

    private static void print(int[] myArray) {
        System.out.println("Array Elements are:-");
        for(int i = 0; i< myArray.length; i++){
            System.out.print("\t"+ myArray[i]);
        }
    }
}
