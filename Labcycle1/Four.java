import java.util.Scanner;
public class Four{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int manager_salary=50000;
        int developer_salary=30000;
        int intern_salary=15000;
        System.out.println("enter empolyee role(Manager/Developer/Intern)");
        String role=scanner.nextLine();
        int basesalary=0;

        if(role.equalsIgnoreCase("Manager"))
        {
            basesalary=manager_salary;
        }else if(role.equalsIgnoreCase("Developer"))
        {
            basesalary=developer_salary;
        }else if(role.equalsIgnoreCase("Intern"))
        {
            basesalary=intern_salary;
        }else{
            System.out.println("invalid role entered");
        }
         System.out.println("enter years of experience");
         double experience=scanner.nextDouble();
         double bonus_percentage=0.0;
         if(experience<3)
         {
            bonus_percentage=0.0;
         }else if(experience<=3)
         {
            bonus_percentage=0.1;
         }else 
         {
            bonus_percentage=0.2;
         }

         double bonus=basesalary*bonus_percentage;
         double salary=bonus+basesalary;
         System.out.println("Role:"+role);
         System.out.println("base salary:"+basesalary);
         System.out.println("Bonus percentage:"+(bonus_percentage*100)+"%");
         System.out.println("bonus:"+bonus);
         System.out.println("final salary is "+salary);
     }
}