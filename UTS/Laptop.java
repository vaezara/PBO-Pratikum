public class Laptop extends Komputer {
    public String jnsBatrei;

    public Laptop() {

    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor); 
        this.jnsBatrei = jnsBatrei;
    }

    @Override
    public void tampilData() {
        super.tampilData(); 
        System.out.println("Jenis Baterai         : " +jnsBatrei);
    }
}
