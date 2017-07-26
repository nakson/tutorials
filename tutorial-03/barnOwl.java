public class barnOwl extends Owl{
  boolean wise = false;
  public barnOwl(String name, int year){
    super(name, year);
  }
  
  public barnOwl(String name, int year, boolean wise){
    super(name, year);
    if(wise == true){
      this.wise = true;
    }
  }

  public String noise(){
      return "mummmmmm";
  }
}