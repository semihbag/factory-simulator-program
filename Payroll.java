//Name: Semih
//Surname: Bağ


// Define the payroll class
public class Payroll {
	private int workHour;
	private int itemCount;
	
	// Construct a payroll with a specified work hours and number of items
	public Payroll(int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}
	
	// Calculate the salary according to payroll
	public int calculateSalary() {
		return (3 * workHour + 2 * itemCount);
	}
	
	// Print a text that explain this payroll
	public String toString() {
		return "The work hour is " + workHour + " and the produced item count is " + itemCount + ".";
	}
	
	
	/** Get and set methods */
	
	// Return the work hours of this payroll
	public int getWorkHour() {
		return workHour;
	}
	// Set a new work hours for this payroll
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	
	
	
	// Return the number of items of this payroll
	public int getItemCount() {
		return itemCount;
	}
	// Set a new number of items for this payroll
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
}
