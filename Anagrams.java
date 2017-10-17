import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams {
    public static int numberNeeded(String first, String second) {
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
        Hashtable<String,Integer> ht2 = new Hashtable<String,Integer>();
        for(char c: first.toCharArray()) {
			int t;
			if(ht.get(Character.toString(c)) == null ){
				t = 0;
			}
			else {
				t = ht.get(Character.toString(c));
			}
            ht.put(Character.toString(c),t+1);   
        }
        for(char c: second.toCharArray()) {
			
			int t;
			if(ht2.get(Character.toString(c)) == null ){
				t = 0;
			}
			else {
				t = (Integer) ht2.get(Character.toString(c));
			}
            ht2.put(Character.toString(c),t+1);
        }
        int noofdele = 0;
        for(Map.Entry m: ht.entrySet()){
			int t;
			if(ht2.get(m.getKey()) == null){
				t = 0;
			}
			else {
				t = (Integer)ht2.get(m.getKey());
			}
           noofdele += Math.abs((Integer)m.getValue() - t);
        }
		for(Map.Entry m: ht2.entrySet()){
			if(ht.get(m.getKey()) == null){
				noofdele += (Integer)m.getValue();
			}
		}
		return noofdele;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
