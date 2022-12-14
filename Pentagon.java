import java.util.Scanner;

class Pentagon {
    public static double areaPentagon(double s){

        double nomi = 5 * s * s;
        double deno =   4 * (Math.tan(Math.PI / 5));

        double A = nomi / deno;

        return A;
    }
    public static void main(String[] args) {
        
        double area, side;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length: ");
        side = sc.nextDouble();

        area = areaPentagon(side);

        System.out.println("The area of the pentagon is " + area);

        sc.close();
    }
}
