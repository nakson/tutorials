public class ScreechOwl extends Owl{
  boolean wise = false;
  public ScreechOwl(String name, int year){
    super(name, year);
  }
  
  public ScreechOwl(String name, int year, boolean wise){
    super(name, year);
    if(wise == true){
      this.wise = true;
    }
  }

  public String noise(){
      return "huha";
  }
}