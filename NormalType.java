import java.util.*;
import java.io.*;
public class NormalType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i= 0; i<n;i++) {
			arr.add(sc.nextInt());
		}
		HashSet<Integer> uniqueele = new HashSet<Integer>(arr);
		HashMap<Integer, Integer> freqmap = new HashMap<Integer,Integer>();
		for (Integer k: uniqueele) {
			freqmap.put(k,Collections.frequency(arr, k));
		}
		int solu = 1;
		for (Integer i: freqmap.values()){
			solu *= i;
		}
		System.out.println(solu);
	}
}