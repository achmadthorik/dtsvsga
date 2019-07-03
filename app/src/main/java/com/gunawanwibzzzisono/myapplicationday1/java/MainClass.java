package com.gunawanwibzzzisono.myapplicationday1.java;

import com.gunawanwibzzzisono.myapplicationday1.java.kendaraan.*;
import com.gunawanwibzzzisono.myapplicationday1.java.music.Gitar; //IMPORT KELAS GITAR

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi();//class gitar -> bunyi adalah nama fungsi

        Gitar gitar = new Gitar();
        motor.jumlahBan();
        mobil.jumlahBan();
        kereta.jumlahBan();

        int nilaiA = 58;
        float nilaiB = 87;
        double nilaiC = 80;
        double kurang = nilaiC - nilaiA;
        double bagi = nilaiA / nilaiB;
        System.out.println("Kurang : "+kurang);
        System.out.println("Bagi   : "+bagi);

        String namaDepan = "Achmad";
        String namaAkhir = "torik";

        System.out.println("===========================");
        System.out.println(namaDepan+" "+namaAkhir);
        System.out.println("===========================");
        System.out.println(namaDepan.equals(namaAkhir));

    }
}
