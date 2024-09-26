public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " dimatikan.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Nomor Tujuan:" + nomorTujuan);
        System.out.println("Kirim Pesan:" + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Email Tujuan:" + emailTujuan);
        System.out.println("subjek:" + subjek);
        System.out.println("Kirim Pesan:" +pesan);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}