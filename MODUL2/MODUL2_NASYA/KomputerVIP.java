

class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(boolean vipCard) {
        this.vipCard = vipCard;
    }

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;    
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    @Override
    public void Informasi(){
        super.Informasi();
        if (vipCard) {
            System.out.println("Status          : Member VIP");
            System.out.println("\nBenefit Member VIP");
            System.out.println("- Diskon 10%");
            System.out.println("- Gratis minuman");
            System.out.println("- Komputer gaming");
        } else {
            System.out.println("Status          : Non VIP");
            System.out.println("\nBenefit\nGa ada, ayo subkreb vip.");
        }
        
        System.out.println("=========================================");
    }

    // To do: Buatlah method Login sesuai dengan ketentuan

    public void login(String username){
        System.out.println("Username     : " +username);
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam){
        System.out.println("Bermain selama " +jam+"jam");
    }

    public void bermain(int jam, int menitTambahan){
        System.out.println("Nambah bermain selama " +jam+"jam " +menitTambahan+ " menit.");

    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}