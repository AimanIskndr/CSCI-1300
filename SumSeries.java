package Practice6;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        
        int j;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter i: ");
        j = sc.nextInt();

        System.out.printf("i\tm(i)\n");
        System.out.println("____________");
        for(int i = 1; i <= j; i++){
            total = m(i);
            System.out.printf("%d\t%.4f\n", i, total);
          
        }
        sc.close();
    }

    public static double m(int n){

        double sum = 0;
        double i = (double) n;
        for(int j = 1; j <= i; j++){
            sum += (double) j / (j+2);
        }

        return sum;

    }
}
