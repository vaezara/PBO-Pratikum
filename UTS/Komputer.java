public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer() {

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk komputer         : " +merk);
        System.out.println("Kecepatan prosesor    : " +kecProsesor);
        System.out.println("Size memory           : " +sizeMemory);
        System.out.println("Jenis prosesor        : " +jnsProsesor);
    }
}