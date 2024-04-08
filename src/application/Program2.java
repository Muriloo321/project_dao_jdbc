package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("<---TEST 1: InsertDepartment--->");
		Department dep = new Department(null, "Kitchen");
		depDao.insert(dep);
		System.out.println("Inserted! New ID = "+ dep.getId());
		
		
		System.out.println("\n<---TEST 2: FindById--->");
		dep = depDao.findById(3);
		System.out.println(dep);
		
		
		System.out.println("\n<---TEST 3: UpdateDepartment--->");
		dep.setName("Clothes");
		depDao.update(dep);
		System.out.println("Update Completed!");
		
		
		System.out.println("\n<---TEST 4: DeleteByID--->");
		depDao.deleteById(12);
		System.out.println("Deleted!");
		
		
		System.out.println("\n<---TEST 5: FindAll--->");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
	}
}
