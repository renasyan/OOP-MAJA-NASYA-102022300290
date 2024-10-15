public class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket){
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.hargaTiket = hargaTiket;
        this.nomorPenerbangan = nomorPenerbangan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }
    
    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan(){
        System.out.println("Nomor Penerbangan : "+nomorPenerbangan);
        System.out.println("Bandara Keberangkatan : "+bandaraKeberangkatan+"----> Bandara Tujuan : "+bandaraTujuan);
        System.out.println("Waktu Keberangkatan : "+waktuKeberangkatan+"----> Waktu Kedatangan : "+waktuKedatangan);
        System.out.println("Harga Tiket : Rp."+hargaTiket);

    }
}
