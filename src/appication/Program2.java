package appication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmenDao();

		System.out.println("=== Test: 1 department findById ===");
		Department department = departmentDao.findById(4);
		System.out.println(department);

		System.out.println("\n=== Test: 2 department findAll ===");
		List<Department> departments = departmentDao.findAll();
		departments.forEach(System.out::println);

		System.out.println("\n=== Test: 3 department insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n=== Test: 4 department update ===");
		department = departmentDao.findById(newDepartment.getId());
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== Test: 5 department delete ===");
		departmentDao.deleteByid(newDepartment.getId() - 1);
		System.out.println("Delete completed");
	}

}
