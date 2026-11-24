package com.day4.FileHandlingLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandling {

	public static void main(String[] args) {
		
		// Initialize
		Employee[] emps = new Employee[5];
		emps[0] = new Employee(1, "Dave","Engineering", 65000);
		emps[1] = new Employee(2, "Alice","Engineering", 65000);
		emps[2] = new Employee(3, "Kate","HR", 50000);
		emps[3] = new Employee(4, "Emily","Sales", 50000);
		emps[4] = new Employee(5, "Brian","Sales", 50000);
		
		//Write
		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(emps);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Read
		Employee[] readEmps = null;
		try (FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			readEmps = (Employee[]) ois.readObject();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(); //Extra line break for separation
		
		for (Employee e : readEmps) {
			System.out.println(e);
		}
	}

}
