import java.util.Scanner;
public class Six{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=scanner.nextInt();
        int orginal_number=n;
        int reverse=0;
        while(n !=0)
        {
            int number=n % 10;
            reverse=reverse * 10+number;
            n=n/10;
        }
          if(orginal_number==reverse){
            System.out.println(orginal_number+" is a palindrome");
          }else{
            System.out.println(orginal_number+" is not a palindrome");
          }
    }

}