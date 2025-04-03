
public class Nine
{
    public static void main(String args[])
    {
        int[][] matrix={ 
            {1,2,3},
            {2,4,5},
            {3,5,6}
        };   
        if(issymmetric(matrix)){
            System.out.println("matrix is Symmetric ");
        }
        else{
           System.out.println("matrix is not Symmetric");
        }
    }
    public static boolean issymmetric(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(matrix[i][j] !=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}