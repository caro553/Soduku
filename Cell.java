package doc;

public class Cell {
  private int index;
  private boolean display;
  private int value;

  public Cell (int i) {
    this.index = i;
  }

  public boolean isValid (int respons) {
    return (respons == value);  
  }

  public int getValue () {
    return this.value;
  }
  public void setValue (int v) {
    this.value = v;
  } 
  
  public boolean getDisplay () {
    return this.display;
  }
  public void setDisplay (boolean d) {
    this.display = d;
  } 

  public String toString() {
    return "the value is : " + this.value + " and my position is : " + this.index + " and my display is " +
      display;
  }
}
