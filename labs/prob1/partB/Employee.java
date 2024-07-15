package lesson7.labs.prob1.partB;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	public boolean equals(Employee e) {
		if(this == e) return true;
		if(e ==null && getClass() != e.getClass()) return false;
		Employee employee=(Employee) e;
		return e.name.equals(employee.name) && e.salary == employee.salary;
	}

	public int hashCode(){
		return name.hashCode() + salary;
	}
}
