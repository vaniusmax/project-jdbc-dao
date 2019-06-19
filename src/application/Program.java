package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		
		list.forEach(System.out::println);
		
		
		System.out.println("\n=== TEST 3: seller findAll ===");
	
		List<Seller> listAll = sellerDao.findAll();
		
		for(Seller obj: listAll) {
			System.out.println(obj);
		}
		
		
		list.forEach(System.out::println);
		
		
		System.out.println("\n=== TEST 4: seller Insert ===");
		
		Seller s = new Seller(null, "Vanius", "vanius@hotmail.com", new Date(), 9500.00, dep);
		
		sellerDao.insert(s);
		System.out.println("Inserted! new id: "+ s.getId());
		

	}

	}
	
	

