//Create an enum called ItemType that will
//store the following information
//Type          Code
//Audio          AU
//Visual         VI
//AudioMobile    AM
//VisualMobile   VM

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private final String code;

  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}

