/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.util.Scanner;

/**
 *
 * @author user
 * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                     perhitungan lingkaran
 */
public class Lingkaran {
    static Scanner scan = new Scanner(System.in);
    static double phi = Math.PI;
    static String diameter;
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.Input();
        double jarijari = lingkaran.hitungJarijari(diameter);
        double luas = lingkaran.hitungLuas(jarijari,phi);
        double keliling = lingkaran.hitungKeliling(jarijari,phi);
        lingkaran.tampil(jarijari, luas, keliling);
    }
    
    public static void tampil(double jarijari, double luas, double keliling){
       System.out.println("Nilai Jari-Jari Lingkaran adalah " + jarijari);
       System.out.println("Nilai Luas Lingkaran adalah " + luas);
       System.out.println("Nilai Keliling Lingkaran adalah " + keliling);
    }
   
    public static void validasiAlert(boolean valid){
        if(valid){
            System.out.println("Nilai Diameter tidak sesuai!");
        }
    }
    
    private double hitungKeliling(double jarijari, double phi){
        double keliling = 2 * phi * jarijari;
        return keliling;
    }
    private double hitungLuas(double jarijari, double phi){
       double luas = phi * jarijari * jarijari;
       return luas; 
    }
     private double hitungJarijari(String diameter){
       double d_diameter = Double.parseDouble(diameter);
       return d_diameter / 2;
    }
     
    public static boolean isNum(Object object){
        if(object instanceof Integer){
            return true;
        }else{
            String string = object.toString();
            try{
                Integer.parseInt(string);
            } catch(Exception e){
                return false;
            }
        }
        return true;
    }
}
