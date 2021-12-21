package com.blz.AddressBookMain;


import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Contact {

    String first_name, last_name, address, city, email;
    long zip, phone_number;

    public Contact(){}

    public Contact addNewContact(){

        Contact person = new Contact();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Name = ");
        person.first_name=sc.next();

        System.out.println("Enter Last Name = ");
        person.last_name=sc.next();

        System.out.println("Enter Address = ");
        person.address=sc.next();

        System.out.println("Enter City = ");
        person.city=sc.next();

        System.out.println("Enter Zip Code = ");
        person.zip= Long.parseLong(sc.next());

        System.out.println("Enter Phone Number = ");
        person.phone_number= Long.parseLong(sc.next());

        System.out.println("Enter Email Address = ");
        person.email=sc.next();

        return person;
    }

    public void showContact(ArrayList<Contact> person)
    {
        for (int i = 0; i < person.size(); i++) {

            System.out.println("*****************************************************");
            System.out.println("First Name : " + person.get(i).first_name);
            System.out.println("Last Name : " + person.get(i).last_name);
            System.out.println("Address : " + person.get(i).address);
            System.out.println("City Name : " + person.get(i).city);
            System.out.println("Zip code : " + person.get(i).zip);
            System.out.println("Phone Number : " + person.get(i).phone_number);
            System.out.println("Email ID : " + person.get(i).email);
            System.out.println("*****************************************************");
        }
    }

    public void updateContact(String name, ArrayList<Contact> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).first_name)) {
                contacts.remove(i);
                contacts.add(i, addNewContact());
            }
        }
        System.out.println("Contact details for "+name+" updated successfully !!!");
    }


    public void deleteContact(String name, ArrayList<Contact> contacts) {
        int flag = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).first_name)) {
                contacts.remove(i);
                System.out.println("Contact details for " + name + " deleted successfully !!!");
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("There is no contact details available for name = " + name +" !!!");
        }
    }

//    public void showAddressBook(Map<String, Contact> addressBookMap) {
//        for (String addressBook : addressBookMap.keySet()) {
//            System.out.println("Contacts in the " + addressBook.toString() + " are " + addressBookMap.get(addressBook).toString());
//        }
//    }

    @Override
    public String toString() {
        return "Contact{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phone_number=" + phone_number +
                '}';
    }
}
