package collections;

import java.util.ArrayList;

import java.util.List;

public class Basket {

	private List<Item> itemList = new ArrayList<Item>();

	public void addItems(Item item, int amount) {

		for (int i = 0; i < amount; i++) {
			itemList.add(item);
		}
	}

	public void removeItems(Item item, int amount) {
		int counter = 0;
		for (Item i : itemList) {
			if (i.name == item.name) {
				counter++;
			}
		}
		if (counter < amount) {
			System.err.println("Please enter a valid amount");
		} else {

			for (int i = 0; i < amount; i++) {
				if (itemList.contains(item)) {
					itemList.remove(item);
				}
			}
		}

	}

	public static void main(String[] args) {
		Basket customerOne = new Basket();
		Basket customerTwo = new Basket();

		Item milk = new Item("Sut", 1.5, ItemType.READY_MEAL);
		Item bread = new Item("Bread", 1.1, ItemType.READY_MEAL);
		Item deterjan = new Item("Detejan", 2.5, ItemType.CLEANING);
		Item tisort = new Item("Tisort", 5.0, ItemType.CLOTHES);

		customerOne.addItems(deterjan, 5);
		customerOne.addItems(bread, 4);
		customerOne.addItems(milk, 5);
		customerOne.addItems(tisort, 2);

		customerOne.removeItems(milk, 2);
		customerOne.removeItems(bread, 3);
		customerOne.removeItems(deterjan, 4);
		customerOne.removeItems(tisort, 1);
		for (Item i : customerOne.itemList) {
			System.out.println(i);
		}

	}

}
