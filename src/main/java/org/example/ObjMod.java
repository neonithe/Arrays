package org.example;

import java.time.LocalDate;

public class ObjMod {
    private static int counter =0;
    private int petID;
    private String name;
    private LocalDate birthDate;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ObjMod.counter = counter;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ObjMod(int petID, String name, LocalDate birthDate) {
        petID = ++counter;
        this.name = name;
        this.birthDate = birthDate;


    }
}
