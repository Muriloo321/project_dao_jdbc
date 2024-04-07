package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Magazines");
		
		Seller seller = new Seller(10, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, dep);
		
		System.out.println(dep);
		System.out.println(seller);
	}

}
