package org.example;

import javax.swing.text.View;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


class Main {
    ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void add_Contact(String firstname, String lastname, String address, String city, String state, String zip, String phoneno, String email){
        Contact con = new Contact(firstname,lastname,address,city,state,zip,phoneno,email);
        contacts.add(con);
        System.out.println(con);
    }


    public void Edit(){
        System.out.println("Enter the FirstName to search : ");
        String name = sc.nextLine();
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).getFirstname().equals(name)){

                System.out.println("Select Operation");
                System.out.println("1. Edit FirstName \n2. Edit LastName \n3.Edit Address \n4.Edit city \n5. Edit State \n6.Edit Zip-code \n7.Edit Phone-Number \n8.Edit Email \n9.Edit All");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        System.out.print("Enter your First Name : ");
                        String firstname = sc.nextLine();
                        contacts.get(i).setFirstname(firstname);
                        break;


                    case "2":
                        System.out.print("Enter your Last Name : ");
                        String lastname = sc.nextLine();
                        contacts.get(i).setLastname(lastname);
                        break;


                    case "3":
                        System.out.print("Enter your address : ");
                        String address = sc.nextLine();
                        contacts.get(i).setAddress(address);
                        break;


                    case "4":
                        System.out.print("Enter your city : ");
                        String city = sc.nextLine();
                        contacts.get(i).setCity(city);
                        break;


                    case "5":
                        System.out.print("Enter your state : ");
                        String state = sc.nextLine();
                        contacts.get(i).setState(state);
                        break;


                    case "6":
                        System.out.print("Enter your Zip Code : ");
                        String zip = sc.nextLine();
                        contacts.get(i).setZip(zip);
                        break;


                    case "7":
                        System.out.print("Enter your Phone number : ");
                        String phoneno = sc.nextLine();
                        contacts.get(i).setPhoneno(phoneno);
                        break;


                    case "8":
                        System.out.print("Enter your email : ");
                        String email = sc.nextLine();
                        contacts.get(i).setEmail(email);
                        break;


                    case "9":
                        System.out.println("\n_________________________________________________");
                        System.out.println("\n\t\t*****  Fill the Details  *****");
                        System.out.println("\n_________________________________________________\n");
                        System.out.print("Enter your First Name : ");
                        String firstname1 = sc.nextLine();
                        System.out.print("Enter your Last Name : ");
                        String lastname2 = sc.nextLine();
                        System.out.print("Enter your address : ");
                        String address3 = sc.nextLine();
                        System.out.print("Enter your city : ");
                        String city4 = sc.nextLine();
                        System.out.print("Enter your state : ");
                        String state5 = sc.nextLine();
                        System.out.print("Enter your Zip Code : ");
                        String zip6 = sc.nextLine();
                        System.out.print("Enter your Phone number : ");
                        String phoneno7 = sc.nextLine();
                        System.out.print("Enter your email : ");
                        String email8 = sc.nextLine();
                        System.out.println("\n_________________________________________________\n");
                        contacts.get(i).setFirstname(firstname1);
                        contacts.get(i).setLastname(lastname2);
                        contacts.get(i).setAddress(address3);
                        contacts.get(i).setCity(city4);
                        contacts.get(i).setState(state5);
                        contacts.get(i).setZip(zip6);
                        contacts.get(i).setPhoneno(phoneno7);
                        contacts.get(i).setEmail(email8);
                        break;

                }

            }
        }
    }

    public void View(){
       for(int i=0;i< contacts.size();i++){
           System.out.println(contacts.get(i));
       }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Boolean running = true;
        while(running) {
            System.out.println("Select an Operation");
            System.out.println("1. Add contact \n2. Edit Contact \n3. View Contact");
            System.out.print("\nEnter your choice : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("\n_________________________________________________");
                    System.out.println("\n\t\t*****  Fill the Details  *****");
                    System.out.println("\n_________________________________________________\n");
                    System.out.print("Enter your First Name : ");
                    String firstname = sc.nextLine();
                    System.out.print("Enter your Last Name : ");
                    String lastname = sc.nextLine();
                    System.out.print("Enter your address : ");
                    String address = sc.nextLine();
                    System.out.print("Enter your city : ");
                    String city = sc.nextLine();
                    System.out.print("Enter your state : ");
                    String state = sc.nextLine();
                    System.out.print("Enter your Zip Code : ");
                    String zip = sc.nextLine();
                    System.out.print("Enter your Phone number : ");
                    String phoneno = sc.nextLine();
                    System.out.print("Enter your email : ");
                    String email = sc.nextLine();
                    System.out.println("\n_________________________________________________\n");
                    m.add_Contact(firstname, lastname, address, city, state, zip, phoneno, email);
                    break;


                case "2":
                    m.Edit();
                    break;

                case "3":
                    m.View();
                    break;
            }
        }
    }
}