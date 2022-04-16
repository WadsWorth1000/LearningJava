package org.robey;

public class Person {
    private String name;
    private int phoneNumber;
    private int numberOfLives = 1;

    private String socialSecurityNumber;

    public void insert() {
        //DB.send(name, phoneNumber);
    }

    public void extraLife() {
        numberOfLives++;
    }

    public int getNumberOfLives(){
        return numberOfLives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
