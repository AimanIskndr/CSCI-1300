import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        int num;
        boolean palindrome;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        palindrome = ispalindrome(num);

        if(palindrome)
            System.out.println(num + " is a palindrome");

        else
            System.out.println(num + " is not a palindrome");

        sc.close();
    }

    private static boolean ispalindrome(int number) {
        
        int rev = 0;
        
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }

        if(number == rev){
            return true;
        }

        else
            return false;
    }
}
        
