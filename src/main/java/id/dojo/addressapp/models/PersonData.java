package id.dojo.addressapp.models;

import java.io.Serializable;
import java.time.LocalDate;

public class PersonData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String street;
    private int postalCode;
    private String city;
    private LocalDate birthday;

    public PersonData() {}

    public PersonData(String firstName, String lastName, String street, int postalCode, String city, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.birthday = birthday;
    }

    // Getters and setters here
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public int getPostalCode() { return postalCode; }
    public void setPostalCode(int postalCode) { this.postalCode = postalCode; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public LocalDate getBirthday() { return birthday; }
    public void setBirthday(LocalDate birthday) { this.birthday = birthday; }
}
