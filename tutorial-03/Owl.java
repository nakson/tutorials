public class Owl extends Animal{
  /**  Determines if it is a wise owl or not */
  boolean wise = false;
  /**
 Initializes an owl with the given name and birth year.
 
 @param name is the owl's name
 @param year is the owl's year of birth
 */
  public Owl(String name, int year){
    super(name, year);
  }
   /**
 Initializes an owl with the given name, birth year, and wise.
 
 @param name is the owl's name
 @param year is the owl's year of birth
 @param wise is whether or not the owl is wise
 */
  public Owl(String name, int year, boolean wise){
    super(name, year);
    if(wise == true){
      this.wise = true;
    }
  }
  
    /** 
   A string representation of the noise a owl makes.
   
   @return a string representation of the noise an owl makes
   */
  public String noise(){ return "hoooo";}
  
  
  /* override Object's toString method here to show */
  @Override
  public String toString(){
    if(this.wise == true){
      return this.name+","+this.birthYear+", Wise";
    }else{
       return this.name+","+this.birthYear+", Not Wise";
    }
  }
  
}