import java.io.*;
import java.util.*;

public class ArrayRightRotation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Get first line of input 
		int noofele = sc.nextInt();
		int noofrotation = sc.nextInt();
		int noofquery = sc.nextInt();
		sc.nextLine();
		noofrotation = noofrotation%noofele;
		
		
		//Get array element
		int[] arr = new int[noofele];
				for(int i = 0; i< noofele; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		//Get query input
		int[] queryarr = new int[noofquery];
		for (int i = 0; i<noofquery; i++) {
			queryarr[i] = Integer.parseInt(sc.nextLine());
		}
		if(noofrotation > 0) {
			rotate(arr, noofrotation);
		}
		for(int i: queryarr){
			System.out.println(arr[i]);
		}		
		
	}
	public static void rotate (int[] ar, int rt){
		int b= ar.length-rt;
		reverse(ar, 0, b-1);
		reverse(ar, b, ar.length -1);
		reverse(ar, 0, ar.length -1);

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