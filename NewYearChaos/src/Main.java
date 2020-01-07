import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] line = {1,2,5,3,7,8,6,4};
        minimumBribes(line);


    }


    static void minimumBribes(int[] q) {

        boolean chaos = false;
        int bribes = 0;
        int[] sorted = q.clone();
        Arrays.sort(sorted);


        for (int i = 0; i < q.length ; i++) {

            if (q[i] - 2 > sorted[i]) {

                chaos = true;
                break;

            } else if (q[i] > sorted[i]){

                    bribes += q[i] - sorted[i];

            }else if (q[i] +1 == sorted[i]){

                bribes += 1;

            }

        }

        if (chaos) {

            System.out.println("Too chaotic");

        } else {

            System.out.println(bribes);

        }

    }

}
