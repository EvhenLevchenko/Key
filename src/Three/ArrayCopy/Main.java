package Three.ArrayCopy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = new int[5];

        System.out.println("Before arraycopy");
        System.out.println(Arrays.toString(sourceArr));
        System.arraycopy(sourceArr, 5, destArr, 0, 5);
        System.out.println("After");
        System.out.println(Arrays.toString(destArr));
    }

    }
