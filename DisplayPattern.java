import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        displayPattern(num);

        sc.close();
    }

    private static void displayPattern(int n){

        for(int i = 1; i <= n; i++){
            
            for(int j = 0; j < i; j++){

                System.out.printf("%d ", j + 1);
            }
            
            System.out.println("");
        }

        return;
    }
}
