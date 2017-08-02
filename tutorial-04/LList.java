public class LList implements Comparable<LList>{
 protected Node head;
 protected Node tail;
 protected int  size;
 
 /* constructors */
 public LList(){
  head = tail = null;
  size = 0;
 }
 public LList(Node n){
  head = tail = n;
  size = 1;
 }

 /* simple getters */
 public int getSize(){ 
  return size; 
 }
 
 public String get(int position){
  // returns data of element at index position
  // returns null otherwise
  if( position < 0 || position > size -1 || head == null){
   return null;
  }
  int  count = 0;
  Node current = head;
  while(count < position){
   current = current.getNext();
   count += 1;
  }
  return current.getData();
 }
 
 
 /* setter */
 public boolean set(int position, String d){
  // set data of element at given position to d
  // returns true if successful and false otherwise
   if( position < 0 || position > size -1 || head == null){
     return false;
   }
   int count =0;
   Node curr = head;
   Node add = new Node(d);
   while(count < position){
     curr = curr.getNext();
     count += 1;
   }
   curr.setData(d);
   return true;
 }
 
 /* add elements to the list */
 public LList addBack(String d){
  // add to back of list
  Node n = new Node(d);
  if( size == 0 ){
   head = tail = n;
  }else{
   tail.setNext(n);
   tail = n;
  }
  size += 1;
  return this;
 }
 
 public LList addFront(String d){
  // add to front of list
  Node n = new Node(d, head);
  head = n;
  if(size == 0){ tail = n; }
  size += 1;
  return this;
 }
 
 public LList add(int position, String d){
  // add a new node with data d at given position
  // return null if method fails
  if( position < 0 || position > size){
   return null;
  }
  if( position == 0){
   return addFront(d);
  }else if( position == size ){
   return addBack(d);
  }
  // find node at index position-1
  Node prev = head;
  int count = 0;
  while( count < position-1 ){
   count += 1;
   prev = prev.getNext();
  } // prev will point to node before 
  Node n = new Node(d, prev.getNext() );
  prev.setNext(n);
  size += 1;
  return this;
 }
 
 
 public LList swap(int p1, int p2){
   int countP1 = 0, countP2 =0;
   Node tempP1 = head, tempP2=head;
   String dataP1=null, dataP2=null;
   while(countP1 < p1){ 
     tempP1 = tempP1.getNext();
     dataP1 = tempP1.getData();
     countP1+=1;
   }
    while(countP2 < p2){ 
     tempP2 = tempP2.getNext();
     dataP2 = tempP2.getData();
     countP2+=1;
   }
    tempP1.setData(dataP2);
    tempP2.setData(dataP1);
   return this;
 }
 
 
 /* remove elements from the list */
 public String removeFront(){
  // remove x_0 (return data of x_0)
   if(head == null){ return null; }
   Node remove = head;
   head =  remove.getNext();
   size -=1;

  return remove.getData();
 }
 
 public String remove(int position){
  // remove x_position (return data of x_position)
    if( position < 0 || position > size -1 || head == null){
     return null;
   }
   int count =0;
   Node prev = head;
   while(count< position-1){
     prev = prev.getNext();
     count += 1;
   }

   Node remove = prev.getNext();
   if(remove == tail){
     prev.setNext(null);
     tail = prev;
   }else{
   prev.setNext(remove.getNext());
   }
   size -=1;
  return remove.getData();
 } 
 
 /* find element in list */
 public int find(String d){
  // return the first index k such that x_k == d
  // return -1 if d is not in the list
   int index=0;
   Node curr = head;
   while(curr.getData()!=d ){
     index++;
     curr = curr.getNext();
     if(index>=size){return -1;}
   }
   return index;
 }
 
 public static boolean same(LList a, LList b){
   Node currA = a.head;
   Node currB = b.head;
   if( a.getSize() != b.getSize() ){
     return false;
   } else {
     for(int i=0; i<a.getSize(); i++){
       if(currA.getData()!=currB.getData())
         return false;
       currA = currA.getNext();
       currB = currB.getNext();
     }
   }
   return true;
 }
 
 
 @Override
 public int compareTo(LList o){
  return size - o.size;
 }

 
 
 @Override
 public String toString(){
  if( size == 0 || head == null){
   return null;
  }
  String out = "[";
  Node current = head;
  for(int i=0; i<size-1; i=i+1){
   out += current.getData() + "]->[";
   current = current.getNext();
  }
  return out+current.getData() +"]";
 }
}