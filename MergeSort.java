import java.io.*;
import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr,temp, 0, arr.length-1);
	}
	public static void sort(int[] arr, int[] temp, int low, int high) {
		
		if(low < high) {
			System.out.println("inside if");
			int mid = (low+high)/2;
			sort(arr, temp, low, mid);
			sort(arr, temp, mid+1, high);
			merge(arr, temp, low, mid, high);
		}
	}
	
	public static void merge(int[] a, int[] temp, int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int current = low;
		for (int cc = low; cc <= high; cc++) {
			temp[cc] = a[cc];
		}
		System.out.println("" +low+ " "+ mid + " "+ high);
		while(i<= mid && j <= high) {
			if(temp[i] <= temp[j]) {
				a[current] = temp[i];
				i++;
			}
			else {
				a[current] = temp[j];
				j++;
			}
			current++;
		}
		System.out.println("Before copy" + Arrays.toString(a));
	
		//Copy remaining left
		int remaining = mid - i;
		for(int co = 0; co<= remaining; co++) {
			a[current + co] = temp[i];
			i++;
		}
		System.out.println("After copy" +Arrays.toString(a));

		return;
	}
}