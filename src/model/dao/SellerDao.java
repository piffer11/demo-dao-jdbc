package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	void insert (Seller obj);
	void update (Seller obj);
	void deleteById(Seller id);
	Seller findById(int i);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	void deleteById(Integer id);
}
