package MyFirstPackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by aaron on 10/22/15.
 */
public class ArrayOfThings {

    public void classScores() {
        int sumOfScores = 0;
        int passedCount = 0;
        int failedCount = 0;
        int[] scores = {95, 56, 76, 63, 70, 87, 60};

        for(int i = 0; i < scores.length; i++){
            sumOfScores += scores[i];
            if(scores[i] < 65) {
                failedCount++;
            } else
                passedCount++;
        }
        float average = (float) sumOfScores / scores.length;
        System.out.println("Number of students passed is: " + passedCount);
        System.out.println("Number of students failed is: " + failedCount);
        System.out.println("The average of the scores is: " + average);
    }

    public void doubleTheArray(){
        double [] dubs = {12.34d, 35.90d, 120.34d, 108.54d, 110.44d, 51.54d, 89.84d, 78.34};

        for(int i = 0; i < dubs.length; i++){
            dubs[i] -= 10;
            System.out.print(" " + dubs[i]);
        }
    }

    public void arrayOfRandoms() {
        int[] random = new int[10];
        int highestNumber = 0;
        int lowestNumber = 100;

        for (int rn = 0; rn < random.length; rn++) {
            random[rn] = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println(random[rn]);
        }
            for(int k = 0; k < random.length; k++) {
                if(random[k] < lowestNumber) {
                    lowestNumber = random[k];
                } else if(random[k] > highestNumber) {
                    highestNumber = random[k];
                }
            }
        System.out.println("The highest number is: " + highestNumber);
        System.out.println("The smallest number is: " + lowestNumber);
    }

    public void stringOfArrays(){
        int maleCount = 0;
        int femaleCount = 0;
        String [] stringIt = new String[6];
        stringIt[0] = "John, 23yr old, male";
        stringIt[1] = "Jane, 33yr old, female";
        stringIt[2] = "Jacob, 55yr old, male";
        stringIt[3] = "Jessie, 27yr old, female";
        stringIt[4] = "Jordan, 77yr old, male";
        stringIt[5] = "Julian, 23yr old, male";

        for(int i = 0; i < stringIt.length; i++){
            if(stringIt[i].contains("female")){
                femaleCount++;
            }
        }
        System.out.println("The number of males are: " + (stringIt.length - femaleCount));
        System.out.println("The number of females are: " + femaleCount);
    }

    public void connectTheNames(){
        String name;
        String [] firstName = new String[5];
        firstName[0] = "Aaron";
        firstName[1] = "John";
        firstName[2] = "Ben";
        firstName[3] = "Jerrica";
        firstName[4] = "Beth";

        String [] lastName = new String[5];
        lastName[0] = "Smith";
        lastName[1] = "Sally";
        lastName[2] = "Watson";
        lastName[3] = "Johnson";
        lastName[4] = "Green";

        String [] fullName = new String[firstName.length];

        for(int i = 0; i < firstName.length; i++) {
            fullName[i] = firstName[i] + " " + lastName[i];
            if(fullName[i].length() - 1 < 12) {
                System.out.println(fullName[i]);
            }
        }
    }

    public void fizzBuzz(){
        int fizzIndex = 0;
        int buzzIndex = 0;
        int fizzBuzzIndex = 0;

        String string;

        int [] fizzBuzz = new int[100/15];
        int [] fizz = new int[(100/3 - 100/15)];
        int [] buzz = new int[(100/5 - 100/15)];

        for(int n = 1; n <= 100; n++){
            if(n % 15 == 0){
                string = "FizzBuzz";
                fizzBuzz[fizzBuzzIndex] = n;
                fizzBuzzIndex++;
                System.out.println(n + "-" + string);
            } else if(n % 3 == 0){
                string = "Fizz";
                fizz[fizzIndex] = n;
                fizzIndex++;
                System.out.println(n + "-" + string);
            } else if(n % 5 == 0){
                string = "Buzz";
                buzz[buzzIndex] = n;
                buzzIndex++;
                System.out.println(n + "-" + string);
            }
        }
    }

    public void heatWave(){
        int heatWaveCount = 0;
        int [] randomTemp = new int[20];
        for(int i = 0; i < randomTemp.length; i++){
            randomTemp[i] = ThreadLocalRandom.current().nextInt(80, 120);
            if(randomTemp[i] > 90){
                heatWaveCount++;
            }
        }
        System.out.println("There were " + heatWaveCount + " heatwaves recorded");
    }
}
