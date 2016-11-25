package pl.drupality;

import java.util.Scanner;

public class Main {

    private static final int CREATE_ARRAY = 1;
    private static final int FIND_LINEARY = 2;
    private static final int FIND_BINARY = 3;
    private static final int INSERT_LINEARY = 4;
    private static final int DELETE_LINEARY = 5;
    private static final int DISPLAY_ARRAY = 6;
    private static final int EXIT = 7;

    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray ordArray = new OrdArray(maxSize);

        displayMenu();

        int selection;
        Scanner input = new Scanner(System.in);
        while((selection = input.nextInt()) != EXIT) {

            switch (selection) {
                case CREATE_ARRAY:
                    print("How many array elements you want to generate? Maximum: " + maxSize + "\n");
                    int elCounts = input.nextInt();
                    ordArray.fillArray(elCounts);
                    printArray(ordArray);
                    break;
                case FIND_LINEARY:
                    print("Enter the number you want to find\n");
                    int searchNum = input.nextInt();
                    int searchIdx = ordArray.linearSearch(searchNum);

                    if (searchIdx != ordArray.numOfElements()) {
                        print("Element has been found at " + searchIdx + " index");
                    } else {
                        print("Element has not been found");
                    }

                    break;
                case FIND_BINARY:
                    print("Enter the number you want to find\n");
                    int searchNum2 = input.nextInt();
                    int searchIdx2 = ordArray.linearSearch(searchNum2);

                    if (searchIdx2 != ordArray.numOfElements()) {
                        print("Element has been found at " + searchIdx2 + " index");
                    } else {
                        print("Element has not been found");
                    }
                    break;
                case INSERT_LINEARY:
                    print("Enter the number you want to insert\n");
                    int newNum = input.nextInt();
                    ordArray.linearInsert(newNum);
                    break;
                case DELETE_LINEARY:
                    print("Enter the number you want to delete\n");
                    int deleteNum = input.nextInt();
                    boolean result = ordArray.linearDelete(deleteNum);
                    if (result) {
                        print("Number has been deleted");
                    } else {
                        print("Number has not been found");
                    }
                    break;

                case DISPLAY_ARRAY:
                    printArray(ordArray);

            }

            print("\n");

            displayMenu();
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printArray(OrdArray arr) {
        System.out.println(arr);
    }

    public static void displayMenu() {
        print("Select an action: ");
        print("-------------------------");
        print(CREATE_ARRAY + " - Create array");
        print(FIND_LINEARY + " - Find element by linear method");
        print(FIND_BINARY + " - Find element by binary method");
        print(INSERT_LINEARY + " - Insert element by linear method");
        print(DELETE_LINEARY + " - Delete element by linear method");
        print(DISPLAY_ARRAY + " - Display array");
        print(EXIT + " - Exit\n");
    }
}
