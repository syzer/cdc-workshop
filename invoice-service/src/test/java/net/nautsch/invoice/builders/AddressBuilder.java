package net.nautsch.invoice.builders;

import net.nautsch.invoice.Address;

/**
 * test data builder.
 */
public class AddressBuilder {

    private String surname = "surname";
    private String firstname = "firstname";
    private String streetname = "streetname";
    private String title = "title";

    AddressBuilder() {
        super();
    }

    public Address build() {
        return new AddressDummy();
    }

    public AddressBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public AddressBuilder withForename(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public AddressBuilder withStreet(String streetname) {
        this.firstname = streetname;
        return this;
    }

    private class AddressDummy implements Address {
        @Override
        public String getSurname() {
            return surname;
        }

        public String getFirstName() {
            return firstname;
        }

        @Override
        public String getStreet() {
            return streetname;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
