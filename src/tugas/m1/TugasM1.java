package tugas.m1;

import java.util.Random;
import java.util.Scanner;

public class TugasM1 {
    public static void main(String[] args) {
        
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
                                            
                                            if (slotChip > 5 || slotChip < 0) {
                                                System.out.println("Slot yang tersedia hanya 0 - 5");
                                            }
                                            else {
                                                if (arrSlot[slotChip] == '\0') {
                                                    gold -= 50;
                                                    arrSlot[slotChip] = 'C';
                                                    System.out.println("Chip Maker berhasil dipasang di slot " + slotChip + "!");
                                                }
                                                else {
                                                    System.out.println("Slot ini telah ditempati oleh mesin lain");
                                                }
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
                                            
                                            if (slotCable > 5 || slotCable < 0) {
                                                System.out.println("Slot yang tersedia hanya 0 - 5");
                                            }
                                            else {
                                                if (arrSlot[slotCable] == '\0') {
                                                    gold -= 30;
                                                    arrSlot[slotCable] = 'B';
                                                    System.out.println("Cable Maker berhasil dipasang di slot " + slotCable + "!");                                            
                                                }
                                                else {
                                                    System.out.println("Slot ini telah ditempati oleh mesin lain");
                                                }
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
                                            
                                            if (slotScreen > 5 || slotScreen < 0) {
                                                System.out.println("Slot yang tersedia hanya 0 - 5");
                                            }
                                            else {
                                                if (arrSlot[slotScreen] == '\0') {
                                                    gold -= 80;
                                                    arrSlot[slotScreen] = 'S';
                                                    System.out.println("Screen Maker berhasil dipasang di slot " + slotScreen + "!");
                                                }
                                                else {
                                                    System.out.println("Slot ini telah ditempati oleh mesin lain");
                                                }
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
                            if (menuJual == 1){
                                System.out.print("Jual berapa Chip? (maks: "+chip+"): ");
                                int jualChip = scanner.nextInt();
                                
                                if (jualChip <= chip) {
                                    int totalJualChip = 15 * jualChip;
                                    gold += totalJualChip;
                                    chip -= jualChip;
                                    System.out.println("Berhasil jual " + jualChip + " Chip! Gold bertambah " + totalJualChip + ".");
                                }
                                else {
                                    System.out.println("Tidak bisa dijual, dikarenakan melebih dari stock yang tersedia!");
                                }
                            }
                            else if (menuJual == 2){
                                System.out.print("Jual berapa Cable? (maks: "+cable+"): ");
                                int jualCable = scanner.nextInt();
                                
                                if (jualCable <= cable) {
                                    int totalJualCable = 8 * jualCable;
                                    gold += totalJualCable;
                                    cable -= jualCable;
                                    System.out.println("Berhasil jual " + jualCable + " Cable! Gold bertambah " + totalJualCable + ".");
                                }
                                else {
                                    System.out.println("Tidak bisa dijual, dikarenakan melebih dari stock yang tersedia!");
                                }
                            }
                            else if (menuJual == 3){
                                System.out.print("Jual berapa Screen? (maks: "+screen+"): ");
                                int jualScreen = scanner.nextInt();
                                
                                if (jualScreen <= screen) {
                                    int totalJualScreen = 25 * jualScreen;
                                    gold += totalJualScreen;
                                    screen -= jualScreen;
                                    System.out.println("Berhasil jual " + jualScreen + " Screen! Gold bertambah " + totalJualScreen + ".");
                                }
                                else {
                                    System.out.println("Tidak bisa dijual, dikarenakan melebih dari stock yang tersedia!");
                                }
                            }
                        }
                    }
                }
                
                else if (menu == 3) {
                    int tempChip = 0;
                    int tempCable = 0;
                    int tempScreen = 0;
                    System.out.println("=== NEXT SHIFT ===");
                    System.out.println("  Mesin bekerja...");
                    System.out.println("");
                    for (int i = 0; i < arrSlot.length; i++) {
                        if (arrSlot[i] == '\0') {
                            continue;
                        }
                        else {
                            if (arrSlot[i] == 'C') {
                                int chipRandomNumber = rand.nextInt(3)+1;
                                tempChip += chipRandomNumber;
                                chip += chipRandomNumber;
                                System.out.println("[C] Chip Maker di slot " + i + " -> produksi " + chipRandomNumber + " Chip");
                            }
                            else if (arrSlot[i] == 'B') {
                                int cableRandomNumber = rand.nextInt(3)+2;
                                tempCable += cableRandomNumber;
                                cable += cableRandomNumber;
                                System.out.println("[B] Cable Maker di slot " + i + " -> produksi " + cableRandomNumber + " Cable");
                            }
                            else if (arrSlot[i] == 'S') {
                                int screenRandomNumber = rand.nextInt(2)+1;
                                tempScreen += screenRandomNumber;
                                screen += screenRandomNumber;
                                System.out.println("[S] Screen Maker di slot " + i + " -> produksi " + screenRandomNumber + " Screen");
                            }
                        }
                    }
                    System.out.println("-------------------------------");
                    System.out.println("Produksi selesai! Shift " + shift + " berakhir.");
                    shift++;
                    System.out.println("Total produksi shift ini:");
                    System.out.println("Chip: +" + tempChip +"  |  Cable: +"+ tempCable +"  |  Screen: +"+ tempScreen +"  ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Shift berikutnya: " + shift);
                    tempChip = 0;
                    tempCable = 0;
                    tempScreen = 0;
                }
            }
        }
    }
}