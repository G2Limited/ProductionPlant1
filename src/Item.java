import java.util.Date;

public interface Item {
  String manufacturer = "OraclProduction";
  public void setProductionNumber(int productionNumber);
  public void setName(String name);

  public String getName();
  public Date getManufactureDate();
  public int getSerialNumber();
}
