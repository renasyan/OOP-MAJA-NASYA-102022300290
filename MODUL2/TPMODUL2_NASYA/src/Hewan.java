public class Hewan {
    private String nama;
    private int umur;
    
    public Hewan(){

    }

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    
    public void suara(){
        System.out.println("Hewan bersuara");
    }

    public void makan(){
        System.out.println(nama+" sedang makan");
    }

    public void makan(String makanan){
        System.out.println(nama+" suka memakan " +makanan);
    }

    public void infoHewan(){
        System.out.println("Detail");
        System.out.println("Nama    : "+nama);
        System.out.println("Umur    : "+umur+" bulan");
    }

}
