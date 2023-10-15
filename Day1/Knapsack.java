package Day1;
import java.util.*;

public class Knapsack
 {
    public static void main(String args[]){
    int weight[] = {60 , 100 , 120 };
    int value[] = {10 , 20 ,30};
    int capacity = 50 ; 
    int i;
    int finalVal = 0 ;
    

    double arr[][] = new double[weight.length][2];

    for(i = 0 ; i < weight.length ; i++)
    {
        arr[i][0] = i;
        arr[i][1] = value[i]/(double)weight[i];
    }

    Arrays.sort(arr , Comparator.comparingDouble(o->o[1]));

    for( i = weight.length -1 ; i >= 0 ; i--)
    {
        int idx = (int)arr[i][0];
         if(weight[idx]<=capacity)
         {
            finalVal = finalVal + value[idx];
            capacity = capacity - weight[idx];
         }else
         {
             finalVal += (int)arr[idx][1]*capacity;
             break;

         }
    }
    System.out.println("finalValue " + finalVal);
}
}

