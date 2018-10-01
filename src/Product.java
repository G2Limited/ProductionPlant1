import java.util.Date;

public abstract class Product {

  //Add the following fields to Product
  // int serialNumber
  // String manufacturer
  // Date manufacuredOn
  // String name
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber = 1;

  public Product(String n) {
    name = n;
    //Also assign a serial number from the currentProductionNumber. The currentProductionNumber
    //should be incremented in readiness for the next instance
    serialNumber = currentProductionNumber++;
    //Set manufacturedOn as the current date and time
    manufacturedOn = new Date();
  }

  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  //A method setName that would have one String parameter
  public String setName(String na) {
    name = na;
    return name;
  }

  //A method getName that would return a String
  public String getName() {
    return name;
  }

  /*Add a toString method that will return the following: (example data shown).
  Manufacturer : OraclProduction
  Serial Number : 1
  Date : Thu May 14 15:18:43 BST 2015
  Name : Product Name*/

  public String toString() {
    return "Manufacturer  : " + manufacturer + "\n"
        +
        "Serial Number : " + serialNumber + "\n"
        +
        "Date          : " + manufacturedOn + "\n"
        +
        "Name          : " + name + "\n";
  }
}