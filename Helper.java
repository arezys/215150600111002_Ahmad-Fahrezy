package UapPbo;

class Helper {
    // Helper function to initialize variable that used in runtime environment
    static void initialize(){

        // Code Here
        // P.S: I think something is wrong with Initialize function

        // Initilaize Admin Instances
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");

        // Initialize Hewan Instances
        Main.ayam = new Ayam(500,500_000,3, 3000, 20_000);
        Main.domba = new Domba(100, 1_000_000, 2.5, 10_000, 1_000_000);
        Main.sapi = new Sapi(50, 4_000_000, 7.5, 25_000, 2_500_000);

        // Initialize Tanaman Instances
        Main.cengkeh = new Cengkeh(50.00, 100_000, 10.0, 30_000, 15_000_000);
        Main.kepalaSawit = new KepalaSawit(40.00, 200_000, 25.0, 25_000, 20_000_000);


        // Initialize Medicine instances
        Main.boosterAyam = new Medicine("Booster Ayam", 3000, 7);
        Main.boosterSapi = new Medicine("Booster Sapi", 50_000, 5);
        Main.pesticideCengkeh = new Medicine("Pestisida Cengkeh", 500_000, 14);
        Main.boosterKepalaSawit = new Medicine("Booster Kelapa Sawit", 1_000_000, 10);

        // Uang Kas 100000000
        Main.cash = 0;
    }

    // Helper function to authentication
    // PS: Doing an iteration to check one by one admin instances
    static boolean authentication(String username, String password) {
        Main.admins[0].setName("joko");
        Main.admins[0].setPassword("ini_password_joko");
        Main.admins[1].setName("dengklek");
        Main.admins[1].setPassword("ini_password_dengklek");

        if(username.equals(Main.admins[0].getName())&&password.equals(Main.admins[0].getPassword())){
            return true;
        }
        if(username.equals(Main.admins[1].getName())&&password.equals(Main.admins[1].getPassword())){
            return true;
        }


        return false;
    }

    // PS: You can add new helper function below this comment if you want
}

