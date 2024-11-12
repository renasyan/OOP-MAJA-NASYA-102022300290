public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer k1 = new Komputer(12, "WARNET GEMING", 50000);
        // To do: Panggillah Method Informasi dari class Komputer
        k1.Informasi();
        System.out.println("=========================================");
        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP kVIP1 = new KomputerVIP(20, "WARNET GEMING ", 70000, true);
        //KomputerVIP kVIP1 = new KomputerVIP(20, "WARNET GEMING ", 70000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        kVIP1.Informasi();
        // To do: Panggillah Method Login
        System.out.println();
        kVIP1.login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        kVIP1.bermain(2);

        kVIP1.bermain(2, 30);
        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
         KomputerPremium kPREM1 = new KomputerPremium(20, "WARNET GEMING", 1000000, true);
        //KomputerPremium kPREM1 = new KomputerPremium(5, "WARNET GEMING", 1000000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        kPREM1.informasi();
        // To do: Panggillah Method Pesan
        kPREM1.pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        kPREM1.TambahLayanan("soto");
        kPREM1.TambahLayanan("soto", "es teh");
       
    }
}