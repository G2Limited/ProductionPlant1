import java.util.Date;

public class Product2 {

  int serialNumber;
  Date manufacturedOn;
  String name;

  static int currentProductionNumber;

  public Product2(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }

  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  public String setName(String na){
    name = na;
    return name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return "Manufacturer   : " + manufacturer + "\n"
        + "Serial Number    : " + serialNumber + "\n" +
        " Date    : " + manufacturedOn + "\n" +
        " "
  }
}

