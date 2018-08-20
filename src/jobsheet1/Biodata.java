/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cheeettoozzz
 */
public class Biodata {
    public static void main(String[] args) throws IOException {
        String nama,nis,tempatlahir,tanggallahir,jeniskelamin,alamat,motto ;
        InputStreamReader Isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(Isr);
        System.out.print(" Inputkan Nama                :");
        nama = br.readLine();
        System.out.print(" Inputkan NIS                 :");
        nis = br.readLine();
        System.out.print(" Inputkan Tempat Lahir        :");
        tempatlahir = br.readLine();
        System.out.print(" Inputkan Tanggal Lahir       :");
        tanggallahir = br.readLine();
        System.out.print(" Inputkan Jenis Kelamin       :");
        jeniskelamin = br.readLine();
        System.out.print(" Inputkan Alamat di Malang    :");
        alamat = br.readLine();
        System.out.print(" Inputkan Motto Hidup         :");
        motto = br.readLine();
        
        
        System.out.println( " ================================= ") ;
        System.out.println( " Biodata ");
        System.out.println( " Nama              : "+nama) ;
        System.out.println( " Nis               : "+nis) ;
        System.out.println( " Tempat Lahir      : "+tempatlahir) ;
        System.out.println( " Tanggal Lahir     : "+tanggallahir) ;
        System.out.println( " Jenis Kelamin     : "+jeniskelamin) ;
        System.out.println( " Alamat di Malang  : "+alamat) ;
        System.out.println( " Motto Hidup       : "+motto) ;
        System.out.println( " ================================= ") ;
    }
    
}
