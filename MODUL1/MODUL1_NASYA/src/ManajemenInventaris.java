package MODUL1_NASYA.src;
// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;


public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah makanan    : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan Harga makanan    : ");
        double harga = sc.nextDouble();
        System.out.print("Masukkan brand makanan    : ");
        String brand = sc.next();
  
        // Todo : Create a new object for MakananKering
        daftarMakananKering.add(new MakananKering(nama, brand, jumlah, harga));
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah makanan    : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan Harga makanan    : ");
        double harga = sc.nextDouble();
        System.out.print("Masukkan bahan makanan    : ");
        String bahan = sc.next();
        // Todo : Create a new object for MakananBasah
        daftarMakananBasah.add(new MakananBasah(nama, bahan, jumlah, harga));
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makanan : daftarMakananKering ){
                makanan.showData();
            }
            for (MakananBasah makanan : daftarMakananBasah ){
                makanan.showData();
            }
        }
    }
}
