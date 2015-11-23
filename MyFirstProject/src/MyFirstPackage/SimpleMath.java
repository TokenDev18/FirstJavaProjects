package MyFirstPackage;

/**
 * Created by aaron on 10/20/15.
 */
public class SimpleMath {

    private int num2;
    private int num1 = 0;
    private int num3 = 5;
    private int userNum1 = 0;
    private int userNum2;

    public void addFour(){
        for(int i = 1; i <= 6; i++){
            num2 = i;
            num2 += num1;
            System.out.print(" " + num2);
            num1 += 3;
        }
    }

    public void figureItOut(){
        for(int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                num1 += num3;
                System.out.print(" " + num1);
            } else {
                //int num1 = 0;
                num2 = num1;
                num2 += num3;
                System.out.print(" " + num2);

            }
        }
    }

    public int addForMultiply(int userNum1, int userNum2) {
        int num4 = 0;
        for(int i = 1; i <= userNum2; i++){
            num4 += userNum1;
            //System.out.print(" " + num4);
        }
        return num4;
     }

    public boolean isPrime(int num1){
        boolean trueOrFalse = true;
        for(int i = 2; i < num1; i++){
            if(num1 % i == 0){
                //System.out.println(i);
                trueOrFalse = false;
                break;
            } else {
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }
}
