public class Kucing extends Hewan{

    private String ras;

    public Kucing(String ras) {
        this.ras = ras;
    }

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public void suara() {
        // TODO Auto-generated method stub
        System.out.println(super.getNama()+ " Meongg");
    }

    @Override
    public void infoHewan() {
        System.out.println("\nDia adalah seekor kucing!");
        super.infoHewan();
        System.out.println("Ras : " + ras);
    }

    
}
