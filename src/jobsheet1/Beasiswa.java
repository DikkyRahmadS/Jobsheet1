/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM
 */
public class Beasiswa {
    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
        System.out.println("Masukkan Nilai TPA :");
        int TPA = masukan.nextInt();
        System.out.println("Masukkan Nilai Bahasa Inggris :");
        int BahasaInggris = masukan.nextInt();
        if ((TPA>85) && (BahasaInggris>80))
            System.out.println("Siswa Mendapat Beasiswa");
        else
            System.out.println("Siswa tidak mendapat beasiswa");
            
    }
}
