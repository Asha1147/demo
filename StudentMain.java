package client;

import java.sql.SQLException;
import java.util.Scanner;

import db.StudentConnectivity;
import entity.Student;
import validation.Validations;

public class StudentMain {
	public static void main(String[] args) throws SQLException {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		Validations v = new Validations();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println(name);		
		
		if(v.nameValidation(name)==true) {
			s.setName(name);
			System.out.println("done");
		}
		else {
			System.out.println("enter crct name");
		}
		
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println(id);
		s.setId(id);
		
		
		
		System.out.println("enter email");
		String email = sc.next();
		System.out.println(email);
		
		if(v.emailValidation(email)==true) {
			s.setEmail(email);
			System.out.println("done");
		}
		else {
			System.out.println("enter crct email");
		}
		StudentConnectivity sconn=new StudentConnectivity();
		sconn.studentConn(s);

	}

}
