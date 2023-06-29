package address.book;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddContact ad=new AddContact();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter choice");
        int ch=sc.nextInt();
          menu();
        if (ch == 1) {
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastName = sc.next();
            System.out.println("Enter address: ");
            String address = sc.next();
            System.out.println("Enter city name: ");
            String city = sc.next();
            System.out.println("Enter state name: ");
            String state = sc.next();
            System.out.println("Enter zipcode: ");
            int zip = sc.nextInt();
            System.out.println("Enter phone number: ");
            long phone = sc.nextLong();
            System.out.println("Enter Email ID: ");
            String email = sc.next();

            ad.addcontact(new contact(firstName, lastName, address, city, state, zip, phone, email));

            menu();
            ch = sc.nextInt();
        }
            else{
                System.out.println("enter valid choice");

            }}
            public static   void menu() {
            System.out.println("1.Add a new contact to your address book.");
            System.out.println("2.Delete an Existing contact to your address book.");
            System.out.println("3.print out information of contacts in your address book.");
            System.out.println("4.print out no.of contacts you have.");
            System.out.println("5.Quit.");
            System.out.println("Enter your choice: ");


    }
}
