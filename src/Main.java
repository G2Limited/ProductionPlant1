/*Garrett Graber
09/29/2018
Sources used: Professor Scott VanSelow, https://www.javatpoint.com/
, https://docs.oracle.com/javase/tutorial/java
This file creates the driver class Main */

public class Main {

  public static void main(String[] args) {
    //create new objects from class Widget
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
  }
}

