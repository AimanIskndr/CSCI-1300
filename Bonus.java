import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        
        long n = 2, num;
        boolean isPrime; 
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter a number (>1): ");
            num = sc.nextLong();

            if(num <= 1)
                System.out.println("invalid");
        }while(num <= 1);

        System.out.print("Its prime factor(s): ");

        for(long i = n; num > 1 ; i++){

            isPrime = true;
            
            if(i % 2 == 0 && i != 2){
                isPrime = false;
                continue;
            }

            for(long j = 3; j <= Math.sqrt(i); j+=2){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
            while(isPrime && num % i == 0){
                System.out.printf("%d ", i);
                num /= i;
            }
        }

        sc.close();
    }
}

