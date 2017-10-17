import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bn = Integer.toBinaryString(n);
		int count = 0;
		int prevcount = 0;
        for(char c: bn.toCharArray()) {
			if(c == '1') {
				count += 1;
			}
			else {
				if(count > prevcount) {
					prevcount = count;
				}
				count = 0;
			}
		}
		if(prevcount > count)
			count = prevcount;

		System.out.println(count);
    }
}
