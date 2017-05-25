package net.serenity.bdd.junit.cucumber.model;

/**
 * Created by arun on 25/05/2017.
 */
public class LoginData {


    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAll(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
