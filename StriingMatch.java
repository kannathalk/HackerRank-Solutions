import java.io.*;
import java.util.*;
public class StriingMatch {
	public static void main(String[] args) {
		// Get Input
		Scanner sc = new Scanner(System.in);
		int noofstring = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int cnt = 1;
		while(cnt<= noofstring) {
			String input = sc.nextLine();
			if(hm.get(input) != null) {
				hm.put(input,hm.get(input)+1);
			}
			else {
				hm.put(input,1);
			}
			cnt++;
			System.out.println(cnt);
		}
		int noofpat = Integer.parseInt(sc.nextLine());
		String[] patt = new String[noofpat];
		for (int i=0; i< noofpat; i++){
			patt[i] = sc.nextLine();
		}
		for(String s: patt) {
			if(hm.get(s) != null) {
				System.out.println(hm.get(s));
			}
			else {
				System.out.println("0");
			}
		}
		System.out.println(hm);
	}
}