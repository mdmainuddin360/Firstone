package com.exam.NIIT;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int rollNumber;
	String className;
	String attendence;
	Scanner sc=new Scanner(System.in); 
	
	void takeAttendence() {
		System.out.println("Enter Student Name");
		name=sc.next();
		System.out.println("Enter Roll Numver");
		rollNumber=sc.nextInt();
		System.out.println("Enter class Name");
		className=sc.next();
		System.out.println("Enter P Present, A for Absent, L for Late");
		attendence=sc.next();
	}
	
	void vewAllStudent() {
		  
		       System.out.println("Name: " + name+"Roll: " + rollNumber+"Class: " + className+" Attendence: " + attendence);  
		         System.out.println("\n");  
		         
		    
	}
}



public class AttendenceManagement {
public static void main(String[] args) {
	ArrayList<Student> list=new ArrayList<>();
	
    Scanner sc=new Scanner(System.in);
	
	int ch=0;
	
	do {
		System.out.println("1.Press 1 for  Add student \n2.Press 2 view Attedence of All Student\n3.Press 3 for exit\n ");
            ch=sc.nextInt();
          
		switch(ch) {
		case 1: 
			Student s=new Student();
			s.takeAttendence();
			list.add(s);
	      break;
		case 2: 	 
			for(int i=0;i<list.size();i++) {
				list.get(i).vewAllStudent();
			}
		  break;
		case 3: 
			return;
		
		default : System.out.println("Invalid choice , chose currct One");
		}
	}while(ch<=3);
}

}
