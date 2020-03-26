package com.company;

public abstract class Network {
    String login;
    String password;

    public boolean post(String message) {
        if (login(this.login, this.password)) {
            send(message);
            logout();
            return true;
        }
        return false;
    }

    public abstract boolean login(String login, String password);
    public abstract  boolean send(String message);
    public abstract void logout();
}
