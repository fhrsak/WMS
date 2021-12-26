package hr.hrsak.wms.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="city_name")
    private String cityName;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @OneToOne(mappedBy = "address")
    private Account account;


    public Address(int id, String cityName, String streetName, double lattitude, double longitude) {
        this.id = id;
        this.cityName = cityName;
        this.streetName = streetName;
        this.latitude = lattitude;
        this.longitude = longitude;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getLattitude() {
        return latitude;
    }

    public void setLattitude(double lattitude) {
        this.latitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
