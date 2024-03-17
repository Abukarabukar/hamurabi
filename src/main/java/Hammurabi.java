package hammurabi;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Hammurabi().playGame();
    }

    void playGame() {
        Random rand = new Random();
        int year = 1;
        int population = 100;
        int acresOwned = 1000;
        int bushelsInStorage = 2800;
        int landValue = 19;

        boolean isOn = true;
        while (isOn) {
            System.out.println("O great Hammurabi!\n" +
                    "You are in year " + year + " of your ten year rule.\n" +
                    "In the previous year 0 people starved to death.\n" +
                    "In the previous year 5 people entered the kingdom.\n" +
                    "The population is now 100.\n" +
                    "We harvested 3000 bushels at 3 bushels per acre.\n" +
                    "Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
                    "The city owns 1000 acres of land.\n" +
                    "Land is currently worth 19 bushels per acre.");

            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
            } else {
                System.out.println("Please enter a Number.");
                isOn = false; // Terminate the loop if non-integer input is given
                scanner.next(); // Consume non-integer input
            }
//1
//            System.out.print("Enter an operator: ");
//            scanner = scanner.nextLine();
//            System.out.print("Enter a number: ");
//            userInput = Double.parseDouble(scanner.nextLine());
//
//
//


            if (year == 10) {
                isOn = false; // Terminate the loop after 10 years
            }
            year++;
        }
    }
}
