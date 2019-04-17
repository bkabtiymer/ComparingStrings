package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String firstlastName = keyboard.nextLine();


        System.out.print("Enter your address: ");
//        int houseNumber = keyboard.nextInt();
//        keyboard.nextLine();
        String streetName = keyboard.nextLine();

        System.out.print("Enter city name: ");
        String cityName = keyboard.nextLine();

        System.out.print("My name is "+ firstlastName  + " and my address is " + streetName + cityName);









    }
}
