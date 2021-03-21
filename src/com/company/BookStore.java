package com.company;

//# Feature: Abstract Class
public abstract class BookStore {
    private String nameBookStore;
    private String addressBookStore;

    public String getNameBookStore() {
        return nameBookStore;
    }

    public void setNameBookStore(String nameBookStore) {
        this.nameBookStore = nameBookStore;
    }

    public String getAddressBookStore() {
        return addressBookStore;
    }

    public void setAddressBookStore(String addressBookStore) {
        this.addressBookStore = addressBookStore;
    }

    protected BookStore(String nameBookStore, String addressBookStore) {
        this.nameBookStore = nameBookStore;
        this.addressBookStore = addressBookStore;
    }
}
