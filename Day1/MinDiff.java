package Day1;



import java.util.*;

public class MinDiff{
    public static void main(String args[]){
        int A[] = {1,2,5};
        int B[] = {2,1,3};
        int sum = 0 ;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0 ; i < A.length ; i++)
        {
            sum += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min DIFF "+ sum);
    }
}
