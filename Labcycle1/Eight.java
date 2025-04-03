import java.util.Scanner;
public class Eight{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the limit:");
        int limit=scanner.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b);

        for(int i=0;i<=limit;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}