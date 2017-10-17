import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GcdSumTry1 {

    static int maximumGcdAndSum(int[] A, int[] B) {
        // Complete this function
		int amax = Arrays.stream(A).max().getAsInt();
		int bmax = Arrays.stream(B).max().getAsInt();
		System.out.println(amax + " " + bmax);
		int[] marka = new int[amax];
		int[] markB = new int[bmax];
		// populateMarkArray
		for (int i = 0; i < amax; i++) {
			for(int j = 1; j*j < A[i]; j++) {
				if(A[i] % j == 0) {
					if((marka[j] < j*A[i]) || (marka[j] == j*A[i] && marka[j]/j < A[i]))
						marka[j] = j * A[i];
					if((marka[A[i]/j] < (A[i]/j)*A[i]) || ((marka[A[i]/j] == (A[i]/j)*A[i]) && (marka[(A[i]/j)]/(A[i]/j) < A[i])) )
						marka[A[i]/j] = (A[i]/j) * A[i];
				}
			}
		}
		for (int i = 0; i < bmax; i++) {
			for(int j = 1; j*j < B[i]; j++) {
				if(B[i] % j == 0) {
					if((markB[j] < j*B[i]) || (markB[j] == j*B[i] && markB[j]/j < B[i]))
						markB[j] = j * B[i];
					if((markB[B[i]/j] < (B[i]/j)*B[i]) || (markB[B[i]/j] == (B[i]/j)*B[i] && markB[(B[i]/j)]/(B[i]/j) < B[i]))
						markB[B[i]/j] = (B[i]/j) * B[i];
			}
		}

		}
		for(int ak: marka)
		System.out.println(ak);
		for(int al: markB)
		System.out.println(al);
		return 1;
	
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
