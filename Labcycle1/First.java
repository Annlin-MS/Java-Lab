import java.util.Scanner;
public class First{
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r =scanner.nextDouble();
        double area =3.14*r*r;
        double perimeter =2*3.14*r;
        System.out.println("Area"+area);
        System.out.println("perimeter"+perimeter);

    }
}
