package com.company;

public class Twiiter extends Network {

    public Twiiter(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean login(String login, String password) {
        return (login.equals("admin") && password.equals("admin"));
    }

    @Override
    public boolean send(String message) {
        System.out.println("Twitter");
        System.out.println(message);
        return true;
    }

    @Override
    public void logout() {
        System.out.println("You were logged out from Twitter!");
    }
}
