package com.brickinventory;
import java.util.Scanner;
public class BrickInventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Owner Details");
        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter Owner Address: ");
        String ownerAddress = scanner.nextLine();
        System.out.print("Enter Owner Phone Number: ");
        long ownerPhoneNumber = scanner.nextLong();

        BrickOwner brickOwner = new BrickOwner(ownerName, ownerAddress, ownerPhoneNumber);


        System.out.print("Enter Initial Brick Inventory Count: ");
        int initialBrickCount = scanner.nextInt();
        BrickInventory brickInventory = new BrickInventory(ownerName, initialBrickCount);

        char choice;
        do {
            System.out.println("Options:");
            System.out.println("1. Sell Bricks");
            System.out.println("2. Stock Bricks");

            System.out.print("Choose an option (1 or 2): ");
            int option = scanner.nextInt();

            System.out.print("Enter Brick Count: ");
            int brickCount = scanner.nextInt();

            switch (option) {
                case 1:
                    brickInventory.sellBricks(brickCount);
                    break;
                case 2:
                    brickInventory.stockBricks(brickCount);
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            brickOwner.displayOwnerDetails();
            brickInventory.displayInventory();

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}

