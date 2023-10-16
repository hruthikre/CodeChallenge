package Day2;
import java.util.*;

public class IndianCoins
{
    //We are given amount 590 we have to convert the that to notes 

    //First step is to calculate decreasing order of notes 

    public static void main(String args[])
    {
       Integer notes[] = {1,2,5,10,50,100,500, 2000};
       Arrays.sort(notes , Comparator.reverseOrder());

    ArrayList<Integer> ans  = new ArrayList<>();
    int amount = 590;
    int count = 0;


    for(int i = 0 ; i < notes.length ; i++)
    {
        if(amount >= notes[i])
         {
            while(amount >= notes[i])
            {
               count++;
               ans.add(notes[i]);
               amount -=notes[i];
            }
           

         }
    }

    for(int i = 0 ; i < ans.size(); i++)
    {
       System.out.println(ans.get(i)+ " ");
    }

    System.out.println("Count " + count);



    }

    
 }
