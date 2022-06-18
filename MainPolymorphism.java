package PrakPolymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("Ahmad Fahrezy Sanny", "3171111111111111", 5500000);
        PegawaiTetap pt2 = new PegawaiTetap("Achmad Fauzi", "3171222222222222", 3400000);
        PegawaiTetap pt3 = new PegawaiTetap("Rizkya Putri Ramadhan", "3171333333333333", 7000000);

        System.out.println("========== Daftar Pegawai Tetap ==========");
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());

        PegawaiHarian ph1 = new PegawaiHarian("Wahyuni Roona", "3171444444444444", 8500, 35);
        PegawaiHarian ph2 = new PegawaiHarian("Amalia Purnamasari", "3171555555555555", 7000, 42);
        PegawaiHarian ph3 = new PegawaiHarian("Yaasinta Syta", "3171666666666666", 4000, 20);

        System.out.println("========== Daftar Pegawai Harian ==========");
        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());

        Sales s1 = new Sales("Ananda Rizky", "3171777777777777", 35, 25000);
        Sales s2 = new Sales("Rafi Kuncoro", "3171888888888888", 50, 40000);
        Sales s3 = new Sales("Ariq Satria", "3171999999999999", 85, 60000);

        System.out.println("========== Daftar Sales ==========");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
