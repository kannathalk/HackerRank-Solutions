import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] timearray = new String[5];
        timearray[0] = time.substring(0,2);
		timearray[1] = time.substring(3,5);
		timearray[2] = time.substring(6,8);
        timearray[3] = time.substring(8,10);
		//System.out.println(timearray[0]+ " " +timearray[1]+" " +timearray[2]+" "+timearray[3]);
		//System.out.println(timearray[0]+ timearray[3]);
		if(timearray[0].equals("12") && timearray[3].equals("AM") ){
            timearray[0] = "00";
        }
        else if(timearray[0].equals("12") && timearray[3].equals("PM")) {
            timearray[0] = "12";
        }
        else if(timearray[3].equals("PM")) {
     
			timearray[0] = String.valueOf(Integer.parseInt(timearray[0]) + 12);
	 
        }
        
        System.out.println(timearray[0]+":"+timearray[1]+":"+timearray[2]);
    }
}
