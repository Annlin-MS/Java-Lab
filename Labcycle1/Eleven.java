import java.util.Arrays;
import java.util.Scanner;
public class Eleven{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] str=new String[n];
        System.out.println("enter the strings:");
        for(int i=0;i<n;i++)
        {
            str[i]=scanner.nextLine();
        }
        Arrays.sort(str);
        System.out.println("sorted strings:");
        for(String word:str){
            System.out.println(word);
        }

    }
}