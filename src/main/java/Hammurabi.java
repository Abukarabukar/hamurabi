

package hammurabi;               // package declaration

import java.nio.file.LinkPermission;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Hammurabi {

    //    Random rand = new Random();
    int year = 1;
    int people = 100;
    int population = 100;
    int acresOwned = 1000;
    int bushelsInStorage = 2800;
    int landValue = 19;
    int numberOfAcreToBuy = 0;
    ;
//    int totalLandValue = (landValue * numberOfAcreToBuy);
    //int bushelsLeft = bushelsInStorage - totalLandValue;

    public Hammurabi() {

    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Hammurabi().startGameMessage();
        new Hammurabi().playGame();
       ;
    }

    //constrcutor
    void playGame() {


        boolean isOn = true;
        while (isOn) {


//            if (scanner.hasNextInt()) {
//                int userInput = scanner.nextInt();
//            } else {
//                System.out.println("Please enter a Number.");
//                isOn = false; // Terminate the loop if non-integer input is given
//                scanner.next(); // Consume non-integer input


//            }


                year();

            System.out.println("How many acres do you wish to buy or sell? Enter a negative amount to sell acres or a positive amount to buy acres.");
            int collector = scanner.nextInt();

            int acresToBuyOrSell = howManyAcresToOrBuySell(collector);





            System.out.println("How many bushels you want to feed this poor people. Each one of them needs 20 bushels. Yeh they are fat");
            int input = scanner.nextInt();
            feedPeople(input);



            System.out.print("Do you want to continue playing? (yes/no): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                isOn = false;
            }

//1
//            System.out.print("Enter an operator: ");
//            scanner = scanner.nextLine();
//            System.out.print("Enter a number: ");
//            userInput = Double.parseDouble(scanner.nextLine());
//
//
//


            if (year == 2) {
                isOn = false; // Terminate the loop after 10 years
            }
            year++;
        }
        report();
    }



//    public int newCostOfLand() {
//        return 0;
//    }



    public int howManyAcresToOrBuySell(int collector) {
        if (collector >= 0) {
            // Buying acres
            int totalLandValue = landValue * collector;
            if (totalLandValue <= bushelsInStorage) {
                int bushelspaied = collector * landValue;
                acresOwned += collector;
                bushelsInStorage -= totalLandValue;
                System.out.println("You bought " + collector + " acres at price of " + bushelspaied + " bushel \n Your bushel: " + bushelsInStorage + "\n Your acres: " + acresOwned );
            } else {
                System.out.println("Not enough bushels in storage to buy the desired acres.");
            }

        } else {
            // Selling acres
            int acresToSell = Math.abs(collector);
            if (acresToSell <= acresOwned) {
                int bushelsReceived = acresToSell * landValue;
                bushelsInStorage += bushelsReceived;
                acresOwned -= acresToSell; // Corrected subtraction
                System.out.println("You sold " + acresToSell + " acres and received " + bushelsReceived + " bushels." + "\n Your bushel: " + bushelsInStorage + "\n Your acres: " + acresOwned );

            } else {
                System.out.println("You don't have enough acres to sell.");
                acresOwned -= acresToSell;
            }
        }
        return acresOwned;
    }

//    public int howManyAcresToBuy() {
//        int input;
//        while (true) {
//            System.out.println("How many acres do you wish to buy?");
//            try {
//                input = scanner.nextInt();
//                acresOwned += input;
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("\"" + scanner.next() + "\" isn't a number!");
//
//            }
//        }
//
//        return input;
//    }

//    int getUserChoice() {
//        int choice = 0;
//        while (true) {
//            try {
//                System.out.print("Enter your choice: ");
//                choice = scanner.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter a number.");
//                scanner.next();
//            }
//        }
//        return choice;
//    }

    int totalPeopleStarved = 0;
int peopleStarved = 0;
    int feedPeople(int input) {
        int bushelForPeople = input;
        int amoutPeopleFood = 20;
        int personNeeds = 20;

        if (bushelsInStorage > 0){
//
            if (amoutPeopleFood == (people * 20)){
                bushelsInStorage -= bushelForPeople;
            }
            else if (amoutPeopleFood != (people * 20)){
                int peopleAfterFed = (bushelForPeople / personNeeds);
                peopleStarved = people - peopleAfterFed;
                bushelsInStorage -= bushelForPeople;
                people -= peopleStarved;
                totalPeopleStarved += peopleStarved;
                System.out.println("In the previous year " + peopleStarved + " people starved to death. " + " \n People: " + people + "\n Your bushel: " + bushelsInStorage + "\n Your acres: " + acresOwned );

            }
        }
        return people;

    }


    void startGameMessage() {
        System.out.println("O great Hammurabi!\n" +
                "You are in year 1 of your ten year rule.\n" +
                "In the previous year 0 people starved to death.\n" +
                "In the previous year 5 people entered the kingdom.\n" +
                "The population is now 100.\n" +
                "We harvested 3000 bushels at 3 bushels per acre.\n" +
                "Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
                "The city owns 1000 acres of land.\n" +
                "Land is currently worth 19 bushels per acre.\n");
    }


    void year(){
        System.out.println("You are in a Year: " + year);
    }

    void report (){
        System.out.println("Under your rule " + totalPeopleStarved + " starved to death. \n" +
                "They are " + people +  " people in you kingdom. \n " +
                "You have " + bushelsInStorage +" bushels. \n" +
                "You own " + acresOwned +  " acres.");
    }
}



//1450 food
//100 people

//personNeeds = 20;

//peopleafter = (250 /personNeeds) = 12.5.
//people = peopleafter  (12)

//howmanypeolple 12 / oldvalue = 8

// systems.out.print (howmanypeopledie);




