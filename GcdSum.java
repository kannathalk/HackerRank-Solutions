import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GcdSum {

    static int maximumGcdAndSum(int[] A, int[] B) {
        // Complete this function
        int maxgcd = 1;
        int maxpairsum = 0;
        for(int i: A) {
            for(int j: B){
                int gcdvalue = findGcd(i,j);        
                if(gcdvalue > maxgcd) {
                    maxgcd = gcdvalue;
                    maxpairsum = i+j;
                }
                else if(gcdvalue == maxgcd){
                    if((i+j) > maxpairsum) {
                        maxpairsum = i+j;
                    }
                }
            }
        }
        return maxpairsum;        
    }
	
    static int findGcd(int a, int b) {
        int x = (a >= b) ? a: b;
        int y = (a < b) ? a :b;
        if(x == 0 || y == 0) return x+y;
        return findGcd(y, x%y);
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int res = maximumGcdAndSum(A, B);
        System.out.println(res);
    }
}
