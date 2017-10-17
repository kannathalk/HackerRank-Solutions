import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutStick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int count = 0;
		System.out.println(n);
        do {
            int min = 0;
			for(int i: arr) {
				if(i >0){
					min = i;
				}
			}
            for(int i: arr){
				if(i < min && i >0){
                    min = i;
                }
            }
			if(min < 0) {break;}
            //System.out.println("min is:" + min);
            count = 0;
            for(int i = 0; i< arr.length; i++){
                arr[i] = arr[i] - min;
                if(arr[i] > 0) {
                    count++;
                }
            }
			if(count > 0) {
				System.out.println(count);
			}
			//break;
        }while (count > 0);
    }
}