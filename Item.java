package collections;

public class Item {
	String name;
	double price;
	ItemType type;
	
	public Item(String name, double price, ItemType type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}
