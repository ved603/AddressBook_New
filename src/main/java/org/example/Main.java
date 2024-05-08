package org.example;
import java.util.*;
import java.util.stream.Collectors;


class Main {


   static  HashMap <String,AddressBook> books = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static HashMap<String,List<Contact>> cityPerson = new HashMap<>();

    static HashMap<String,List<Contact>> statePerson = new HashMap<>();


    public static void add_AddressBook(String name){
        books.put(name,new AddressBook());
        System.out.println("\n\t*** The AddressBook is Added Successfully ***\t");
    }



    public static void count_by_city(){
        System.out.println("Enter the city Name to Search : ");
        String city = sc.nextLine();
        long count = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(city))
                .count();
    }

    public static void count_by_state(){
        System.out.println("Enter the state Name to Search : ");
        String state = sc.nextLine();
        long count = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(state))
                .count();
    }
    public static void view_by_city(){
        System.out.print("Enter the City Name to Search : ");
        String city = sc.nextLine();
        if(cityPerson.isEmpty()){
            System.out.println("The Given City is Not Found");
        }

        else {
            cityPerson.forEach((key,value) -> {
                for (Contact contact : value) {
                    if (contact.getCity().equals(city)) {
                        System.out.println(contact);
                    }
                }
            });
        }
    }

    public static void view_by_state(){
        System.out.println("Enter the state Name to Search : ");
        String state = sc.nextLine();
        if(statePerson.isEmpty()){
            System.out.println("The Given State is Not Found");
        }
        else{
            cityPerson.forEach((key,value) -> {
                for (Contact contact : value) {
                    if (contact.getCity().equals(state)) {
                        System.out.println(contact);
                    }
                }
            });
        }
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
        cityPerson.put(city,books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(city))
                .collect(Collectors.toList()));
        if(cityPerson.isEmpty()){
            System.out.println("The City is Not Available in the AddressBooks");
        }
        else{
            System.out.println("Number of contacts found in " + city + ": " + count);
        }
    }


    public static void search_by_state(){
        System.out.println("Enter the state Name to Search : ");
        String state = sc.nextLine();
        long count = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(state))
                .count();
        statePerson.put(state,books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(contact -> contact.getCity().equals(state))
                .collect(Collectors.toList()));

        if(statePerson.isEmpty()){
            System.out.println("The state is Not Available in the AddressBooks");
        }
        else{
            System.out.println("Number of contacts found in " + state + ": " + count);
        }
    }
    public static void sort_by_Name() {
        List<Contact> allContacts = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getFirstname)) // Sort contacts alphabetically by name
                .collect(Collectors.toList());

        if (allContacts.isEmpty()) {
            System.out.println("No contacts found in any address book.");
        } else {
            System.out.println("Number of contacts found across all address books: " + allContacts.size());
            for(int i=0;i< allContacts.size();i++){
                System.out.println(allContacts.get(i));
            };
        }
    }

    public static void sort_by_City() {
        List<Contact> allContacts = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getCity)) // Sort contacts alphabetically by name
                .collect(Collectors.toList());

        if (allContacts.isEmpty()) {
            System.out.println("No contacts found in any address book.");
        } else {
            System.out.println("Number of contacts found across all address books: " + allContacts.size());
            for(int i=0;i< allContacts.size();i++){
                System.out.println(allContacts.get(i));
            };
        }
    }


    public static void sort_by_Zip() {
        List<Contact> allContacts = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getZip)) // Sort contacts alphabetically by name
                .collect(Collectors.toList());

        if (allContacts.isEmpty()) {
            System.out.println("No contacts found in any address book.");
        } else {
            System.out.println("Number of contacts found across all address books: " + allContacts.size());
            for(int i=0;i< allContacts.size();i++){
                System.out.println(allContacts.get(i));
            };
        }
    }



    public static void sort_by_State() {
        List<Contact> allContacts = books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .sorted(Comparator.comparing(Contact::getState)) // Sort contacts alphabetically by name
                .collect(Collectors.toList());

        if (allContacts.isEmpty()) {
            System.out.println("No contacts found in any address book.");
        } else {
            System.out.println("Number of contacts found across all address books: " + allContacts.size());
            for(int i=0;i< allContacts.size();i++){
                System.out.println(allContacts.get(i));
            };
        }
    }



    public static void menu(){
        System.out.println("\n_____________________________________________");
        System.out.println("\n\t\t*** Welcome to AddressBook ***\t\t");
        System.out.println("\n______________________________________________");
        boolean res = true;
        while(res) {
            System.out.println("\n1. Add New AddressBook \n2. Perform Operation in AddressBook  \n3. Search by city \n4. View Person dictionary \n5. Count the Contact Persons \n6 Sort Contacts by Name \n7. Print Available AddressBooks \n8. Exist");
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
                    System.out.println("\n________________________________________________");
                    System.out.println("\n1. view by City \n2. view by State");
                    System.out.print("Enter your choice : ");
                    String choice1 = sc.nextLine();
                    switch(choice1){
                        case "1":
                            view_by_city();
                            break;

                        case "2":
                            view_by_state();
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;


                case "5":
                    System.out.println("\n________________________________________________");
                    System.out.println("\n1. count by City \n2. count by State");
                    System.out.print("Enter your choice : ");
                    String choice2 = sc.nextLine();
                    switch(choice2){
                        case "1":
                            count_by_city();
                            break;

                        case "2":
                            count_by_state();
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;


                case "6":
                    System.out.println("\n________________________________________________");
                    System.out.println("\n1. By Name \n2. By City \n3. By Zip \n4. By State");
                    System.out.print("Enter your choice : ");
                    String choice3 = sc.nextLine();
                    switch(choice3){
                        case "1":
                            sort_by_Name();
                            break;

                        case "2":
                            sort_by_City();
                            break;

                        case "3":
                            sort_by_Zip();
                            break;

                        case "4":
                            sort_by_State();
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;

                case "7":
                    System.out.println("\nPrinting the Names of AddressBooks : " +books.keySet());
                    break;

                case "8":
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