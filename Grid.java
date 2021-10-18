package doc;
import java.util.Scanner;

public class Grid {
  public Region[] children;
  
  public Grid() {
    children = new Region[9];
    for (int i = 0; i < children.length; i++) {
        this.children[i] = new Region(i);
    }
  }


  public void initCell(int[][] v, boolean[][] d) {
    
    for (int i = 0; i < v.length; i++) {
      
      for (int j = 0; j < v[0].length; j++) {
             
            this.children[i].children[j].setValue(v[i][j]);
            this.children[i].children[j].setDisplay(d[i][j]);
        
      }
    
    }

  }
  

  public int getRespons() {
    
    System.out.println("saisissez votre réponse");
    Scanner key = new Scanner(System.in);
    int result = key.nextInt();
    
    return result; 
  }

  public int[] getCellCoords() {
    
    int[] coords = new int[2];
    System.out.println("saisissez le numero de la region ensuite le numero de la cellule");
    for (int i = 0; i < coords.length; i++) {  
      Scanner key = new Scanner(System.in);
      int tmp = key.nextInt();
      if (tmp >= 0) {
        coords[i] = tmp;
      }
      else {
        System.out.println("vous aves saisie une coordonne none existante");
        i--;
      }
    }

    return coords;
  }


  public void testARespons () {
    int [] coords = getCellCoords();
    boolean lastResult;
    int respons;
    if (!children[coords[0]].children[coords[1]].getDisplay()){
      respons = getRespons();
      lastResult = children[coords[0]].children[coords[1]].isValid(respons);
      if (lastResult){
        System.out.println("Bien jouer!!");
        children[coords[0]].children[coords[1]].setDisplay(lastResult);
      }
      else
        System.out.println("mauvaise réponse");
    }
    else 
      System.out.println("la cellule choisie est déja remplie");
  }
  
  public boolean isFull() {
    boolean full = true;
    for (int i = 0; i < children.length; i++) {
      if (!this.children[i].isComplished())
        full = false;
    }

    return full;
  }
  
}
