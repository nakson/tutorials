/**
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * Example of simple user input using Scanner
 * 
 * M. Jason Hinek, July 2017
 */


/* import the Scanner class */
import java.util.Scanner;


public class HelloInput{
  
  public static void main(String[] args){
 
    /* declare variable */
    Scanner keyboardScanner;   
    
    /* create the Scanner object to read from the
     * keyboard. System.in is the standard input
     * which is the keyboard                        */
    keyboardScanner = new Scanner(System.in);
    
    /* variables to remember input */
    String input; 
    int    number;
     
    /* keep reading user input until "end" is entered */
    do{
      System.out.print("Enter a single word and then return : ");
      input = keyboardScanner.next();
      
      System.out.print("Enter a number and then return :");
      number = keyboardScanner.nextInt();
      
       //creat an array of Strings represent each row of the output
      String[] row = new String[number];
      //initialize each string
      for(int n=0; n<number; n++){
        row[n]= input;
      }
      /* print out the message num times */
      for(int i=0; i<number; i+=1){
        for(int k=1; k<number; k++){
          row[i] += input;
        }
        System.out.println(row[i]);      
      } 
      //System.out.println("You entered : " + input + "," + number);
    }while( !input.equals("end") );
    
      
  } // end main method
  
} // end class HelloInput