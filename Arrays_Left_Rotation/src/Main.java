import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] arr = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};

        rotLeft(arr, 13);
    }

    static int[] rotLeft(int[] a, int d) {

        while (d != 0) {

            int first = a[0];

            System.arraycopy(a, 1, a, 0, a.length - 1);

            a[a.length - 1] = first;


            d--;

        }

        return a;

    }

}
