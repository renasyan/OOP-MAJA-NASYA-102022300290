package MODUL1_NASYA.src;
// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama, brand;
    private int jumlah;
    private double harga;
    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, String brand, int jumlah, double harga) {
        this.nama = nama;
        this.brand = brand;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Todo : Create Method ShowData
    public void showData(){
        System.out.println("_________________________________");
        System.out.println("Nama makanan    : " +nama);
        System.out.println("Jumlah          : " +jumlah);
        System.out.println("harga           : " +harga);
        System.out.println("Brand           : " +brand);
        System.out.println("_________________________________");
    }

}