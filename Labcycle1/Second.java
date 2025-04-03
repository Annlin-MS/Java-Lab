import java.util.Scanner;
public class Second
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length");
        int l=scanner.nextInt();
        System.out.println("enter the breadth");
        int b=scanner.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("Area"+area);
        System.out.println("perimeter"+perimeter);
    }
}