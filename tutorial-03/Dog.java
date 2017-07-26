public class Dog extends Animal{
  /**
 Initializes a dog with the given name and birth year.
 
 @param name is the dog's name
 @param year is the dog's year of birth
 */
  public Dog(String name, int year){
    super(name, year);
  }
  
  
    /** 
   A string representation of the noise a dog makes.
   <p>
   Randomly chosen from "woof" or "grrr".
   
   @return a string representation of the noise a dog makes
   */
   public String noise(){
     if(Math.random() < 0.5){
       return "woof";
     }else{
       return "grrrr";
     }
  }
}