import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] swap(int[] a, int j) {
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
        return a;
    }

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numSwaps = 0;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a = swap(a, j);
                    numSwaps++;
                }
            }
        }

        if (numSwaps == 1) {
            System.out.println("Array is sorted in " + numSwaps + " swaps.");

        } else {
            System.out.println("Array is sorted in " + numSwaps + " swaps.");
        }
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
