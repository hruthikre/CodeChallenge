package Day1;



import java.util.*;
class Activity {
    public static void main(String[] args) {
       int start[] = {1,3,0,5,8,5};
       int end[] = {2,4,6,7,9,9};
       
       
       //Sorting 
       int activities[][] = new int[start.length][3];
       for(int i = 0 ; i< start.length ; i++)
       {
           activities[i][0]= i;
           activities[i][1] = start[i];
           activities[i][2] = end[i];
           
       }
       Arrays.sort(activities ,Comparator.comparingInt(o->o[2]));
       
       //First Act
       ArrayList<Integer> act = new ArrayList<>();
       act.add(activities[0][0]);
       int maxAct = 1;
       int lastTime = activities[0][2];
       
       for(int i = 1 ; i < start.length ; i++)
       {
           
           if(lastTime <= activities[i][1])
           {
               act.add(activities[i][0]);
               lastTime = activities[i][2];
               maxAct ++;
           }
       }
       System.out.println(maxAct);
       for(int i = 0 ; i < act.size(); i++)
       {
           System.out.println(act.get(i));
       }
    }
}

