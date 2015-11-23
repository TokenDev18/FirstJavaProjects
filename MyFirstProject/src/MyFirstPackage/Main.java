package MyFirstPackage;

import Shapes.*;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by aaron on 10/13/15.
 */
public class Main {

    public static void main(String[] args) {
        int randomNum;

        randomNum = ThreadLocalRandom.current().nextInt(1000, 10000);
        System.out.println(randomNum);

    }
}


