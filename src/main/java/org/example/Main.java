package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ბოდიში გვიან რომ ვნახე ლექცია და დავალება დავაგვიანე,არაუშავს?:  ");
        String str = scanner.nextLine();

        String y = "არაუშავს";
        String b= "კიდევ სცადეთ, პატიების უნარი დიდი ნიჭია : ";
        String d= "ანუ ბოდიში მიღებულია";

        while (!str.equals(y)) {

            System.out.println(b);
            str = scanner.nextLine();
        }

        System.out.println(d);

    }
}