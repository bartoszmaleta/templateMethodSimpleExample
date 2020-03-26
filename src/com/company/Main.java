package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Network network = null;
        String login, password, message;

        System.out.println("Provide login: ");
        login = scanner.nextLine();

        System.out.println("Provide password: ");
        password = scanner.nextLine();

        System.out.println("Provide message; ");
        message = scanner.nextLine();

        System.out.println("Where You want to post message?\n 1. Twitter\n 2. Facebook");
        switch (scanner.nextInt()) {
            case 1:
                network = new Twiiter(login, password);
                break;
            case 2:
                network = new Facebook(login, password);
                break;
        }

        network.post(message);
    }
}
