package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ბოდიში გვიან რომ ვნახე ლექცია და დავალება დავაგვიანე,არაუშავს?:  ");
        String str = scanner.nextLine();

        while (!str.equals("არაუშავს")) {

            System.out.println("კიდევ სცადეთ, პატიების უნარი დიდი ნიჭია : ");
            str = scanner.nextLine();
        }

        System.out.println("ანუ ბოდიში მიღებულია!");

    }
}