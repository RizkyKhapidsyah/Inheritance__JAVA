package com.rizkykhapidsyah.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); //Memanggil Constructor
        System.out.println("Apakah Hewan adalah sebuah Objek  -> " + (hewan instanceof Object));
        System.out.println("Apakah Hewan adalah seekor Hewan  -> " + (hewan instanceof Hewan));
        System.out.println("Apakah Hewan adalah seekor Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah Hewan adalah sebuah Objek  -> " + (kucing instanceof Object));
        System.out.println("Apakah Hewan adalah seekor Hewan  -> " + (kucing instanceof Hewan));
        System.out.println("Apakah Hewan adalah seekor Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------------------------");

        hewan.makan(); //Kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        kucing.makan("Daging Ikan");

        System.out.println("------------------------------------------");

        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "SubTropis");
        Kucing popo = new Kucing("Anggora", "SubTropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss? " + meow.equals(puss));
        System.out.println("meow equals popo? " + meow.equals(popo));

        System.out.println("------------------------------------------");

        Object o = new Kucing();    //kucing adalah Object
        Hewan h = new Kucing();     //kucing adalah Hewan
        Kucing k = new Kucing();    //kucing adalah Kucing

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k; //Bisa langsung di-assign
        Hewan hewanK = k; //Bisa langsungd di-assign

        Kucing kucingK = (Kucing) h; //Tidak bisa langsung di-assign
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; //compile OK tetapi runtime error ClassCastException

    }
}
