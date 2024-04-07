package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao selDao = DaoFactory.createSellerDao();
		
		System.out.println("<---TEST 1: FINDBYID--->");
		Seller seller = selDao.findById(3);
		System.out.println(seller);

		System.out.println("\n<---TEST 2: FINDBYDEPARTMENT--->");
		List<Seller> list = selDao.findByDepartment(new Department(2, null));
		list.forEach(System.out::println);
		
		System.out.println("\n<---TEST 3: FINDALL--->");
		list = selDao.findAll();
		list.forEach(System.out::println);
	
		
	}

}
