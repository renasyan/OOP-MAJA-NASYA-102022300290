class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    
    // To do: Buatlah constructor pada class Komputer
    public Komputer() {

    }
    
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }


    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    public String getNamaWarnet() {
        return namaWarnet;
    }

    public void setNamaWarnet(String namaWarnet) {
        this.namaWarnet = namaWarnet;
    }

    public float getHargaPerJam() {
        return hargaPerJam;
    }

    public void setHargaPerJam(float hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)


    public void Informasi(){

        System.out.println("\nINFORMASI KOMPUTER");
        System.out.println("Jumlah komputer : " +jumlahKomputer);
        System.out.println("Nama warnet     : "+namaWarnet);
        System.out.println("Harga per jam   : "+hargaPerJam);


        
    }

}