package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll(); // Employee 타입 데이터를 담은 리스트를 리턴하는 메서드 선언

    Employee findById(int theId); // id를 인자로 받아서 해당하는 인스턴스를 리턴

    Employee save(Employee theEmployee); // 인자로 새로운 인스턴스를 받아 저장(db에 반영)하고 리턴

    void deleteById(int theId); // id를 인자로 받아서 해당하는 인스턴스를 삭제
}

