package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);
	ArrayList<ContactsUc1> person; //ArrayList for ContactUc1

	/*
	 * Creating Constructor with arraylist
	 */
	public App() {
		person = new ArrayList<ContactsUc1>();
	}

	public ContactsUc1 addPerson() {
		System.out.println("Enter Fisrt Name ");
		String fname = scan.next();

		System.out.println("Enter Last Name ");
		String last = scan.next();

		System.out.println("Enter Address ");
		String address = scan.next();

		System.out.println("Enter City ");
		String city = scan.next();

		System.out.println("Enter State ");
		String state = scan.next();

		System.out.println("Enter Zip Code ");
		String zip = scan.next();

		System.out.println("Enter Phone Number ");
		String pno = scan.next();

		System.out.println("Enter Email ");
		String email = scan.next();

		ContactsUc1 contact = new ContactsUc1(fname, last, address, city, state, zip, pno, email);
		/*
		 *adding above details to contact arrayList 
		 */
		person.add(contact);
		/*
		 * printing contact
		 */
		System.out.println(contact);
		return contact;
	}
	
	/*
	 * Edit Method to edit person Name
	 */
	public void editName() {
		System.out.println("Enter Name to Edit");
		String edit = scan.next();
		App app = new App();
		
		for(int i=0; i< person.size();i++) {
			ContactsUc1 name = (ContactsUc1) person.get(i);
			if(edit.equals(name.getFirstName())) {
				System.out.println(name);
				name = app.addPerson();
				for(int j=0; j<person.size(); j++) {
					person.set(j, name);
				}
			}
			else {
				System.out.println("Given information is Not present");
			}
		}
	}
	
	/*
	 * Delete person Using name
	 */
	public void delete() {
		System.out.println("Enter name to Delete");
		String del = scan.next();
		
		for (int i=0; i< person.size(); i++) {
			ContactsUc1 name = (ContactsUc1)person.get(i);
			if(del.equals(name.getFirstName())) {
				System.out.println(name);
				person.remove(i);
				System.out.println("Contact Deleted");
			}
			else {
				System.out.println("Contact not found");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program..!");

		/*
		 * Creating Object of Contact 
		 */
		ContactsUc1 cont = new ContactsUc1("Deven ", "Mali ", "Dhule ", "Dhule ", "Maharastra ", "424005 ", "12345 ",
				"deven@gmail.com ");
		System.out.print(cont.getFirstName());
		System.out.println(cont.getLastName());
		System.out.println(cont.getCity());
		System.out.println(cont.getState());
		System.out.println(cont.getZip());
		System.out.println(cont.getPhoneNumber());
		System.out.println(cont.getEmail());

		App ap = new App();
		ap.addPerson();
		ap.editName();
		ap.delete();
	}

}
