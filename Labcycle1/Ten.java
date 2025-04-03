import java.util.Scanner;
public class Ten{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of rows and columns for matrix:");
    int r=scanner.nextInt();
    int c=scanner.nextInt();
    int[][] matrix=new int[r][c];
    System.out.print("enter the elements of the matrix:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            matrix[i][j]=scanner.nextInt();
        }
        
    }
    System.out.println("matrix:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    sumr(matrix,r,c);  
    sumc(matrix,r,c); 
  }
  public static void sumr(int[][] matrix,int r,int c )
  {
    System.out.println("Sum of each row:");
    for(int i=0;i<r;i++)
    {
      int rowsum=0;
      for(int j=0;j<c;j++)
      {
        rowsum+=matrix[i][j];
      }
      System.out.println(rowsum);
    }
  }
  public static void sumc(int[][] matrix,int r,int c )
  {
    System.out.println("Sum of each column:");
    for(int j=0;j<c;j++)
    {
      int colsum=0;
      for(int i=0;i<r;i++)
      {
        colsum+=matrix[i][j];
      }
      System.out.println(colsum);
    }
  }
} 