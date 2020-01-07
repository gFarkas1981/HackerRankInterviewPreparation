import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long repetition = 0L;

        long wordRepetition = n / s.length();
        long remainingChars = n % s.length();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {

                repetition++;

            }

        }

        repetition = repetition * wordRepetition;

        for (int i = 0; i < remainingChars; i++) {

            if (s.charAt(i) == 'a') {

                repetition++;

            }

        }


        return repetition;
    }


    public static void main(String[] args) throws IOException {

        System.out.println(repeatedString("a", 1000000000000L));
    }
}
