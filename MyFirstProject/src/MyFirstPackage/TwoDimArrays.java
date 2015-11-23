package MyFirstPackage;

/**
 * Created by aaron on 10/26/15.
 */
public class TwoDimArrays {
    private int[][] arrayOne;
    private double[][] arrayTwo;
    private String[][][] arrayThree;

    public void populateArrayOne() {
        arrayOne = new int[3][7];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = 14;
                System.out.println(arrayOne[i][j]);
            }
        }
    }

    public void populateArrayTwo() {
        arrayTwo = new double[5][10];
        for (int i = 0; i < arrayTwo.length; i++){
            for(int j = 0; j < arrayTwo[i].length; j++){
                arrayTwo[i][j] = 34.5d;
                System.out.println(arrayTwo[i][j]);
            }
        }
    }

    public void populateArrayThree(){
        arrayThree = new String[4][5][6];
        for(int i = 0; i < arrayThree.length; i++){
            for(int j = 0; j < arrayThree[i].length; j++){
                for(int h = 0; h < arrayThree[i][j].length; h++){
                    arrayThree[i][j][h] = "Well Hello There!";
                    System.out.println(arrayThree[i][j][h]);
                }
            }
        }
    }
}