package service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.system.DepartmentMapper;

import entity.system.Department;

import service.system.IDepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Override
	public Department doGetByID(int id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int doSaveDepartment(Department department) {
		int result= departmentMapper.insert(department);
		return result;
	}

}
