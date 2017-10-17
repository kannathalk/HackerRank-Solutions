import java.io.*;
import java.util.*;

public class ArrayLeftRotation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noofele = sc.nextInt();
		int noofrotation = sc.nextInt();
		noofrotation = noofrotation%noofele;
		int[] arr = new int[noofele];
		for(int i = 0; i< noofele; i++) {
			arr[i] = sc.nextInt();
		}
		rotate(arr, noofrotation);
		
		
	}
	public static void rotate (int[] ar, int rt){
		reverse(ar, 0, rt-1);
		reverse(ar, rt, ar.length -1);
		reverse(ar, 0, ar.length -1);
		for(int i: ar){
			System.out.print(i + " ");
		}
	}
	public static void reverse(int[] ar, int start, int end) {
		int t = end-start;
		t= t/2;
		t = t+start;
		for(int i=start,j=end; ;i++,j--) {
			if(i <= t) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
			else {
				break;
			}
		}
	}
}