package net.nautsch.address;

public class Address {

    private final String id;
    private final String firstName;
    private final String surname;
    private final String street;

    public Address(String id, String surname, String firstName, String street) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.street = street;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

}
