package com.exam.NIIT;

import java.util.Scanner;

class CurencyConverter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int ch = 0;
	do {
		System.out.println("1.Press 1 for inr to dollar\n2.Press 2 for dollar to inr\n3.Press 3 inr to pound\n4.Press 4 for pound to inr\n5.Press 5 for to inr to bangladeshi taka\n6.Press 6 for bangladeshi taka to inr\n7.Press 7 for exit\n ");
            ch=sc.nextInt();
            if(ch<=6)
            System.out.println("Enter Amount\n");
		 double amount=sc.nextDouble();
		switch(ch) {
		case 1: 
			System.out.printf("%.2f ",(amount/80.97));
			System.out.printf(" dollar\n");
	      break;
		case 2: 	 
			System.out.printf("%.2f ",80.97*amount);
			System.out.printf(" rupee\n");
		  break;
		case 3: 
			System.out.printf("%.2f ",(amount/88.21));
			System.out.printf(" pound\n");
			break;
		case 4:      
			System.out.printf("%.2f ",88.21*amount);
			System.out.printf(" rupee\n");
			break;
		case 5:  
		    System.out.printf("%.2f ",(amount*1.27));
		    System.out.printf(" bangladeshi taka\n");
			  break;
		case 6:   
		    System.out.printf("%.2f ",amount/1.27);
		    System.out.printf(" rupee\n");
			  break;
		default : System.out.println("Invalid choice , chose currct One");
		}
	}while(ch<=6);
}
}
