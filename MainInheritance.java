package PrakInheritance;
import java.util.Arrays;

public class MainInheritance {
    static Manusia manusia[] ;
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args){
            manusia = new Manusia[3];
            System.out.println("Daftar Manusia");
            System.out.println("=================================================");
            manusia[0] = new Manusia("Ahmad Fahrezy Sanny", "215150600111002",true, false);
            manusia[1] = new Manusia("Achmad Fauzi", "215150600111001",true, false);
            manusia[2] = new Manusia("Rizkya Putri Ramadhan", "215150600111010",false, false);
            System.out.println(manusia[0].toString());
            System.out.println(manusia[1].toString());
            System.out.println(manusia[2].toString());

            mahasiswa = new MahasiswaFilkom[3];
            System.out.println("Daftar Mahasiswa");
            System.out.println("=================================================");
            mahasiswa[0] = new MahasiswaFilkom("21515060011108", 3.5, "Shinomiya Kaguya","353247294812",false,true);
            mahasiswa[1] = new MahasiswaFilkom("215150607111090", 3.9, "Iino Miko","359385205988",false,false);
            mahasiswa[2] = new MahasiswaFilkom("215150601111011", 3.7, "Miyuki Shirogane","3501768905362",true,true);
            System.out.println(mahasiswa[0].toString());
            System.out.println(mahasiswa[1].toString());
            System.out.println(mahasiswa[2].toString());

            pekerja = new Pekerja[3];
            System.out.println("Daftar Pekerja");
            System.out.println("=================================================");
            pekerja[0] = new Pekerja(6, 28, "205225529106","Wahyuni Roona","254",false,true);
            pekerja[1] = new Pekerja(7, 28, "305225329406","Amalia Purnamasari","219",true,false);
            pekerja[2] = new Pekerja(8, 28, "105225729105","Yaasinta Syta","203",false,false);
            System.out.println(pekerja[0].toString());
            System.out.println(pekerja[1].toString());
            System.out.println(pekerja[2].toString());

            manager = new Manager[3];
            System.out.println("Daftar Manager");
            System.out.println("=================================================");
            manager[0] = new Manager(1250, 6, 29, "201225229106","Ananda Rizky","232",false,true);
            manager[1] = new Manager(1155, 7,28, "204225729106","Rafi Kuncoro","232",true,true);
            manager[2] = new Manager(1500, 8,23, "203225129106","Ariq Satria","232",true,false);
            System.out.println(manager[0].toString());
            System.out.println(manager[1].toString());
            System.out.println(manager[2].toString());

            System.out.println("Total Keseluruhan yang Terdaftar");
            System.out.println("=================================================");
            System.out.println("Jumlah Manusia      : " + manusia.length);
            System.out.println("Jumlah Mahasiswa    : " + mahasiswa.length);
            System.out.println("Jumlah Pekerja      : " + pekerja.length);
            System.out.println("Jumlah Manager      : " + manager.length);
    }
}
