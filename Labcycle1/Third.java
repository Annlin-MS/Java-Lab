import java.util.Scanner;
public class Third{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Maths marks");
        int maths_marks=scanner.nextInt();
        System.out.println("physics marks");
        int physics_marks=scanner.nextInt();
        System.out.println("chemistry marks");
        int chemistry_marks=scanner.nextInt();
        int total =maths_marks+physics_marks+chemistry_marks;
        if(maths_marks>=60 && physics_marks>=50 && chemistry_marks>=40 && total>=200)
        {
            if(maths_marks+physics_marks>=150)
            {
                System.out.println("Student is eligible");
            }
             else{
                System.out.println("Student is not eligible");
             } 
            
        }
        else{
            System.out.println("Student is not eligible");
        }
    }
}