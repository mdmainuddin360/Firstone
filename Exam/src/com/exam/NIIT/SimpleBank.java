package com.exam.NIIT;

import java.util.ArrayList;
import java.util.Scanner;

class Customer{
	  
	    String cusName; 
	 	String acNumber; 
	    String acType;  
	    long acBalance; 
	     Scanner sc=new Scanner(System.in); 
	      void openAccount() {  
	    	  Scanner sc=new Scanner(System.in);
	    	 System.out.print("Enter Name: ");  
		     cusName = sc.nextLine(); 
	         System.out.print("Enter Account No: ");  
	         acNumber = sc.next();  
	         System.out.print("Enter Account type: ");  
	         acType = sc.next();  
	         
	         System.out.print("Enter Balance: ");  
	         acBalance = sc.nextLong();  
	         
	         System.out.println("Account Create Succesfully");
	      }
	      void deposit() {
	    	  long amount;
	    	  System.out.println("Enter Amount to deposit");
	    	  amount=sc.nextLong();
	    	  acBalance +=amount;
	    	  System.out.println("Deposit Succesfully");
	      }
	      
	     void withdrawal() {  
	          long amount;  
	          System.out.println("Enter the amount you want to withdraw: ");  
	          amount = sc.nextLong();  
	          if (  acBalance  >=amount) {  
	        	  acBalance =   acBalance  -amount;  
	              System.out.println("Balance after withdrawal: " +   acBalance );  
	          } else {  
	              System.err.println("Insuffient Funnd !!!!!Your balance is less than " + amount+ "\tTransaction failed...!!" );  
	          }  
	      }
	     public void displayAccount() {  
	         System.out.println("Name of the customer: " + cusName);  
	         System.out.println("Account no.: " + acNumber);  
	         System.out.println("Account type: " + acType);  
	         System.out.println("Balance: " + acBalance);  
	     }  
	     
	     boolean search(String ac_no) {  
	         if (acNumber.equals(ac_no)) {  
	             displayAccount();  
	             return (true);  
	         }  
	         return (false);  
	     }  
}

public class SimpleBank {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Customer> list =new ArrayList<>();
		Customer c=new Customer();
		
		System.out.println("Enter your Choice");
		int ch;
		do {
			System.out.println("1.Press 1 Open Account \n2.Press 2 for Deposit the amount \n3.Press 3 for  Withdraw the amount \n4.Press 4 for Display All Account \n5.Press  for search Account exit\n ");

			 ch=sc.nextInt();
			switch(ch) {
			case 1: c.openAccount();
					list.add(c);
		      break;
			case 2: 	 
				System.out.print("Enter Account no. : ");  
               String acNumber = sc.next();  
            boolean    f= false;  
                for (int i = 0; i < list.size(); i++) {  
                    f= list.get(i).search(acNumber);  
                    if (f) {  
                        list.get(i).deposit();  
                        break;  
                    }  
                }  
                if (!f) {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
			  break;
			case 3:     
				System.out.print("Enter Account No : ");  
               String ac_no = sc.next();  
             boolean    f1= false;  
               for (int i = 0; i < list.size(); i++) {  
                f1 = list.get(i).search(ac_no);  
                if (f1) {  
                    list.get(i).withdrawal();  
                    break;  
                }  
            }  
            if (!f1) {  
                System.out.println("Search failed! Account doesn't exist..!!");  
            }  
			
				break;
			case 4:    
				for (int i = 0; i < list.size(); i++) {  
                list.get(i).displayAccount();  
            }   
			
				break;
			case 5:  System.out.print("Enter account no. you want to search: ");  
            String ac_no1 = sc.next();  
            boolean f2 = false;  
            for (int i = 0; i < list.size(); i++) {  
                f2= list.get(i).search(ac_no1);  
                if (f2) {  
                    break;  
                }  
            }  
            if (!f2) {  
                System.out.println("Search failed! Account doesn't exist..!!");  
            }  
            break;  
				
			case 6:   
				  break;
			default : System.out.println("Invalid choice , chose correct One");
			}
		}while(ch!=6);
}
}
