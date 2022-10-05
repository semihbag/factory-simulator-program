//Name: Semih
//Surname: Bað
//Student ID:150120070

// Define the factory class
public class Factory {
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;
	
	
	// Construct a factory with a specified name, capacity and item price
	public Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		this.storage = new Storage(capacity);
		this.employees = new Employee[0];
		this.payrolls = new Payroll[0];
		this.itemPrice = itemPrice;
	}
	
	
	// Calculate the revenue
	public double getRevenue() {
		return storage.getItems().length * itemPrice;
	}
	
	
	// Calculate the total salary of employees
	public double getPaidSalaries() {
		double sumOfSalaries = 0;
		for (int i = 0 ; i < payrolls.length ; i++) {
			sumOfSalaries += this.payrolls[i].calculateSalary();
		}
		return sumOfSalaries;
	}
	
	
	// Add the employee to employees array 
	// Start the shift of this employee 
	// Add the items that made by employee to the storage
	public void addEmployee(Employee employee) {
		Employee[] tempEmployees = new Employee[employees.length + 1];
		
		for (int i = 0 ; i < employees.length ; i++) {
			tempEmployees[i] = employees[i];
		}
		tempEmployees[employees.length] = employee;
		this.employees = tempEmployees;
		
		employee.startShift();
		for (int i = 0 ; i < employee.getItem().length ; i++) {
			if (this.storage.getItems().length == this.storage.getCapacity()) {
				System.out.println("Storage capacity is full!");
				break;
			}
			else {
				this.storage.addItem(employee.getItem()[i]);
			}
		}
	}
	
	
	// Remove the employee from employees array
	// Finish the shift of this employee
	// Add payroll of this employee to payroll array
	public Employee removeEmployee(int id) {
		if (this.employees.length == 0) {
			System.out.println("There are no employees!");
			return null;
		}
		else {
			
			int indexOfEmployee = -99999;
			boolean isEmployeeExist = false;
			
			for (int i = 0 ; i < employees.length ; i++) {
				if(employees[i].getId() == id) {
					indexOfEmployee = i;
					isEmployeeExist = true;
					break;
				}
			}
			
			if (isEmployeeExist) {
				Employee[] tempEmployees = new Employee[employees.length - 1];
				
				for (int i = 0, j = 0 ; (i < employees.length) && (j < tempEmployees.length) ; i++, j++) {
					if(i == indexOfEmployee) {
						j--;
						continue;
					}
					else {
						tempEmployees[j] = employees[i];
					}
				}
				
				employees[indexOfEmployee].endShift();
				addPayroll(employees[indexOfEmployee].getPayroll());
				Employee removedEmployee = employees[indexOfEmployee];
				this.employees = tempEmployees;

				return removedEmployee;
			}
			else {
				System.out.println("Employee does not exist!");
				return null;
			}
			
		}
		
	}
	
	private void addPayroll(Payroll payroll) {
		Payroll[] tempPayrolls = new Payroll[payrolls.length + 1];
		
		for (int i = 0 ; i < payrolls.length ; i++) {
			tempPayrolls[i] = payrolls[i];
		}
		tempPayrolls[payrolls.length] = payroll;
		this.payrolls = tempPayrolls;
	}	
	
	
	/** Get and set methods */
	
	// Return the name of this factory
	public String getName() {
		return name;
	}
	// Set a new name for this factory
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// Return the list of employees of this factory
	public Employee[] getEmployees() {
		return employees;
	}
	// Set a new list of employees for this factory
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	
	
	// Return the storage of this factory
	public Storage getStorage() {
		return storage;
	}
	// Set a new storage for this factory
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	
	
	
	// Return the list of payrolls of this factory
	public Payroll[] getPayrolls() {
		return payrolls;
	}
	// Set a new list of payroll for this factory
	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}
	
	
	
	// Return the item price of this factory
	public double getItemPrice() {
		return itemPrice;
	}
	// Set a new item price for this factory
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
}
