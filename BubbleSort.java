import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] unsorted = new long[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = Long.parseLong(in.next());
        }
        bubbleSort(unsorted, n);
    }
    public static void bubbleSort(long[] a, int n) {
        for(int i = n-1; i>=1; i--) {
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j+1]) {
                    long t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for(int i = 0; i< n; i++) {
            System.out.println(a[i]);
        }
    }
}
