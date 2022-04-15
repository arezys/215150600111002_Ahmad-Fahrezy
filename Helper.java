package UTPpbo;

public class Helper {
    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");

        // Initialize Layanan
        Main.layanans[0] = new Layanan("Layanan Ganti Oli", 500_000);
        Main.layanans[1] = new Layanan("Operasi Mobil", 2_000_000);
        Main.layanans[2] = new Layanan("Ketok Magic", 3_000_000);
        Main.layanans[3] = new Layanan("Modifikasi Mobil Racing", 5_000_000);
        Main.layanans[4] = new Layanan("Modifikasi Mobil Elektrik", 5_500_000);
        // Masukkan daftar-daftar layanan bersesuaian dengan dokumen
    }

    // Helper function to authentication
    // Fungsi yang digunakan untuk "melakukan loop" pada iterasi admins
    static boolean authentication(String username, String password) {
        if(username.equals(Main.admins[0].getName()) && password.equals(Main.admins[0].getPassword())){
            System.out.println("Login Berhasil");
            return true;
        }
        else if(username.equals(Main.admins[1].getName()) && password.equals(Main.admins[1].getPassword())){
            System.out.println("Login Berhasil");
            return true;
        }
        else{
            System.out.println("Login gagal");
            return false;
        }
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Rp. %,d", price);
    }
}
