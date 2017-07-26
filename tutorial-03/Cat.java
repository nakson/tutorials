public class Cat extends Animal{
  /**
   Initializes a cat with the given name and birth year.
   
   @param name is the cat's name
   @param year is the cat's year of birth
   */
  public Cat(String name, int year){
    super(name, year);
  }
  
  
  /** 
   A string representation of the noise a cat makes.
   <p>
   Randomly chosen "meow" or "prrr".
   
   @return a string representation of the noise a cat makes
   */
  public String noise(){
    if(Math.random() < 0.5){
      return "meow";
    }else{
      return "prrr";
    }
  }
}