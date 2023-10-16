package Day2;

import java.util.Collections;
import java.util.ArrayList;

public class JobSeq {

    public static class  Jobs{
        int profit;
        int deadline;
        int id;


        public Jobs(int p , int d , int i)
        {
          this.profit = p ; 
          this.deadline = d; 
          this.id = i ;
        }
    }
    public static void main(String args[])
   {
      int jobsInfo[][] =  {{4,20}, {1,10}, {1,40}, {1,30}};

      ArrayList<Jobs> jobs = new ArrayList<>() ;


      for(int i = 0 ; i < jobsInfo.length; i++)
      {
        jobs.add(new Jobs(jobsInfo[i][1], jobsInfo[i][0] ,i));
      }
      Collections.sort(jobs ,(a,b)->b.profit - a.profit);

      int time = 0 ; 
      int maxProfit = 0 ; 
      ArrayList<Integer> ans = new ArrayList<>();

      for(int i =0 ; i < jobs.size(); i++)
      {
        Jobs getJob = jobs.get(i);
         if(getJob.deadline > time)
         {
             time += 1;
             ans.add(getJob.id);
             maxProfit += getJob.profit;

         }
      }


      System.out.println("Max Profit "+ maxProfit);




   }
}
