//Name: Semih
//Surname: Bağ


// Define the employee class
public class Employee {
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items; 
	private Payroll payroll;
	
	
	// Construct a employee with a specified name, surname, work hours and speed
	public Employee(int id, String name, String surname, int workHour, int speed) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.workHour = workHour;
		this.speed = speed;
		this.items = new Item[0];
	}

	
	//Create items with randomly generated ids which made by employee and put them into items array
	public Item[] startShift() {
		
		this.items = new Item[this.workHour * this.speed];
				
		for (int i = 0 ; i < items.length ; i++) {
			items[i] = new Item((int)((Math.random() * 100) + 1));
		}
		return this.items;		
	}
	
	
	// Create appropriate payroll with work hours and number of items of employee
	public Payroll endShift() {
		this.payroll = new Payroll(this.workHour, this.items.length);
		return payroll;
	}
	
	
	// Print a text that explain this employee
	public String toString() {
		return "This is the employee with id " + this.id + " speed " + this.speed + ". The work hour is " + this.workHour + " and the produced item count is " + items.length + ".";
	}
	
	
	/** Get and set methods */

	// Return the id of this employee
	public int getId() {
		return id;
	}
	// Set a new id for this employee
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	// Return the name of this employee
	public String getName() {
		return name;
	}
	// Set a new name for this employee
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// Return the surname of this employee
	public String getSurname() {
		return surname;
	}
	// Set a new surname for this employee
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	// Return the work hours of this employee
	public int getworkHour() {
		return workHour;
	}
	// Set a new work hours for this employee
	public void setworkHour(int workHour) {
		this.workHour = workHour;
	}
	
	
	
	// Return the speed of this employee
	public int getSpeed() {
		return speed;
	}
	// Set a new speed for this employee
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	// Return the items array made by this employee
	public Item[] getItem() {
		return items;
	}
	
	
	
	// Return the id of item made by this employee with using index of item
	public int getItemId(int itemIndex) {
		return (int)(items[itemIndex].getId());
	}
	// Set a new id for item made by this employee with using index of item
	public void setItemId(int itemIndex, int id) {
		if ((id >= 1 && id <= 100) && (itemIndex < items.length && itemIndex >= 0))		//id must be in between 1-100 and index must be valid
			this.items[itemIndex].setId(id);
		else
			System.out.println("Unvalid index number or new id");
	}
	
	
	
	// Return the payroll of this employee
	public Payroll getPayroll() {
		return payroll;
	}
	// Set a new payroll for this employee
	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
}
