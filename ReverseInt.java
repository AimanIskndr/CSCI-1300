import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        
        int num, revnum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        revnum = reverseInt(num);

        System.out.println("Reverse of " + num + " is " + revnum);

        sc.close();
    }

    private static int reverseInt(int number) {
        
        int rev = 0;
        
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        
        return rev;
    }   
}
