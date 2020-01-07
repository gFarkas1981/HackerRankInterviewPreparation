import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{4,3,1,2};
        minimumSwaps(arr);
    }

    static int minimumSwaps(int[] arr) {

        int [] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        int swaps = 0;

        for (int i = 0; i < sortedArray.length ; i++) {

            if (sortedArray[i] != arr[i]) {

                for (int j = i; j < sortedArray.length ; j++) {

                    if (arr[j] == sortedArray[i]) {

                        arr[j] = arr[i];
                        arr[i] = sortedArray[i];
                        break;

                    }

                }

                swaps++;

            }

        }

        return swaps;

    }
}
