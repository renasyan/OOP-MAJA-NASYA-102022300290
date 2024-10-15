public class Penumpang {

    //menyimpan detail setiap penumpang?
    private static String NIK;
    private static  String namaDepan;
    private static String namaBelakang;
    
    // public Penumpang (String NIK, String namaDepan, String namaBelakang){
    //     this.NIK =NIK;
    //     this.namaDepan = namaDepan;
    //     this.namaBelakang = namaBelakang;
    // }
    public static void setNamaDepan(String namaDepan) {
        Penumpang.namaDepan = namaDepan;
    }

    public static void setNIK(String nIK) {
        NIK = nIK;
    }

    public static void setNamaBelakang(String namaBelakang) {
        Penumpang.namaBelakang = namaBelakang;
    }



    public static void tampilDaftarPenumpang(){
        System.out.println("Nomor Induk Kependudukan :" + NIK);
        System.out.println("Nama Depan :" + namaDepan);
        System.out.println("Nama Belakanng :" + namaBelakang);
    }
}
