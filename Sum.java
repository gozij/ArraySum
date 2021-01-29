/**
 * Sum
 */

import java.io.Console;
import java.util.*;


public class Sum {

    public static void main(String[] args) {
        int [] myArray = {50, 60, 80, 100, 200, 400};
        int lengthOfArray = myArray.length;

        int sum = 0;
        for(int i = 0; i < myArray.length; i ++)
        
        sum = sum + myArray[i];
        System.out.println(sum);

    }
}

        
    
