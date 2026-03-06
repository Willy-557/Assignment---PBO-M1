/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.m1;

import java.util.Random;
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
        Random rand = new Random();
        
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
            System.out.println("Chip: +" + chip +"  |  Cable: +"+ cable +"  |  Screen: +"+ screen +"  ");
            System.out.println("---------------------------------------------");
            System.out.println("  Slot Mesin: ");
            for (int i = 0; i < arrSlot.length; i++) {
                if (arrSlot[i] == '\0') {
                    System.out.print("[ ]");
                }
                else {
                    System.out.print("[" + arrSlot[i] + "]");
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
                System.out.println("  Chip : " + chip +"     Cable : " + cable + "     Screen: " + screen);
                System.out.println("--------------------------------------");
                System.out.println("  Komposisi Mesin Akhir: ");
                for (int i = 0; i < arrSlot.length; i++) {
                    if (arrSlot[i] == '\0') {
                        System.out.print("[ ]");
                    }
                    else {
                        System.out.print("[" + arrSlot[i] + "]");
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
                                System.out.print("[ ]");
                            }
                            else {
                                System.out.print("[" + arrSlot[i] + "]");
                            }
                            if (i % 3 == 2) {
                                System.out.println();
                            }
                        }
                        System.out.print(" Slot Kosong : ");
                        for (int i = 0; i < arrSlot.length; i++) {
                            if (arrSlot[i] == '\0') {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.println();
                        System.out.println("--------------------------------------------");
                        System.out.println("  1. Beli Mesin");
                        System.out.println("  0. kembali");

                        System.out.print(">> ");
                        int menu1 = scanner.nextInt();

                        if (menu1 == 0) {
                            System.out.println("Kembali ke menu utama.!");
                            break;
                        } 
                        else if (menu1 == 1) {
                            while (true) {
                                System.out.println("=== BELI MESIN ===");
                                System.out.println("  Pilih jenis mesin: ");
                                System.out.println("  1. Chip Maker   (50G) - produksi 1-3 Chip/shift   @15G");
                                System.out.println("  2. Cable Maker  (30G) - produksi 2-4 Cable/shift  @8G");
                                System.out.println("  3. Screen Maker (80G) - produksi 1-2 Screen/shift @25G");
                                System.out.println("  0. Batal");

                                System.out.print(">> ");
                                int menuBeliMesin = scanner.nextInt();
                                
                                if (menuBeliMesin == 0) {
                                    System.out.println("Akan dikembalikan ke halaman Kelola Mesin");
                                    break;
                                }
                                else if (menuBeliMesin < 1 || menuBeliMesin > 3){
                                    System.out.println("Error");
                                }
                                else {
                                    if (menuBeliMesin == 1) {
                                        if (gold >= 50) {
                                            System.out.print("Pilih slot kosong (0-5): ");
                                            int slotChip = scanner.nextInt();

                                            if (arrSlot[slotChip] == '\0') {
                                                gold -= 50;
                                                arrSlot[slotChip] = 'C';
                                                System.out.println("Chip Maker berhasil dipasang di slot " + slotChip + "!");
                                            }
                                            else {
                                                System.out.println("Slot ini telah ditempati oleh mesin lain");
                                            }
                                        }
                                        else {
                                            System.out.println("Gold anda tidak mencukupi untuk membeli mesin ini!");
                                        }
                                    }
                                    else if (menuBeliMesin == 2) {
                                        if (gold >= 30) {
                                            System.out.print("Pilih slot kosong (0-5): ");
                                            int slotCable = scanner.nextInt();

                                            if (arrSlot[slotCable] == '\0') {
                                                gold -= 30;
                                                arrSlot[slotCable] = 'B';
                                                System.out.println("Cable Maker berhasil dipasang di slot " + slotCable + "!");                                            
                                            }
                                            else {
                                                System.out.println("Slot ini telah ditempati oleh mesin lain");
                                            }
                                        }
                                        else {
                                            System.out.println("Gold anda tidak mencukupi untuk membeli mesin ini!");
                                        }
                                    }
                                    else if (menuBeliMesin == 3) {
                                        if (gold >= 80) {
                                            System.out.print("Pilih slot kosong (0-5): ");
                                            int slotScreen = scanner.nextInt();

                                            if (arrSlot[slotScreen] == '\0') {
                                                gold -= 80;
                                                arrSlot[slotScreen] = 'S';
                                                System.out.println("Screen Maker berhasil dipasang di slot " + slotScreen + "!");
                                            }
                                            else {
                                                System.out.println("Slot ini telah ditempati oleh mesin lain");
                                            }
                                        }
                                        else {
                                            System.out.println("Gold anda tidak mencukupi untuk membeli mesin ini!");
                                        } 
                                    }
                                }
                            }       
                        }
                        else {
                            System.out.println("Error");
                        }
                    }      
                }
                else if (menu == 2) {
                    while (true) {
                        System.out.println("=== JUAL PRODUK ===");
                        System.out.println("  1. Chip    (stok:"+chip  + ") -> 15 Gold/pcs");
                        System.out.println("  2. Cable   (stok:"+cable + ") ->  8 Gold/pcs");
                        System.out.println("  3. Screen  (stok:"+screen+ ") -> 25 Gold/pcs");
                        System.out.println("  0. Kembali");
                        
                        System.out.print(">> ");
                        int menuJual = scanner.nextInt();
                        
                        if (menuJual == 0) {
                            System.out.println("Kembali ke halaman utama.");
                            break;
                        }
                        else if (menuJual > 3 || menuJual < 0) {
                            System.out.println("Error");
                        }
                        else {
                        
                        }
            }
        }
    }
    
}
