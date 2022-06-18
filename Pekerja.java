package PrakInheritance;

public class Pekerja extends Manusia {
    private double gaji, bonus;
    private int jamKerja, hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public double getGaji() {
        gaji = this.hariKerja*this.jamKerja * 15;
        return gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        double bonusLembur;
        double bonusLibur;
        bonusLembur = ((hariKerja / 7) * 5 + (hariKerja % 7)) * (jamKerja - 7) * 5;
        bonusLibur = (hariKerja / 7) * 2 * jamKerja * 20;

        if (jamKerja <= 7){
            return bonusLibur;
        }else{
            return bonusLibur + bonusLembur;
        }
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public int getJamKerja() {
        return jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }
    public int getHariKerja() {
        return hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public String getNIP() {
        return NIP;
    }

    public double gaji(){
        return (getHariKerja() * getJamKerja() * getGaji());
    }


    public String getStatus(){
        String kantor = "";
        String dep = "";
        String cab;

        switch (NIP.substring(0,1)){
            case "1":
                kantor = "Mondstadt";
                break;
            case "2":
                kantor = "Liyue";
                break;
            case "3":
                kantor = "Inazuma";
                break;
            case "4":
                kantor = "Sumeru";
                break;
            case "5":
                kantor = "Fontaine";
                break;
            case "6":
                kantor = "Natlan";
                break;
            case "7":
                kantor = "Snezhnaya";
                break;
        }
        cab =" cabang " +NIP.substring(2,3);
        switch (NIP.substring(6,7)){
            case "1":
                dep = "Pemasaran";
                break;
            case "2":
                dep = "Riset";
                break;
            case "3":
                dep = "Riset";
                break;
            case "4":
                dep = "Teknologi";
                break;
            case "5":
                dep = "Personalia";
                break;
            case "6":
                dep = "Akademik";
                break;
            case "7":
                dep = "Administrasi";
                break;
            case "8":
                dep = "Operasional";
                break;
            case "9":
                dep = "Pembangunan";
                break;
        }
        return dep + " , " + kantor + " "+ cab ;
    }
     public String toString(){
         boolean jenisKelamin = false;
         System.out.println("Nama                 :" + this.getNama());
         System.out.println("NIK                  :" + this.getNIK());
         System.out.println("Jenis Kelamin        :" + (jenisKelamin?"Laki-laki":"Perempuan"));
         System.out.println("Pendapatan           :" + (this.getGaji()+this.getBonus()+this.getTunjangan()));
         System.out.println("Bonus                :" + this.getBonus() + "$");
         System.out.println("Gaji                 :" + this.getGaji() + "$");
         System.out.println("Status               :" + this.getStatus());
         return"";
     }
}
