package service.system;

import entity.system.Department;

public interface IDepartmentService {
	//按id查询部门
	public Department doGetByID(int id);
	
	//插入部门信息
	public int doSaveDepartment(Department department);
}
