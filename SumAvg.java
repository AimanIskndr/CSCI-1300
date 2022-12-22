package Practice6;

import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args) {
        
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        int sum = Sum(num);
        double avg = Avg(sum);
        compareWithAvg(num, avg);

        sc.close();
    }

    private static int Sum(int[] num) {
        
        int total = 0;
        for(int i = 0; i < num.length; i++){
            total += num[i];
        }
        
        System.out.println("Sum = " + total);
        return total;
    }

    private static double Avg(int sum) {
        
        double average = (double)  sum / 10;

        System.out.printf("Average = %.4f\n", average);
        return average;
    }

    private static void compareWithAvg(int[] num, double avg){

        for(int i = 0; i < num.length; i++){
            if(num[i] > avg)
                System.out.println(num[i] + " is greater than the average");
            
            else if(num[i] < avg)
                System.out.println(num[i] + " is lesser than the average");
 
            else
                System.out.println(num[i] + " is equal to the average");
        }
    }   
}
