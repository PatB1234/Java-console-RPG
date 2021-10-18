package app.codinglifenow.web;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the best RPG Ever! Before we begin, we need to start out with the basic necessities");
        System.out.println("Please state your name");
        String name = scanner.nextLine();
        System.out.println("By deafault you are a hero and the story will be explained later... ONWARDS!");

        IntroDuction intro = new IntroDuction();
        intro.IntroDuction(name);
    }
}
