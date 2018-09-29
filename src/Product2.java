/*Garrett Graber
09/29/2018
This file creates a class called Product2 */

import java.util.Date;

public class Product2 {

  String manufacturer = "OraclProduction";
  int serialNumber;
  Date manufacturedOn;
  String name;

  //Add an integer class variable called currentProductionNumber. This will store the next number
  //to be assigned to serialNumber.
  static int currentProductionNumber;

  //Add a constructor that will take in the name of the product and set this to the field variable
  //name
  public Product2(String name) {
    this.name = name;
    //Also assign a serial number from the currentProductionNumber. The currentProductionNumber
    //should be incremented in readiness for the next instance
    serialNumber = currentProductionNumber++;
    //Set manufacturedOn as the current date and time
    manufacturedOn = new Date();
  }

  //A method setProductionNumber that would have one integer parameter
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
