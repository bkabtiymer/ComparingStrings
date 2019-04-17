package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.print("First name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("House number: ");
        int houseNumber = keyboard.nextInt();

        System.out.print("House street & ");
        String streetName = keyboard.nextLine();

        System.out.print("Street Type: ");
        String streetType = keyboard.nextLine();

        System.out.print("City name: ");
        String cityName = keyboard.nextLine();

        System.out.print("My name is "+ firstName + lastName + " and my address is git " + houseNumber + streetName + streetType + cityName);









    }
}
