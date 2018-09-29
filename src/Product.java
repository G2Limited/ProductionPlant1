/*Garrett Graber
09/29/2018
This file creates an abstract class called Product that will implement the Item interface*/

import java.util.Date;

//Create an abstract type called Product that will implement the Item interface
public abstract class Product implements Item {

  /* Add the following fields to Product
   int serialNumber
   String manufacturer
   Date manufacuredOn
   String name */

  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  //Add an integer class variable called currentProductionNumber. This will store the next number
  //to be assigned to serialNumber.
  static int currentProductNumber;
}
