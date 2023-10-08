//Find the "Kth" max and min element of an array.

import java.util.Arrays;

public class KthMinMax {

    public static void findKthMinAndMax(int[] arry, int k) {

        if (k < 1 || k > arry.length) {

            System.out.println("Invalid input for k");
            return;

        }

        Arrays.sort(arry);

        int kthMin = arry[k - 1];
        int kthMax = arry[arry.length - k];

        System.out.println(k + "th minimum element: " + kthMin);
        System.out.println(k + "th maximum element: " + kthMax);

    }

    public static void main(String[] args) {

        int[] arry = { 3, 1, 4, 1, 5, 9, 2, 6 };
        int k = 3;

        findKthMinAndMax(arry, k);

    }
}