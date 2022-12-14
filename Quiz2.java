import java.util.Scanner;
public class Quiz2 {
    public static void main(String[] args) {
        
        int sentinel = -1, distance = 0, sum = 0, furthestDistance = 0;
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name and distance: ");
        name = input.next();

        while(distance != sentinel){
            
            distance = input.nextInt();
            sum += distance;
            furthestDistance = Math.max(furthestDistance , distance);
        }
        sum++;
        
        System.out.printf("%s swam %d metres so far. Furtherst distance is %d", name ,sum, furthestDistance );
 
        input.close();
    }
}
