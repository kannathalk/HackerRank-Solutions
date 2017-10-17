import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noofinput = Integer.parseInt(sc.nextLine());
        String[] arr = new String[noofinput];
        for(int i=0;i<noofinput; i++) {
            arr[i] = sc.nextLine();
        }
        for(String s: arr) {
            int i=0;
                String even = "";
                String odd = "";
			while(i < s.length()) {

                if(i%2 == 0){
                    even += s.charAt(i);
                }
                else {
                    odd += s.charAt(i);
                }
				i++;
            }
            System.out.println(even + " "+ odd);
        }
    }
}