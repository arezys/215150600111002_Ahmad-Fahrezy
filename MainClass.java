package PrakExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Magician mage = new Magician(10, 60, 100);
        Healer support = new Healer(10, 10, 70);
        Warrior fighter = new Warrior(30, 40, 100);
        Titan monster = new Titan(0, 45, 200);

        Database.addData(new Admin("Admin", "Admin"));

        boolean firstCheck = true;
        byte firstPage = 0, charPage = 0;
        String username, password, nickname;

        do {
            System.out.println("====== AoT Android Game ======");
            System.out.println("Selamat datang di Game AoT FILKOM !");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            do {
                System.out.print("Masukkan pilihanmu (1 - 3) : ");
                try {
                    firstPage =  input.nextByte();
                    firstCheck = false;
                } catch (InputMismatchException e) {
                    System.out.println("\n******************************");
                    System.out.println("  Tolong Masukkan Angka  1 - 3  ");
                    System.out.println("******************************\n");
                    input.next();
                    firstCheck = true;
                }
            } while (firstCheck); firstCheck = true;

            switch (firstPage) {

                case 1:
                    System.out.println("\n=========== Log in ==========="); input.nextLine();
                    System.out.print("Username/Email\t: "); username = input.nextLine();
                    System.out.print("Password\t: "); password = input.nextLine();
                    System.out.println("");

                    if(Database.checkAdmin(new Admin(username, password))){
                        firstCheck = false;
                        // LOGIN
                        System.out.println("====== Welcome  To Game ======");
                        System.out.print("Masukkan Nickname : ");
                        nickname = input.nextLine();
                        System.out.println("");
                        System.out.println("   >>>>> WELCOME "+nickname+" <<<<<");
                        System.out.println("");

                        do{
                            try{
                                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
                                for(String Hero : Role) {
                                    System.out.println(Hero);
                                }
                                System.out.print("Masukkan pilihanmu (1 - 3) : ");
                                firstPage = input.nextByte();

                                if (firstPage < 1 || firstPage > 3) throw new NumberFormatException();
                            }catch (Exception e){
                                if(e instanceof NumberFormatException) {
                                    System.out.println("Silahkan masukan angka 1 - 3");
                                }
                                else{
                                    System.err.println("Silahkan masukkan angka !!!");
                                    input.next();
                                }
                            }
                        }while (firstPage == 0);
                        System.out.println("Selamat datang, " + nickname);

                        switch(firstPage){
                            case 1 :
                                int i = 1;
                                mage.info();
                                while(mage.getHp() != 0 && monster.getHp() != 0){
                                    System.out.println("==============" + " TURN " + i + " ==============");

                                    if(mage.attack()){
                                        monster.receiveDamage(mage.getAttack());
                                    }
                                    if(monster.attack()){
                                        mage.receiveDamage(monster.getAttack());
                                    }
                                    System.out.println("Enemy's HP\t: " + monster.getHp());
                                    System.out.println(nickname +"'s HP\t: " + mage.getHp());
                                    i++;
                                }
                                System.out.println("====================================");
                                if(monster.getHp() == 0) {
                                    System.out.println(nickname + " menang\n");
                                }
                                if(mage.getHp() == 0) {
                                    System.out.println("Titan menang\n");
                                }
                                System.out.println("============== PLAYER ==============");
                                mage.info();
                                System.out.println();
                                System.out.println("============== MUSUH ==============");
                                monster.info();
                                break;

                            case 2 :
                                int j = 1;
                                support.info();
                                while(support.getHp() != 0 && monster.getHp() != 0){
                                    System.out.println("==============" + " TURN " + j + " ==============");
                                    if(j % 2 == 0) {
                                        support.Heal();
                                    }
                                    if(support.attack()){
                                        monster.receiveDamage(support.getAttack());
                                    }
                                    if(monster.attack()){
                                        support.receiveDamage(monster.getAttack());
                                    }
                                    System.out.println("Enemy's HP\t: " + monster.getHp());
                                    System.out.println(nickname +"'s HP\t: " + support.getHp());
                                    j++;
                                }
                                System.out.println("====================================");
                                if(monster.getHp() == 0) System.out.println(nickname + " menang\n");
                                if(support.getHp() == 0) System.out.println("Titan menang\n");
                                System.out.println("============== PLAYER ==============");
                                support.info();
                                System.out.println();
                                System.out.println("============== MUSUH ==============");
                                monster.info();
                                break;

                            case 3 :
                                int k = 1;
                                fighter.info();
                                while(fighter.getHp() != 0 && monster.getHp() != 0){
                                    System.out.println("==============" + " TURN " + k + " ==============");
                                    if(fighter.attack()){
                                        monster.receiveDamage(fighter.getAttack());
                                    }
                                    if(monster.attack()){
                                        fighter.receiveDamage(monster.getAttack());

                                    }
                                    System.out.println("Enemy's HP\t: " + monster.getHp());
                                    System.out.println(nickname +"'s HP\t: " + fighter.getHp());
                                    k++;
                                }
                                System.out.println("====================================");
                                if(monster.getHp() == 0) System.out.println(nickname + " menang\n");
                                if(fighter.getHp() == 0) System.out.println("Titan menang\n");
                                System.out.println("============== PLAYER ==============");
                                fighter.info();
                                System.out.println();
                                System.out.println("============== MUSUH ==============");
                                monster.info();
                                break;
                        }
                    }else {
                        firstCheck = true;
                        System.out.println("\n**** Akun Tidak Ditemukan ****\n");
                    }
                    break;

                case 2:
                    System.out.println("\n=========== SignUp ==========="); input.nextLine();
                    System.out.print("Username/Email\t: "); username = input.nextLine();
                    System.out.print("Password\t: "); password = input.nextLine();
                    System.out.println("");

                    Database.addData(new Admin(username, password));
                    break;

                case 3:
                    System.out.println("\n=========== Keluar ===========");
                    System.out.println("      ** Terima Kasih **      ");
                    System.out.println("==============================\n");
                    firstCheck = false;
                    break;

                default:
                    System.out.println("\n******************************");
                    System.out.println("    -- Please Input 1-3 --    ");
                    System.out.println("******************************\n");
                    break;
            }
        } while (firstCheck);

    }
}



