/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.m1;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class TugasM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        int shift = 1;
        int chip = 0;
        int gold = 50;
        int cable = 0;
        int screen = 0;
        char[] arrSlot = new char [6];
        
        while (true) {
            System.out.println("=============================================");
            System.out.println("                 TECH FACTORY                ");
            System.out.println("=============================================");
            System.out.println("  Shift : " + shift + "    Gold : " + gold);
            System.out.println("  Chip  : " + chip + "     Cable: " + cable);
            System.out.println("  Screen: " + screen);
            System.out.println("---------------------------------------------");
            System.out.println("  Slot Mesin: ");
            for (int i = 0; i < arrSlot.length; i++) {
                if (arrSlot[i] == '\0') {
                    System.out.print("  [ ]");
                }
                else {
                    System.out.print("  [ " + arrSlot[i] + " ]");
                }
                if (i % 3 == 2) {
                    System.out.println();
                }
            }
            System.out.println("---------------------------------------------");
            System.out.println("  1. Kelola Mesin");
            System.out.println("  2. Jual Produk");
            System.out.println("  3. Next Shift");
            System.out.println("  4. Exit");
            System.out.println("=============================================");
            
            System.out.print(">> ");
            int menu = scanner.nextInt();
            
            if (menu == 4) {
                System.out.println("=== TERIMA KASIH TELAH BERMAIN ===");
                System.out.println("  Total Shift : " + shift);
                System.out.println("  Gold AKhir  : " + gold);
                System.out.println("--------------------------------------");
                System.out.println("  Stok AKhir : ");
                System.out.println("  Chip : " + chip +"Cable : " + cable + "Screen: " + screen);
                System.out.println("--------------------------------------");
                System.out.println("  Komposisi Mesin Akhir: ");
                for (int i = 0; i < arrSlot.length; i++) {
                    if (arrSlot[i] == '\0') {
                        System.out.print("  [ ]");
                    }
                    else {
                        System.out.print("  [ " + arrSlot[i] + " ]");
                    }
                    if (i % 3 == 2) {
                        System.out.println();
                    }
                }
                System.out.println("======================================");
                System.out.println("Sampai jumpa di TechFactory!");
                break;
            }
            else if (menu > 4 || menu < 1) {
                System.out.println("Error");
            }
            else {
                if (menu == 1) {
                    while (true) {
                        System.out.println("=== KELOLA MESIN ===");
                        for (int i = 0; i < arrSlot.length; i++) {
                            if (arrSlot[i] == '\0') {
                                System.out.print("  [ ]");
                            }
                            else {
                                System.out.print("  [ " + arrSlot[i] + " ]");
                            }
                            if (i % 3 == 2) {
                                System.out.println();
                            }
                        }
                        System.out.print(" Slot Kosong : ");
                        for (int i = 0; i < arrSlot.length; i++) {
                            if (arrSlot[i] == '\0') {
                                System.out.println(i);
                            }
                        }
                        System.out.println("--------------------------------------------");
                        System.out.println("  1. Beli Mesin");
                        System.out.println("  0. kembali");

                        System.out.print(">> ");
                        int menu1 = scanner.nextInt();

                        if (menu1 == 0) {
                            System.out.println("Akan dikembalikan ke halaman utama!");
                            break;
                        } 
                        else if (menu1 == 1) {
                            while (true) {
                                System.out.println("=== BELI MESIN ===");
                                System.out.println("  Pilih jenis mesin: ");
                                System.out.println("  1. Chip Maker    ");
                                System.out.println("  2. Chip Maker    ");
                                System.out.println("  3. Chip Maker    ");
                                System.out.println("  0. Batal");

                                System.out.print(">> ");
                                int menuBeliMesin = scanner.nextInt();
                                
                                if (menuBeliMesin == 0) {
                                    System.out.println("Akan dikembalikan ke halaman Kelola Mesin");
                                    break;
                                }
                                else if (menuBeliMesin == 1) {
                                    
                                }
                                else {
                                    System.out.println("Error");
                                }
                            }
                                
                        }
                        else {
                            System.out.println("Error");
                        }
                    }
                        
                }
            }
        }
    }
    
}
