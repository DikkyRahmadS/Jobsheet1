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
public class LuasPerBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float jari,hasil;
        System.out.println("Masukkan nilai jari-jari : ");
        jari = masukan.nextFloat();
        hasil =  (float) (4 * 3.14 * jari * jari);
        System.out.println("Luas Permukaan Bola : "+hasil);
    }
}
