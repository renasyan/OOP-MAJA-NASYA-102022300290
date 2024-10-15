import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {

public static Penerbangan pilihanPenerbangan;


    public static void detailTiket(){
        if (pilihanPenerbangan != null) {
            System.out.println("\n====== Detail Tiket Penerbangan ======");
            Penumpang.tampilDaftarPenumpang();
            pilihanPenerbangan.tampilDaftarPenerbangan();
        } else{
            System.out.println("Mohon pilih penerbangan terlebih dahulu");
        }
        // System.out.println("");
        // tes.tampilDaftarPenumpang();
    }

    public static void beliTiket(){
        pilihanPenerbangan = null;
        Scanner scanner = new Scanner(System.in);
        int idx = 1;

        System.out.println("\nSilahkan masukan data diri anda");
        System.out.print("NIK  : ");
        Penumpang.setNIK(scanner.nextLine());

        System.out.print("Nama Depan  : ");
        Penumpang.setNamaDepan(scanner.nextLine());

        System.out.print("Nama Belakang  : ");
        Penumpang.setNamaBelakang(scanner.nextLine());

        System.out.println("\nTerima kasih telah mengisi data pelanggan. SIlahkan pilih tiket penerbangan yang tersedia.");
        System.out.println("\n------------------------------------------------------------------------------------------");
        ArrayList<Penerbangan> dataPenerbangan = daftarPenerbangan();
        
        System.out.print("\nPilih penerbangan yang tersedia : ");
        int choosePenerbangan = scanner.nextInt();
        for (Penerbangan data : dataPenerbangan){
            if (choosePenerbangan == idx) {
                // System.out.println("\n"+idx);
                // System.out.println(data.getNomorPenerbangan());
                // data.tampilDaftarPenumpang();
                pilihanPenerbangan = data;
            }
            idx++;
        }       
        
        if (pilihanPenerbangan == null) {
                // System.out.println(pilihanPenerbangan);
                System.out.println("Pilihan penerbangan tidak tersedia");
        }

    }

    public static ArrayList<Penerbangan> daftarPenerbangan(){
        int idx = 0;
        ArrayList<Penerbangan> dataPenerbangan = new ArrayList<>();
        dataPenerbangan.add(new Penerbangan("GA101","CGK,Jakarta","DPS, Bali","06:30","08:15",1200000));
        dataPenerbangan.add(new Penerbangan("QZ202","SUB, Surabaya","KNO, Medan","09:00","11:45",1350000));

        for (Penerbangan data : dataPenerbangan){
            idx++;
            System.out.println("\n"+idx);
            data.tampilDaftarPenerbangan();
        }

        return dataPenerbangan;
    }


    public static void main(String[] args) throws Exception {
        int chooseMenu;
        // String[] dataPenumpang = null;

        Scanner scanner = new Scanner(System.in);

        do { 
            System.out.println("\n==== EAD Ticket Booking System ===");
            System.out.println("1. Tampilkan daftar penerbangan");
            System.out.println("2. Beli tiket");
            System.out.println("3. Tampilkan Pesanan tiket");
            System.out.println("4. Exit");
    
            System.out.print("Silahkan pilih menu:");
            chooseMenu = scanner.nextInt();

            switch (chooseMenu) {
                case 1:
                    daftarPenerbangan();
                    break;
                case 2:
                    beliTiket();
                    break;
                case 3:
                    detailTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            
        } while (chooseMenu != 4);

        scanner.close();
    }
}
