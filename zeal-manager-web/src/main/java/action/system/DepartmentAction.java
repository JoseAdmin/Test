package action.system;

import service.system.IDepartmentService;

import com.opensymphony.xwork2.ActionSupport;

import entity.system.Department;

public class DepartmentAction extends ActionSupport {
	IDepartmentService departmentService;
	
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	Department department;
	public Department getDepartment() {return department;}
	public void setDepartment(Department department) {this.department = department;}

	public String getDepartmentById(){
		department=departmentService.doGetByID(2);
		return SUCCESS;
	}
}
