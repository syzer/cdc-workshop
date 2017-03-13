package net.nautsch.invoice.adapters.address;

import net.nautsch.invoice.Address;

/**
 * tolerant reader for address data.
 */
class AddressImpl implements Address {

    private String surname;
    private String firstName;
    private String streetName;

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
        //TODO provider provider wrong value here
        return "Limmat";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
