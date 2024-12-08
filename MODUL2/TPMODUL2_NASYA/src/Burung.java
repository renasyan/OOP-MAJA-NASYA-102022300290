public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void suara() {
        // TODO Auto-generated method stub
        System.out.println(super.getNama()+ " kukukkk");
    }

    @Override
    public void infoHewan() {
        System.out.println("\nDia adalah seekor Burung!");
        super.infoHewan();
        System.out.println("Bulu : " + warnaBulu);
    }

    

}
