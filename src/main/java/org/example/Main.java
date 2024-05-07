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

    public static void search_by_city(){
//        System.out.println("Enter the City Name to Search : ");
//                    String city = sc.nextLine();
//                    books.forEach((key,value) -> {
//                        for(int i=0;i<value.contacts.size();i++){
//                            if(value.contacts.get(i).getCity().equals(city)){
//                                System.out.println(value.contacts.get(i));
//                            }
//                        }
//                    });

        System.out.println("Enter the City Name to Search : ");
        String city = sc.nextLine();
        long count = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(city))
                .count();
        System.out.println("Number of contacts found in " + city + ": " + count);
        books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(city))
                .forEach(System.out::println);
    }


    public static void search_by_state(){
        System.out.println("Enter the state Name to Search : ");
        String state = sc.nextLine();
        long count = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(state))
                .count();
        System.out.println("Number of contacts found in " + state + ": " + count);
        books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(state))
                .forEach(System.out::println);
    }

    public static void menu(){
        System.out.println("\n_____________________________________________");
        System.out.println("\n\t\t*** Welcome to AddressBook ***\t\t");
        System.out.println("\n______________________________________________");
        boolean res = true;
        while(res) {

            System.out.println("\n1. Add New AddressBook \n2. Perform Operation in AddressBook  \n3. Search by city \n4. Print Available AddressBooks \n5. Exist");

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
                    System.out.println("\n________________________________________________");
                    System.out.println("\n1. Search by City \n2. Search by State");
                    System.out.print("Enter your choice : ");
                    String choice = sc.nextLine();
                    switch(choice){
                        case "1":
                            search_by_city();
                            break;

                        case "2":
                            search_by_state();
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;


                case "4":
                    System.out.println("\nPrinting the Names of AddressBooks : " +books.keySet());
                    break;

                case "5":
                    System.exit(0);

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