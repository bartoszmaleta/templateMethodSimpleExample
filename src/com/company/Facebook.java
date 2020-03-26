package com.company;

public class Facebook extends Network {

    public Facebook(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean login(String login, String password) {
        return (login.equals("admin") && password.equals("admin"));
    }

    @Override
    public boolean send(String message) {
        System.out.println("Facebook");
        System.out.println(message);
        return true;
    }

    @Override
    public void logout() {
        System.out.println("You were logged out from Facebook!");
    }
}
