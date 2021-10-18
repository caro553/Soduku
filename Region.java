package doc;
import java.util.ArrayList;

public class Region {
  public Cell[] children;
  private int position;

  public Region(int p) {
    this.position = p;
    children = new Cell[9];
    for (int i = 0; i < children.length; i++) {
        this.children[i] = new Cell(i);
    }
  }

  //method to verify if the region is filled with correct values
  public boolean isComplished() {
    boolean complished = true;
    for (int i = 0; i < children.length; i++) {
      if (!this.children[i].getDisplay())
        complished = false;
    }

    return complished;
  }

}
