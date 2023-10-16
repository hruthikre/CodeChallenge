package Day2;
import java.util.*;
public interface Chocola {
    public static void main(String args[])
   {
    Integer costHor[] = {1,2,4};
    Integer costVer[] = {1,4,2,3,1};

    //Sort them in Decreasing Order
    Arrays.sort(costHor , Collections.reverseOrder());
    Arrays.sort(costVer , Collections.reverseOrder());

    int v = 0 , h = 0; 
    int vp = 1 , hp = 1 ; 
    int cost = 0 ;


    while(v< costVer.length && h < costHor.length)
    {
        if(costHor[h]>=costVer[v])
        {
            cost+= (vp*costHor[h]);
            h++;
            hp++;

        }else
        {
            cost+= (hp*costVer[v]);
            v++;
            vp++;
        }
    }

    while(v< costVer.length)
    {
        cost+= (hp*costVer[v]);
            v++;
            vp++;
    }

    while( h < costHor.length)
    {
        cost+= (vp*costHor[h]);
            h++;
            hp++;
    }

    System.out.println("Cost"+cost);

   }
}
