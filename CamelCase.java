import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
		int count = 1;
		
        for(char c: s.toCharArray()) {
            int asciivalue = (int) c;
			if(asciivalue >= 65 && asciivalue <= 90) {
				count++;
			}
		}
		System.out.println(count);
    }
}
