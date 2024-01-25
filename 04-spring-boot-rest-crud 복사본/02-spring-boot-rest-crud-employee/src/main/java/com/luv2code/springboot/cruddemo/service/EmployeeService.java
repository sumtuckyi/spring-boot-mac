package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId); // id를 인자로 받아서 해당하는 인스턴스를 리턴

    Employee save(Employee theEmployee); // 인자로 새로운 인스턴스를 받아 저장(db에 반영)하고 리턴

    void deleteById(int theId); // id를 인자로 받아서 해당하는 인스턴스를 삭제
}
