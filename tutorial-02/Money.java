/**
 * A Money object models money as dollars and cents
 **/
 
public class Money{
  
  /* attributes */ 
  private int dollars = -1;
  private int cents = -1;

  
  public Money(){
  // create an object with zero dollars and cents.
    dollars = 0;
    cents = 0;
  }
  
  public Money(int c){
  // creates a Money object with value as specified by 
   // the input cents. Input value is assumed to satisfy 
   // c >= 0
    if(c>99){
      cents = c%100;
      dollars = (c - cents)/100;
    }else{
      cents = c;
      dollars = 0;
    }
  }
  
  public Money(int d, int c){
  // creates a Money object with total value as specified by 
   // the input values. Input values are assumed to satisfy 
   // d >= 0 and c >= 0.
    dollars = d;
    cents = c;
    if(cents>99){
      cents = c%100;
      dollars += (c-cents)/100;
    }
  }
  
  
  
  /** 
   * Returns a String representation of the value of the current object. 
   * 
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String getMoney(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }
  
  
  
  //===================Add money========================
  public void add(int c){
    // adds c cents to the current value
    int currCents = cents+c;
    cents +=c;
    if(cents>99){
      cents = currCents%100;
      dollars += (currCents - cents)/100;
    }
  }
  
  
  public void add(int d, int c){
    // adds d dollars and c cents to the current value
    int currCents = cents+c;
    dollars += d;
    cents += c;
    if(cents>99){
      cents = currCents%100;
      dollars += (currCents - cents)/100;
    }
  }
  
  
  public int remove(int c){
    // removes c cents from current value 
    //if current  value is large enough. 
    //Otherwise, removes as much as it can.
    // Returns the actual amount of cents removed (may be > 100)
    int currCents = cents-c;
    int all = dollars*100 + cents;
    if(all < c){
      cents = 0;
      dollars = 0;
      return all;
    }else{
      cents -= c;
      if(cents<0){
        cents = 100+(currCents%100);
        dollars -= ((currCents+c)/100+1);
      }
    }
    return c;
  }
  
  
  
}