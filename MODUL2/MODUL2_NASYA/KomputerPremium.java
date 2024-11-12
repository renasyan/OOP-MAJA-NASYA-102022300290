class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(boolean ruangPrivat) {
        this.ruangPrivat = ruangPrivat;
    }

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    } 
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    public void informasi(){
        super.Informasi();
        if (ruangPrivat){
            System.out.println("Status          : Ruangan premium");
            System.out.println("\nFASILITAS RUANG PREMIUM");
            System.out.println("- Ruang AC");
            System.out.println("- Sofa geming");
            System.out.println("- Komputer high specs");
            System.out.println("- 100Mbps");
        }else{
            System.out.println("Status          : Ruangan Standar");
            System.out.println("\nFASILITAS RUANG STANDAR");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer low specs");
            System.out.println("- 1Mbps");

        }

        
        System.out.println("=========================================");
    }
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("memesan komputer nomor : " +nomorKomputer);

    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){  
        System.out.println("Memesan makanan : " +makanan);

    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Memesan makanan : " +makanan);
        System.out.println("Memesan minuman : " +minuman);

    }

}
