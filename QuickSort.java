import java.util.*;
import java.io.*;
public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		quickSort(a, 0, n-1);
	}
	public static void quickSort(int[] a, int low, int high) {
		if(high > low) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
			System.out.println("array is" + Arrays.toString(a));
		}
	}
	public static int partition(int[] a, int left, int right) {
		int low = left;
		int high = right;
		int pivotvalue = a[low];
		while(low < high) {
			while((a[low] <= pivotvalue) && (low < high)) {
				low++;
			}
			while(a[high] > pivotvalue && high > 0) {
				high--;
			}
			if(low<high){
				int temp = a[low];
				a[low] = a[high];
				a[high] = a[low];
			}
		}
		a[left] = a[high];
		a[high] = pivotvalue;
		return high;
	}
}