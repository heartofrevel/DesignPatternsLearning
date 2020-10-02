package heartofrevel.code.design_patterns.builder.api;

import heartofrevel.code.design_patterns.builder.model.Address;
import heartofrevel.code.design_patterns.builder.model.EmployeeDTO;

public interface EmployeeDTOBuilder {
	
	EmployeeDTOBuilder withFirstName(String firstName);
	EmployeeDTOBuilder withLastName(String lastName);
	EmployeeDTOBuilder withEmployeeId(String employeeId);
	EmployeeDTOBuilder withDepartment(String department);
	EmployeeDTOBuilder withRole(String role);
	EmployeeDTOBuilder withAddress(Address address);
	
	EmployeeDTO build();
	
	EmployeeDTO getEmployeeDTO();
}
