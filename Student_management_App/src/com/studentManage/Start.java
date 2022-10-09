package com.studentManage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Start {
	
	public static void main(String[]args) throws IOException{
		System.out.println("welcome to student management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			System.out.println("press 1 to ADD student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to didplay student");
			System.out.println("press 4 to exit app");
			//using bufferedReader
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add student
				System.out.println("enter user name : ");
				String name = br.readLine();
				
				System.out.println("enter user phone : ");
				String phone = br.readLine();
				
				System.out.println("enter user city :");
				String city = br.readLine();
				
				//create student object to store student
				Student st = new Student(name, phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					
					System.out.println("Student is added successfully....");
				} else {
					System.out.println("something went wrong try again.... ");
				}
				
				System.out.println(st);
			}
			
			if(c==2) {
				
				//delete student
				
				System.out.println("enter student id to delete: ");
				
				int userId = Integer.parseInt(br.readLine());
				
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted....");
				}
				else {
					System.out.println("something is wrong....");
				}
			}
			
			if(c==3) {
				//display student
				
				StudentDao.showAllStudent();
			}
			
			if(c==4) {
				//exit student
				break;
			}
			else {
				
			}
		}
		
		System.out.println("Thank you for using my application \r\n bye bye");
	}

}
