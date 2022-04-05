package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy,kilo,boylarinCarpimi,vucutKitleIndeksi;

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        boylarinCarpimi = boy * boy;

        System.out.println("Vücut Kitle İndeksiniz : ");
        vucutKitleIndeksi = kilo / boylarinCarpimi;

        System.out.println(vucutKitleIndeksi);




    }
}
