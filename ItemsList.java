package mod;

import java.util.ArrayList;

/**
 * This class, ItemsList, represents an item in the shop.
 * Each item has: 
 *   - a name
 *   - a price
 *   - how many of that item are currently available
 *   - the buyer of the item
 * @author diyaa
 *
 */
public class ItemsList {
	
	private String name;
	private double price;
	private int available;
	private String buyer;
	ArrayList<ItemsList> items;
	
	public ItemsList(String na, double p, int a, String b) {
		name = na;
		price = p;
		available = a;
		buyer = b;
	}
	
	public String getName() { return name; }
	public double getPrice() { return price; }
	public int getAvailability() { return available; }
	public String getBuyer() { return buyer; }

	
	public ArrayList<ItemsList> makeItemsArray() {
		items = new ArrayList<ItemsList>();
		items.add(new ItemsList("Surgical Masks (pk of 50)", 16.99, 50, ""));
		items.add(new ItemsList("N95 Masks (pk of 20)", 29.99, 50, ""));
		items.add(new ItemsList("Cloth Masks (pk of 10)", 14.99, 50, ""));
		items.add(new ItemsList("Face Shields (pk of 10)", 21.99, 50, ""));
		items.add(new ItemsList("Hand Sanitizer (pk of 4)", 23.99, 50, ""));
		items.add(new ItemsList("Lysol Wipes (pk of 2)", 8.99, 50, ""));
		items.add(new ItemsList("Latex Gloves (pk of 100)", 18.99, 50, ""));
		items.add(new ItemsList("Toilet Paper (pk of 6)", 5.99, 50, ""));
		
		return items;
	}
	
	/**
	 * This method returns the entire list of items in the shop as a String.
	 * @return
	 */
	public String getMenu() {
		String itemsL = "";
		double totalPrice = 0;
		for(int i = 0; i < items.size(); i++)
		{
			String name = items.get(i).getName();
			double price = items.get(i).getPrice();
			double availability = items.get(i).getAvailability();
			String buyer = items.get(i).getBuyer();
			itemsL += (i+1) + ") " + buyer + " - " + name + " - $" + price + " (" + availability + " items)";
			itemsL += "\n";
			totalPrice += Math.round((items.get(i).getPrice()) * 1000.0) / 1000.0;
		}
		return itemsL + "\nTotal Price: $" + totalPrice + "\n";
	}
}
