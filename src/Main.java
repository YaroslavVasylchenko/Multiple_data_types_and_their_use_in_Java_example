import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }

        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

        String word = "Alexx9800";
        char[] wordArray = word.toCharArray();
        Set<Character> symbolSet = new LinkedHashSet<>();
        for (int i = 0; i < wordArray.length; i++) {
            symbolSet.add(wordArray[i]);
        }
        for (Character str : symbolSet) {
            System.out.println(str);
        }
    }


}












