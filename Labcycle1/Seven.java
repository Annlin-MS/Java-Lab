import java.util.Scanner;
public class Seven{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=scanner.nextInt();
        int temp=number;
        int digit=0,sum=0,last=0;
        while(temp>0)
        {
            temp=temp/10;
            digit++;
        }
        temp=number;
        while(temp>0)
        {
          last= temp%10;
          temp/=10;
          sum=sum+(int)Math.pow(last,digit);
        }        
        if(sum==number)
        {
            System.out.println(number+" is Armstrong number");
        }else{
            System.out.println(number+" is not a Armstrong number");
        }
    }
}