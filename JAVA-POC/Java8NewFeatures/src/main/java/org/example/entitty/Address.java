package org.example.entitty;

public class Address {

    private Integer pinCode;
    private String city;
    private String buildingName;
    private String area;
    private String landMark;



//  451228,"Kasrwad","Ram Sadan", "ward 14",  "Ram mandir"



    public Address(Integer pinCode, String city, String buildingName, String area, String landMark) {
        this.pinCode = pinCode;
        this.city = city;
        this.buildingName = buildingName;
        this.area = area;
        this.landMark = landMark;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", city='" + city + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", area='" + area + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}
