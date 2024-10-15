package MODUL1_NASYA.src;
// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama, bahan;
    private int jumlah;
    private double harga;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, String bahan, int jumlah, double harga) {
        this.nama = nama;
        this.bahan = bahan;
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
    public String getBahan() {
        return bahan;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
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
        System.out.println("Bahan           : " +bahan);
        System.out.println("_________________________________");

    }

}
