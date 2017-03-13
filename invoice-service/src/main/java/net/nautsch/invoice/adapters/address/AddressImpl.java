package net.nautsch.invoice.adapters.address;

import net.nautsch.invoice.Address;

/**
 * tolerant reader for address data.
 */
class AddressImpl implements Address {

    private String surname;
    private String firstName;
    private String streetName;
    private String title;

    @Override
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getStreet() {
//        return "Limmat"; // :trollface:
        return streetName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
