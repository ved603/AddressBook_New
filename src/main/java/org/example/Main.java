package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Main {

   static  HashMap <String,AddressBook> books = new HashMap<>();
    static Scanner sc = new Scanner(System.in);


    public static void add_AddressBook(String name){
        books.put(name,new AddressBook());
        System.out.println("\n\t*** The AddressBook is Added Successfully ***\t");
    }

    public static void menu(){
        System.out.println("\n_____________________________________________");
        System.out.println("\n\t\t*** Welcome to AddressBook ***\t\t");
        System.out.println("\n______________________________________________");
        boolean res = true;
        while(res) {
            System.out.println("\n1. Add New AddressBook \n2. Perform Operation in AddressBook \n3. Print Available AddressBooks");
            System.out.print("\nEnter your choice : ");
            String flag = sc.nextLine();
            switch (flag) {
                case "1":
                    System.out.print("\nEnter the Name of the AddressBook : ");
                    String name = sc.nextLine();
                    add_AddressBook(name);
                    break;

                case "2":
                    System.out.print("\nEnter the Name of AddressBook : ");
                    String name1 = sc.nextLine();
                    if (books.containsKey(name1)) {
                        books.get(name1).Menu2();
                    } else {
                        System.out.println("\n\t$$ The AddressBook is Not Found $$\t");
                        break;
                    }

                case "3":
                    System.out.println("\nPrinting the Names of AddressBooks : " +books.keySet());
                    break;

                default:
                    System.out.println("\n\t\t$$  Invalid Option Selected  $$");

            }
        }
    }
    public static void main(String[] args) {
//        Main m = new Main();
        menu();

    }
}