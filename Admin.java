package PrakExceptionHandling;

public class Admin {
    private String username;
    private String password;
    private java.lang.Character karakter;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    protected void setKarakter(java.lang.Character karakter){
        this.karakter = karakter;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public java.lang.Character getKarakter() {
        return karakter;
    }
}

