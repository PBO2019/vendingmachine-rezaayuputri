package com.company;

                                                                                                                                                          import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> kopi   = new ArrayList<String>();
        ArrayList<String>topping = new ArrayList<>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
        robusta.setTopping("gula");
        topping.add(robusta.getTopping());

        MesinKopi florest = new MesinKopi();
        florest.setJenisKopi("Florest");
        florest.setJumlahStokKopi(40);
        kopi.add(florest.getJenisKopi());

        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());


        robusta.setTopping("Cream");
        topping.add(robusta.getTopping());
        robusta.setTopping("gula");
        topping.add(robusta.getTopping());

        MesinKopi susu = new MesinKopi();
        susu.setJenisKopi("Susu");
        susu.setJumlahStokKopi(40);
        kopi.add(susu.getJenisKopi());


        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+topping.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
        int pilihantopping = keyboard.nextInt() -1;

        System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi) + "dengan topping " + topping.get(pilihantopping));
    }
}
