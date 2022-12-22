package Practice6;

import java.util.Scanner;

public class convertms {
    public static void main(String[] args) {
        
        long ms;
        String ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in milliseconds: ");
        ms = sc.nextLong();
        
        ans = convertMillis(ms);
        System.out.println("h:m:s = " + ans);
        sc.close();
    }

    public static String convertMillis(long millis){

        String str = "", temp;
        long s;

        s =  millis/1000;

        if(s >= 36000){
            int h = (int) s / 3600;
            s%= 3600;
            temp = Integer.toString(h);
            str = str + temp + ":";
        }

        else{
            str = str + "00:";
        }

        if(s >= 60){
            int m = (int) s / 60;
            s%= 60;
            
            if(m < 10)
                str += "0" + m + ":";
            
            else
                str += m + ":";
        }

        else{
            str = str + "00:";
        }

        str = str + s;

        return str;
    }

}
