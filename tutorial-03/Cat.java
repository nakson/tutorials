public class Cat extends Animal{
  public Cat(String name, int year){
    super(name, year);
  }

  public String noise(){
      if(Math.random() < 0.5){
       return "meow";
     }else{
       return "prrr";
     }
  }
}