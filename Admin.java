package UapPbo;

public class Admin {
    private String name;
    private String password;

    public Admin(){

    }

    // Constructor
    public Admin(String name, String password){
        setName(name);
        setPassword(password);
    }

    // Basic Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Basic Getters

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // To String return a formattet string of admin
    public String toString() {
        return String.format("Name\t\t: %s \n", getName());
    }

    // Is match with Name and Password
    // Method to check whether the name and password is match with the attribut from the instances
    public boolean isMatch(String name, String password){

        if(name.equals(Main.admins[0].getName())&&password.equals(Main.admins[0].getPassword())){
            return true;
        }
        if(name.equals(Main.admins[1].getName())&&password.equals(Main.admins[1].getPassword())){
            return true;
        }
        else return false;
    }
}