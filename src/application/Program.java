package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sel = DaoFactory.createSellerDao();
		
		Seller seller = sel.findById(3);
		
		System.out.println(seller);
	}

}
