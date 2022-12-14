import java.util.Scanner;

public class phoneKeypad {
    public static void main(String[] args){
        
        String phoneNo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        phoneNo = sc.nextLine();

        phoneNo.toUpperCase();

        for(int i = 0; i < phoneNo.length(); i++){

            char ch = phoneNo.charAt(i);

            System.out.print(getNumber(ch));
        }

        sc.close();
    }

    public static char getNumber(char p){

        p = Character.toUpperCase(p);

        if(p == 'A' || p == 'B' || p == 'C'){
            return '2';
        }

        else if(p == 'D' || p == 'E' || p == 'F'){
            return '3';
        }

        else if(p == 'G' || p == 'H' || p == 'I'){
            return '4';
        }

        else if(p == 'J' || p == 'K' || p == 'L'){
            return '5';
        }

        else if(p == 'M' || p == 'N' || p == 'O'){
            return '6';
        }

        else if(p == 'P' || p == 'Q' || p == 'R' || p == 'S'){
            return '7';
        }

        else if(p == 'T' || p == 'U' || p == 'V'){
            return '8';
        }

        else if(p == 'W' || p == 'X' || p == 'Y' || p == 'Z'){
            return '9';
        }

        else
            return p;

    }
}
