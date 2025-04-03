import java.util.Scanner;
public class Five{
    public static void main(String args[])
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("enter your percentage:");
    double percentage=scanner.nextDouble();

    if (percentage>=90)
    {
        System.out.println("Grade:A");
        System.out.println("Excellent work");
    }else if(percentage>=80)
    {
        System.out.println("Grade:B");
        System.out.println("Good job");
    }else if(percentage>=70)
    {
        System.out.println("Grade:C");
        System.out.println("You can do better");
    }else if(percentage>=60)
    {
        System.out.println("Grade:D");
        System.out.println("Work harder");
    }else{
        System.out.println("Grade:F");
        System.out.println("Failed.Try again");
    }
  }
}