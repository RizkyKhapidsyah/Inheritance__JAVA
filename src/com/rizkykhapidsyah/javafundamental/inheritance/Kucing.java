package com.rizkykhapidsyah.javafundamental.inheritance;

public class Kucing extends Hewan implements Mamalia {

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Kucing() {
        //super(); //Akan Tetap Memanggil Constructor Dari Parent Class
        System.out.println("Construct Kucing");
    }

    public void makan() { //Overriding
        System.out.println("Kucing Sedang Makan");
    }

    public void makan(String food) { //Overloading
        System.out.println("Kuncing makan " + food);
    }
}
