/**
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * More Coding
 * 

 */


/* import the Scanner class */
import java.util.Scanner;


public class Args{
  
  public static void main(String[] args){
 
    /* defult number of time to print the message */
    int num = 1;
    String reverseOrder = "";
   // if(args[].length>2 && args[].length<9)
   // reverseOrder= args[args.length-1]; //add the last arg
    
    if( args.length > 0 ){
      num = args.length;
    }
    
 /*   if(args[args.length-1].length()<=2 || args[args.length-1].length()>=9){
      reverseOrder -= args[args.length-1];
    }else{
      reverseOrder += ","; //add the first comma
    } */
    for(int i=num-1; i>=0; i--){
      if(args[i].length()>2 && args[i].length()<9){
        reverseOrder += args[i];
        //if(i!=0)
          reverseOrder += ",";
      }
    }
    reverseOrder = reverseOrder.substring(0, reverseOrder.length() - 1); //Remove the last comma
    System.out.println("There are "+num+" command line arguments"); 
    System.out.println(reverseOrder.toLowerCase());

  } // end main method
  
} // end class HelloInput