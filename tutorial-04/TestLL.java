import java.util.ArrayList; 
import java.util.*;

public class TestLL{
  
  
 public static void main(String[] args){
   
   
  // create an empty linked list
  LList list = new LList();
  ArrayList<String> alist = new ArrayList<String>(); 
  System.out.print("empty Linked list : ");
  System.out.println(list);
  System.out.print("empty Array list : ");
  System.out.println(alist +"\n");
  
  // create a list with one element
  // list = [cat]
  list = new LList(new Node("cat"));
  alist = new ArrayList<String>(Collections.singletonList("cat"));
  System.out.print("singleton  Linked List: ");
  System.out.println(list);
  System.out.print("singleton  Array List: ");
  System.out.println(alist +"\n");

  // add some elements to the back and front
  list.addBack("dog");
  alist.add("dog");
  list.addFront("owl");
  alist.add(0, "owl");
  list.addBack("bat");
  alist.add("bat");
  System.out.print("some adds  : ");
  System.out.println("Linked List: "+list);
  System.out.println("Array List: "+alist+"\n");
  
  // abritrary adds
  list.add(1, "crow");
  alist.add(1, "crow");
  list.add(1, "goat");
  alist.add(1, "goat");
  list.add(2, "eel");
  alist.add(2, "eel");
  System.out.print("more adds  : ");
  System.out.println("Linked List: "+list);
  System.out.println("Array List: "+alist+"\n");
  
  // some gets
  System.out.println("Linked List: ");
  System.out.println("   x0 = " + list.get(0));
  System.out.println("   x1 = " + list.get(1));
  System.out.println("   x5 = " + list.get(5));
  System.out.println("   xn = " + list.get(list.getSize()-1));
   System.out.println("Array List: ");
  System.out.println("   x0 = " +alist.get(0));
  System.out.println("   x1 = " + alist.get(1));
  System.out.println("   x5 = " + alist.get(5));
  System.out.println("   xn = " + alist.get(alist.size()-1) + "\n");
  
  // removes
  list.removeFront();
  alist.remove(0);
  list.removeFront();
  alist.remove(0);
  System.out.println("(Linked List) removes  : " + list);
  System.out.println("(ArrayList) removes  : " + list);

  // removes
  list.remove(3);
  alist.remove(3);
  list.remove(list.getSize()-1);
  alist.remove(alist.size()-1);
  System.out.println("(Linked List) removes  : " + list);
  System.out.println("(ArrayList) removes  : " + list+"\n");

  // remove front add to back
  System.out.println("move front to back ");
  list.addBack( list.removeFront() );
  alist.add( alist.remove(0) );
  System.out.println("(Linked List) before  : " + list);
  System.out.println("after   : " + list);
  System.out.println("(Array List) before  : " + alist);
  System.out.println("after   : " + alist+ "\n");

  LList l1 = new LList(new Node("a"));
  l1.addFront("b").addBack("c").add(1,"d");
  LList l2 = new LList(new Node("a"));
  l1.addFront("b").addBack("c").add(1,"eeee");
  
  System.out.println( "l1.compareTo(l2) = " + l1.compareTo(l2));
  
   System.out.println("current list   : " + list);
   System.out.println( "find crow: " + list.find("crow"));
   System.out.println( "find cat: " + list.find("cat"));
   System.out.println( "find eel: " + list.find("eel"));
   System.out.println( "find dog: " + list.find("dog"));
  
  // uncomment this next line
  // System.out.println( "same(l1,l2) = " + same(l1,l2)) ;
  
  
 }

}