package com.bilvantis.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bilvantis.sample.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee,Long>{
	
	@Query("SELECT e FROM Employee e WHERE e.employeeName = :employeeName")
    public List<Employee> findByName(@Param("employeeName") String employeeName);

}
