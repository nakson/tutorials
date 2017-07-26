public class Dog extends Animal{
  public Dog(String name, int year){
    super(name, year);
  }
  
   public String noise(){
     if(Math.random() < 0.5){
       return "woof";
     }else{
       return "grrrr";
     }
  }
}