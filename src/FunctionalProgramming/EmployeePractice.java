package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeePractice {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Putu1", 70000));
		empList.add(new Employee(2, "Put2", 7000));
		empList.add(new Employee(3, "Put3", 50000));
		empList.add(new Employee(4, "Putu4", 55000));
		empList.add(new Employee(5, "Putu5", 3000));
		empList.add(new Employee(6, "Putu6", 40000));
		empList.add(new Employee(7, "Putu7", 15000));
		empList.add(new Employee(8, "Putu8", 4000));
		
		employeeSalarySortDesc(empList);
		employeeTop3Salary(empList);
		employeeLessThanTop3Salary(empList);

	}

	//Sort employees according to salary in descending order
	private static void employeeSalarySortDesc(List<Employee> empList) {
		List<Employee> sortedEmpList = empList.stream()
				.sorted((o1,o2) -> (o2.getEmpSal()-o1.getEmpSal()))
				.collect(Collectors.toList());
		
		System.out.println(sortedEmpList);
	}
	
	//Show employees with Top 3 salaries
	private static void employeeTop3Salary(List<Employee> empList) {
		List<Employee> top3SalEmpList = empList.stream()
				.sorted((o1,o2) -> (o2.getEmpSal() - o1.getEmpSal()))
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(top3SalEmpList);

	}
	
	//Show employees less than 3rd highest salary
	private static void employeeLessThanTop3Salary(List<Employee> empList) {
		List<Employee> empLess3rdSalList = empList.stream()
			.sorted((o1,o2) -> (o2.getEmpSal() - o1.getEmpSal()))
			.skip(3)
			.collect(Collectors.toList());
		System.out.println(empLess3rdSalList);
			
	}

}
