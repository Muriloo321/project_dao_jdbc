package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao selDao = DaoFactory.createSellerDao();
		
		System.out.println("<---TEST 1: FindByID--->");
		Seller seller = selDao.findById(3);
		System.out.println(seller);

		System.out.println("\n<---TEST 2: FindByDepartment--->");
		List<Seller> list = selDao.findByDepartment(new Department(2, null));
		list.forEach(System.out::println);
		
		System.out.println("\n<---TEST 3: FindAll--->");
		list = selDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n<---TEST 4: InsertSeller--->");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, new Department(2, null));
		selDao.insert(newSeller);
		System.out.println("Inserted! New ID = "+ newSeller.getId());
		
	}

}
