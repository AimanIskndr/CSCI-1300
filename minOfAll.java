package Practice6;

import java.util.Scanner;
public class minOfAll {
    public static void main(String[] args) {
        
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        int indexOfMin = IndexMin(num);

        System.out.println("The first minimum element of the array is at index " + indexOfMin);
        sc.close();
    }

    private static int IndexMin(int[] num) {
        
        int minID = 0;

        for(int i = 1; i < num.length; i++){
            if(num[i] < num[minID]){
                minID = i;
            }
        }

        return minID;
    }
}
