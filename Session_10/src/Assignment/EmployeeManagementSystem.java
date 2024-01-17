package Assignment;

import java.util.*;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("1", "Ajay", 35, 35000, "HR", true),
                new Employee("2", "Vamshi", 45, 36000, "HR", false),
                new Employee("3", "Rajesh", 50, 50000, "IT", false),
                new Employee("4", "Akash", 54, 60000, "IT", true),
                new Employee("5", "Sanjay", 60, 70000, "ADMIN", true),
                new Employee("6", "Raju", 70, 80000, "ADMIN", true));

        System.out.println("Number of Employees: " + employees.size());

        // 1. Print List of Employees Whose salary is greater than 50000
        List<Employee> highSalaryEmployees = filterBySalary(employees, 50000);
        printEmployeeNames("Employees with salary greater than 50000: ", highSalaryEmployees);

        // 2. Print Employees who belong to IT Department
        List<Employee> itEmployees = filterByDepartment(employees, "IT");
        printEmployeeNames("Employees in IT Department: ", itEmployees);

        // 3. Calculate total sum of salaries of ADMIN Dept in the given list.
        double adminSalaryTotal = calculateTotalSalaryByDepartment(employees, "ADMIN");
        System.out.println("Total salary of ADMIN Department: " + adminSalaryTotal);

        // 4. Print only Names of Employees who are active
        List<String> activeEmployeeNames = getActiveEmployeeNames(employees);
        System.out.println("Names of active employees: " + activeEmployeeNames);

        // 5. Store active employees with id as key and employee Object as value..and Print.
        Map<String, Employee> activeEmployeesMap = getActiveEmployeesMap(employees);
        System.out.println("Active employees with id as key: " + activeEmployeesMap);

        // 6. Print max salary Employee from each Dept.
        Map<String, Employee> maxSalaryByDept = getMaxSalaryByDepartment(employees);
        System.out.println("Max salary employee from each department: " + maxSalaryByDept);
    }

    private static List<Employee> filterBySalary(List<Employee> employees, double minimumSalary) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getSalary() > minimumSalary) {
                result.add(emp);
            }
        }
        return result;
    }

    private static List<Employee> filterByDepartment(List<Employee> employees, String department) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (department.equals(emp.getDept())) {
                result.add(emp);
            }
        }
        return result;
    }

    private static double calculateTotalSalaryByDepartment(List<Employee> employees, String department) {
        double totalSalary = 0;
        for (Employee emp : employees) {
            if (department.equals(emp.getDept())) {
                totalSalary += emp.getSalary();
            }
        }
        return totalSalary;
    }

    private static List<String> getActiveEmployeeNames(List<Employee> employees) {
        List<String> activeNames = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.isActive()) {
                activeNames.add(emp.getFirstName());
            }
        }
        return activeNames;
    }

    private static Map<String, Employee> getActiveEmployeesMap(List<Employee> employees) {
        Map<String, Employee> activeEmployeesMap = new HashMap<>();
        for (Employee emp : employees) {
            if (emp.isActive()) {
                activeEmployeesMap.put(emp.getId(), emp);
            }
        }
        return activeEmployeesMap;
    }

    private static Map<String, Employee> getMaxSalaryByDepartment(List<Employee> employees) {
        Map<String, Employee> maxSalaryByDept = new HashMap<>();
        for (Employee emp : employees) {
            String department = emp.getDept();
            if (!maxSalaryByDept.containsKey(department) || emp.getSalary() > maxSalaryByDept.get(department).getSalary()) {
                maxSalaryByDept.put(department, emp);
            }
        }
        return maxSalaryByDept;
    }

    private static void printEmployeeNames(String message, List<Employee> employees) {
        System.out.print(message);
        List<String> names = new ArrayList<>();
        for (Employee emp : employees) {
            names.add(emp.getFirstName());
        }
        System.out.println(names);
    }
}

class Employee {

	public String id;
	private String firstName;
	private int age;
	private double salary;
	private String dept;
	private boolean active;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String firstName, int age, double salary, String dept, boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", age=" + age + ", salary=" + salary + ", dept="
				+ dept + ", active=" + active + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (active != other.active)
			return false;
		if (age != other.age)
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
