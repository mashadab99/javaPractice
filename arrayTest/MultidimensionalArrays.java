package arrayTest;

/**
 * Multidimensional Array in Java
 * In such case, data is stored in row and column based index (also known as matrix form).
 * ***/
public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] twoD = {{1,2,3},{2,4,5},{4,4,5}};


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
