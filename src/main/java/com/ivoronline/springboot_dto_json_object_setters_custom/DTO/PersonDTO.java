package com.ivoronline.springboot_dto_json_object_setters_custom.DTO;

public class PersonDTO {

  //PROPERTIES
  public String propName;
  public Float  propHeight;

  //SETTERS
  private void setName(String reqName  ) { this.propName   = reqName;            }
  private void setAge (String reqHeight) { this.propHeight = convert(reqHeight); }

  //CONVERTERS
  public Float convert(String height) {
    String heightFormatted = height.replace(",", ".");          //Height from JSON: Replace dot with comma
    Float  heightFloat     = Float.parseFloat(heightFormatted); //Height for  DTO:  Parse String into Float
    return heightFloat;                                         //Return converted height
  }

}
