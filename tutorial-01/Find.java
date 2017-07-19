/**
 * COMP1006/1406 - Summer 2017
 * Tutorial #1 
 * More Coding
 * 

 */


/* import the Scanner class */
import java.util.Scanner;


public class Find{
  
  public static void main(String[] args){
 
    /* declare variable */
    Scanner keyboardScanner;   
    
    /* create the Scanner object to read from the
     * keyboard. System.in is the standard input
     * which is the keyboard                        */
    keyboardScanner = new Scanner(System.in);
    
    /* variables to remember input */
    String str; 
    char   cha;
   
    /* keep reading user input until "end" is entered */
    do{
      str = null;
      int count = 0;
      System.out.print("Enter a string :");
      str = keyboardScanner.nextLine();
      
      System.out.print("Enter a character :");
      cha = keyboardScanner.nextLine().charAt(0);
      
      for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == cha){
          count++;
        }
      }
       
      //System.out.println("You entered : " + str );
      //System.out.println("str.length= "+ str.length());

      System.out.println("The character "+cha+" appears in your string "+count+" times");
    }while( !str.equals("end") );
    
      
  } // end main method
  
} // end class HelloInput