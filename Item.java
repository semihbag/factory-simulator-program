//Name: Semih
//Surname: Bağ


// Define the item class
public class Item {
	private int id;
	public static int numberOfItems;
	
	// Construct a item with a specified id
	public Item(int id) {
		this.id = id;
		numberOfItems++;
	}
	
	
	/** Get and set methods */
	
	// Return the id of this item
	public int getId() {
		return id;
	}
	// Set a new id for this item
	public void setId(int id) {
		this.id = id;
	}

	
	
	// Return the total number of items
	public static int getNumberOfItems() {
		return numberOfItems;
	}
}
