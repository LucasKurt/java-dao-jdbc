package appication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test: 1 seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n=== Test: 2 seller findByDepartmentId ===");
		Department department = new Department(2, null);
		List<Seller> departmentSellers = sellerDao.findByDepartment(department);
		departmentSellers.forEach(System.out::println);
		
		System.out.println("\n=== Test: 3 seller findAll ===");
		List<Seller> Sellers = sellerDao.findAll();
		Sellers.forEach(System.out::println);
	}

}
