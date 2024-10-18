public class Main {
    public static void main(String[] args) {
        
        //Komputer
        Komputer komputer = new Komputer("Asus", 3200, 16, "Intel i7");
        System.out.println("Data Komputer :");
        komputer.tampilData();
        System.out.println();

        //Pc
        Pc pc = new Pc("HP", 2400, 16, "AMD Ryzen 5", 24);
        System.out.println("Data PC :");
        pc.tampilData();
        System.out.println();

        //Laptop
        Laptop laptop = new Laptop("Dell", 2600, 12, "Intel i5", "Lithium-ion");
        System.out.println("Data Laptop:");
        laptop.tampilData();
        System.out.println();

        //Mac
        Mac mac = new Mac("Apple", 3000, 16, "M1", "Lithium Polymer", "FileVault");
        System.out.println("Data Mac:");
        mac.tampilData();
        System.out.println();
 
        //Windows
        Windows windows = new Windows("Lenovo", 2800, 8, "Intel i5", "Lithium-ion", "Windows Hello");
        System.out.println("Data Windows:");
        windows.tampilData();
        System.out.println();
    }
}
