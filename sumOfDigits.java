import java.util.Scanner;

public class sumOfDigits {
    
    public static void main(String[] args) {
        
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        sumDigits(n);

        sc.close();
    }

    private static void sumDigits(int num) {

        int sum = 0, rem;

        while(num != 0){        
            rem =  num % 10;
            num = num / 10;
            sum += rem;
        }
        System.out.println("The sum of the total individual digits is " + sum);

    }
}

