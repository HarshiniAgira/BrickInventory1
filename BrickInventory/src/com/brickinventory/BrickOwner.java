package com.brickinventory;

public class BrickOwner extends InventoryItem{
    private String address;
    private long phoneNumber;
    public BrickOwner(String name,String address,long phoneNumber) {
        super(name);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    void displayOwnerDetails() {
        System.out.println("Owner Details for " + getName() + ":");
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
}
