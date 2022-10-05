//Name: Semih
//Surname: Bað
//Student ID:150120070

// Define the storage class
public class Storage {
	private int capacity;
	private Item[] items;
	
	
	// Construct a storage with a specified capacity
	public Storage(int capacity) {
		this.capacity = capacity;
		this.items = new Item[0];
	}
	
	
	// Add item to items array step 
	public void addItem(Item item) {
			Item[] tempItems = new Item[items.length +1];
			
			for (int i = 0 ; i < items.length ; i++) {
				tempItems[i] = items[i];
			}
			tempItems[items.length] = item;
			this.items = tempItems;		
	}
	
	
	/** Get and set methods */
	
	// Return the capacity of this storage
	public int getCapacity() {
		return capacity;
	}
	// Set a new capacity for this storage
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	// Return the items array of this storage
	public Item[] getItems() {
		return this.items;
	}
	// Set a new list of items for this storage
	public void setItems(Item items[]) {
		if (items.length <= capacity) {
			this.items = items;
		}
		else {
			System.out.println("Insufficient capacity!");
		}
	}
}
