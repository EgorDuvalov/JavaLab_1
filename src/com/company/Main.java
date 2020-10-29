package com.company;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        //initialize Cake n Apple
        Cake cake;
        Apple apple;
        String[] Icing = new String[3];
        Icing[0] = "Chocolate";
        Icing[1] = "Cream";
        Icing[2] = "Caramel";
        cake = new Cake(Icing[(int) (Math.random() * 3)]);
        String[] Size = new String[]{"Big", "Medium", "Small"};
        apple = new Apple(Size[(int) (Math.random() * 3)]);
        Cheese cheese = new Cheese();

        System.out.println("Ur breakfast contains " + cake + ", " + apple + " and " + cheese);

        System.out.println("Wanna know amount of calories?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if (choice.equals("-calculate")) {
            int calories = cake.calculate_Calories() + apple.calculate_Calories();
            System.out.println(calories + " calories");
        }

        cake.consume();
        apple.consume();
        cheese.consume();
        System.out.println("Have a nice day baby");
    }

}


