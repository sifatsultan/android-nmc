package sifat.com.loginregistrar;

/**
 * Created by Sifat on 7/24/2015.
 */
public class User {
    String name, username, password;
    int age;

    public User(String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }
    public User(String username, String password){
        this.name = name;
        this.age = -1;
        this.username = "";
        this.password = "";

    }
}
