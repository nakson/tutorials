/** basic biased coin flip */

import java.util.Random;

public class Flip2{
 
 public static void main(String[] args){
   Random equally = new Random();
  // for(int i=0; i<10; i++){
   //double r = equally.nextDouble();
 //  System.out.println(r);
 //  }
  int countHeads = 0;
  int countTails = 0;
  double bias = 0.5;  // 50% heads, 50% tails
  int times = 0; //second line
  boolean ok = true;
  if(args.length == 2){
   try{
    bias = Double.parseDouble(args[0]);
    times = Integer.parseInt(args[1]);
   }catch(Exception e){
    System.out.println("command line argument must be a number");
    ok = false;
   }
  }
  if(ok){
    for(int i=0; i<times; i++){
      double r = equally.nextDouble();
      if(r<bias){
        countHeads++;
      }else{
        countTails++;
      }
    }
    
    System.out.println(countHeads+"heads, "+countTails+"tails, bias "+bias);
  }
  
  
  
  
 }
}
