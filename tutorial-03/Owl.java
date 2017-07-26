public class Owl extends Animal{
  boolean wise = false;
  
  public Owl(String name, int year){
    super(name, year);
  }
  
  public Owl(String name, int year, boolean wise){
    super(name, year);
    if(wise == true){
      this.wise = true;
    }
  }
  
  public String noise(){ return "hoooo";}
  
}