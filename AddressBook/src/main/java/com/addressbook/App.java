package com.addressbook;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Address Book Program..!" );
        
        ContactsUc1 cont = new ContactsUc1("Deven ", "Mali ", "Dhule ", "Dhule ","Maharastra ", "424005 ", "12345 ", "deven@gmail.com ");
        System.out.print(cont.getFirstName());
        System.out.println(cont.getLastName());
        System.out.println(cont.getCity());
        System.out.println(cont.getState());
        System.out.println(cont.getZip());
        System.out.println(cont.getPhoneNumber());
        System.out.println(cont.getEmail());
        
    }
    	
}
