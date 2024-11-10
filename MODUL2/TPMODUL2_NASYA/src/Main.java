public class Main {
    public static void main(String[] args) throws Exception {

        Kucing k1 = new Kucing("Isaac", 12, "Mainecoon");
        Kucing k2 = new Kucing("Totboheli", 5, "Domestic");
        Burung b1 = new Burung("Rudi", 2, "Merah");

        k1.infoHewan();
        k1.suara();
        k1.makan();
        k1.makan("Ikan");

        k2.infoHewan();
        k2.suara();
        k2.makan();
        k2.makan("Ayam");
        
        b1.infoHewan();
        b1.suara();
        b1.makan();
        b1.makan("biji bijian");
    }
}
