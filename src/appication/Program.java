package appication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		Department department = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 2500.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(department);
		System.out.println(seller);
	}

}
