package PrakPolymorphism;

public class Pegawai {
    private String nama, noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }
    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public double gaji(){
        return 0 ;
    }

    @Override
    public String toString() {
        return "No KTP : " +
                this.noKTP;
    }
}
