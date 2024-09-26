public class Main {
    public static void main(String[] args) {
        //Membuat objek dari class Handphone
        Handphone hp = new Handphone("Samsung", "Galaxy A52");
        String[] daftarNomor = {"0812345", "084567", "0298876"};

        hp.nyalakan();
        hp.kirimPesan("0812345", "Halo");
        hp.kirimPesan("812345", "0813456", "Tolong");
        hp.kirimPesan(daftarNomor, "Apa kabar?");
        hp.matikan();
        System.out.println();

        //Membuat objek dari class Smartphone
        Smartphone Redmi = new Smartphone("Redmi", "Note 13 Pro");

        Redmi.nyalakan();
        Redmi.kirimPesan("081234", "Ayo mabar");
        Redmi.kirimPesan("a@gmail.com", "Izin mengirim email", "Ayo login");
        Redmi.aksesInternet();
        Redmi.matikan();

        System.out.println();

        //Membuat objek dari class FeaturePhone
        FeaturePhone nokia = new FeaturePhone("Nokia", "3310");

        nokia.nyalakan();
        nokia.mainGameSnake();
        nokia.matikan();
    }
}