package view;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mod.ItemsList;
import mod.CovidShop;
import mod.Buyer;
import cont.JOP;

/**
 * This class, ImageButton, manages all the GUI and button actions for the program.
 * It creates the JFrame, JPanel, buttons, and images. 
 * The class also consists of two lists:
 *   - a list of items in the buyer's cart
 *   - a list of buyers
 * @author diyaa
 *
 */
public class ImageButton extends JFrame implements ActionListener {
	
	private int cnt = 0;
	private String curBuyer = "";
	private ItemsList _il = new ItemsList("", 0, 0, "");
	ArrayList<ItemsList> myOrders = new ArrayList<ItemsList>();
	private ArrayList<Buyer> buyers = new ArrayList<Buyer>();
	
	ImageIcon image1, image2, image3, image4, image5, image6, image7, image8;
	JButton button1, button2, button3, button4, button5, button6, button7, 
			button8, orders, checkout, addBuyer, switchBuyer;
	
	JLabel welcome, label, space;
	
	int one = 50;
	int two = 50;
	int three = 50;
	int four = 50;
	int five = 50;
	int six = 50;
	int seven = 50;
	int eight = 50;
	
	public ArrayList<ItemsList> getOrdersArray(){
		return myOrders;
	}
	
	public ImageButton() {
		addFirstBuyer();
		itemsButton();
	}
	
	public String addFirstBuyer() {
		String first = JOP.in("Welcome to the COVID Shop!\nEnter your name to continue.");
		curBuyer = first;
		buyers.add(new Buyer(first));
		return first;
	}
	
	//creates the GUI (frame, buttons, panel)
	public void itemsButton() {
		setLayout(new FlowLayout());
		setTitle("The COVID Shop");
		setSize(600, 600);

		setLocationRelativeTo(null);
		
		welcome = new JLabel("Welcome to the COVID Shop!");
		label = new JLabel("Here you can buy everything you need for the COVID-19 pandemic. PERSON SHOPPING: " + curBuyer);
		space = new JLabel("");
		
		cnt = 1;
		button1 = new JButton("Surgical Masks (pk of 50)", scaleImage());
		cnt = 2;
		button2 = new JButton("N95 Masks (pk of 20)", scaleImage());
		cnt = 3;
		button3 = new JButton("Cloth Masks (pk of 10)", scaleImage());
		cnt = 4;
		button4 = new JButton("Face Shield (pk of 10)", scaleImage());
		cnt = 5;
		button5 = new JButton("8 oz Hand Sanitizer (pk of 4)", scaleImage());
		cnt = 6;
		button6 = new JButton("Lysol Wipes (pk of 2)", scaleImage());
		cnt = 7;
		button7 = new JButton("Latex Gloves (pk of 100)", scaleImage());
		cnt = 8;
		button8 = new JButton("Toilet Paper (6 rolls)", scaleImage());
		
		orders = new JButton("Buyer's Shopping Cart");
		checkout = new JButton("Checkout");
		addBuyer = new JButton("Add a New Buyer");
		switchBuyer = new JButton("Switch the Current Buyer");
		
		add(welcome);
		add(label);
		add(space);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(orders);
		add(checkout);
		add(addBuyer);
		add(switchBuyer);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		orders.addActionListener(this);
		checkout.addActionListener(this);
		addBuyer.addActionListener(this);
		switchBuyer.addActionListener(this);
		
		button1.setPreferredSize(new Dimension(200, 100));
		button2.setPreferredSize(new Dimension(200, 100));
		button3.setPreferredSize(new Dimension(200, 100));
		button4.setPreferredSize(new Dimension(200, 100));
		button5.setPreferredSize(new Dimension(200, 100));
		button6.setPreferredSize(new Dimension(200, 100));
		button7.setPreferredSize(new Dimension(200, 100));
		button8.setPreferredSize(new Dimension(200, 100));
		orders.setPreferredSize(new Dimension(200, 50));
		checkout.setPreferredSize(new Dimension(200, 50));
		addBuyer.setPreferredSize(new Dimension(200, 50));
		switchBuyer.setPreferredSize(new Dimension(200, 50));
		
		button1.setVerticalTextPosition(AbstractButton.BOTTOM);
		button1.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button2.setVerticalTextPosition(AbstractButton.BOTTOM);
		button2.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button3.setVerticalTextPosition(AbstractButton.BOTTOM);
		button3.setHorizontalTextPosition(AbstractButton.CENTER);
	
		button4.setVerticalTextPosition(AbstractButton.BOTTOM);
		button4.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button5.setVerticalTextPosition(AbstractButton.BOTTOM);
		button5.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button6.setVerticalTextPosition(AbstractButton.BOTTOM);
		button6.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button7.setVerticalTextPosition(AbstractButton.BOTTOM);
		button7.setHorizontalTextPosition(AbstractButton.CENTER);
		
		button8.setVerticalTextPosition(AbstractButton.BOTTOM);
		button8.setHorizontalTextPosition(AbstractButton.CENTER);
	}
	
	private Image scaleImage(Image image, int w, int h) {

	    Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
	    return scaled;
	}
	
	//scales the image
	public ImageIcon scaleImage() {
		
		if(cnt == 1) {
			image1 = new ImageIcon(getClass().getResource("smask.PNG"));
			int width = image1.getIconWidth() / 12;
			int height = image1.getIconHeight() / 12;
			Image scaled = scaleImage(image1.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 2) {
			image2 = new ImageIcon(getClass().getResource("n95.PNG"));
			int width = image2.getIconWidth() / 12;
			int height = image2.getIconHeight() / 12;
			Image scaled = scaleImage(image2.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 3) {
			image3 = new ImageIcon(getClass().getResource("clothm.PNG"));
			int width = image3.getIconWidth() / 10;
			int height = image3.getIconHeight() / 10;
			Image scaled = scaleImage(image3.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 4) {
			image4 = new ImageIcon(getClass().getResource("faceshield.PNG"));
			int width = image4.getIconWidth() / 12;
			int height = image4.getIconHeight() / 12;
			Image scaled = scaleImage(image4.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 5) {
			image5 = new ImageIcon(getClass().getResource("purell.PNG"));
			int width = image5.getIconWidth() / 12;
			int height = image5.getIconHeight() / 12;
			Image scaled = scaleImage(image5.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 6) {
			image6 = new ImageIcon(getClass().getResource("lysol.PNG"));
			int width = image6.getIconWidth() / 8;
			int height = image6.getIconHeight() / 8;
			Image scaled = scaleImage(image6.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		else if(cnt == 7) {
			image7 = new ImageIcon(getClass().getResource("latex.PNG"));
			int width = image7.getIconWidth() / 12;
			int height = image7.getIconHeight() / 12;
			Image scaled = scaleImage(image7.getImage(), width, height);
			ImageIcon scaledIcon = new ImageIcon(scaled);
			return scaledIcon;
		}
		image8 = new ImageIcon(getClass().getResource("tp.PNG"));
		int width = image8.getIconWidth() / 12;
		int height = image8.getIconHeight() / 12;
		Image scaled = scaleImage(image8.getImage(), width, height);
		ImageIcon scaledIcon = new ImageIcon(scaled);
		return scaledIcon;
		
	}
	
	//displays all the buyers as a string
	public String displayBuyers() {
		String bString = "";
		for(int i = 0; i < buyers.size(); i++) {
			bString += (i+1) + ") " + buyers.get(i).getName() + "\n";
		}
		return bString;
	}
	
	//displays all of a buyer's orders in a string
	public String getMyOrders() {
		String items = "";
		double totalPrice = 0;
		for(int i = 0; i < myOrders.size(); i++)
		{
			String name = myOrders.get(i).getName();
			double price = myOrders.get(i).getPrice();
			double availability = myOrders.get(i).getAvailability();
			String buyer = myOrders.get(i).getBuyer();
			items += (i+1) + ") " + buyer + " - " + name + " - $" + price + " (" + availability + " items)";
			items += "\n";
			totalPrice += Math.round((myOrders.get(i).getPrice()) * 1000.0) / 1000.0;
		}
		return items + "\nTotal Price: $" + totalPrice + "\n";
	}
	
	//controls all the actions of the buttons
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == addBuyer) {
			String name = JOP.in(displayBuyers() + "Enter the name of the new buyer.");
			buyers.add(new Buyer(name));
			curBuyer = name;
			label.setText("Here you can buy everything you need for the COVID-19 pandemic. PERSON SHOPPING: " + curBuyer);
		}
		if(e.getSource() == switchBuyer) {
			String change = JOP.in(displayBuyers() + "Which buyer would you like to change to?\nEnter the number of the buyer on the list.");
			int ch = Integer.parseInt(change);
			curBuyer = buyers.get(ch-1).getName();
			label.setText("Here you can buy everything you need for the COVID-19 pandemic. PERSON SHOPPING: " + curBuyer);
		}
			if(e.getSource() == button1) {
				if(one <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
					String n = JOP.in("Surgical masks (pk of 50) \nPrice: $16.99" 
							+ "\nQuantity Available: " + one
							+"\nHow many boxes of surgical masks do you want?");
					int num = Integer.parseInt(n);
					if(num > one) { 
						JOP.msg("Sorry, you can't buy more items than the " + one + " items available.");
					}
					else {
						one = one - num;
						double price = Math.round((16.99*(double)num) * 1000.0) / 1000.0;
						myOrders.add(new ItemsList(_il.makeItemsArray().get(0).getName(), price, num, curBuyer));
					}
				}
			}
			else if(e.getSource() == button2) {
				if(two <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("N95 masks (pk of 20) \nPrice: $29.99" 
						+ "\nQuantity Available: " + two
						+"\nHow many boxes of N95 masks do you want?");
				int num = Integer.parseInt(n);
				if(num > two) { 
					JOP.msg("Sorry, you can't buy more items than the " + two + " items available.");
				}
				else {
					two = two - num;
					double price = Math.round((29.99*(double)num) * 1000.0) / 1000.0;
					myOrders.add(new ItemsList(_il.makeItemsArray().get(1).getName(), price, num, curBuyer));
				}
			}

		}
			else if(e.getSource() == button3) {
				if(three <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("Cloth masks (pk of 10) \nPrice: $14.99" 
						+ "\nQuantity Available: " + three
						+"\nHow many boxes of cloth masks do you want?");
				int num = Integer.parseInt(n);
				if(num > three) { 
					JOP.msg("Sorry, you can't buy more items than the " + three + " items available.");
				}
				else {
				three = three - num;
				double price = Math.round((14.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(2).getName(), price, num, curBuyer));
				}
				}
		
			}
			else if(e.getSource() == button4) {
				if(four <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("Face Shields (pk of 10) \nPrice: $21.99" 
						+ "\nQuantity Available: " + four
						+"\nHow many face shields packs do you want?");
				int num = Integer.parseInt(n);
				if(num > four) { 
					JOP.msg("Sorry, you can't buy more items than the " + four + " items available.");
				}
				else {
				four = four - num;
				double price = Math.round((21.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(3).getName(), price, num, curBuyer));
				}
				}
		
			}
			else if(e.getSource() == button5) {
				if(five <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("8 oz Hand Sanitizer (pk of 4) \nPrice: $23.99" 
						+ "\nQuantity Available: " + five
						+"\nHow many packs of hand sanitizer do you want?");
				int num = Integer.parseInt(n);
				if(num > five) { 
					JOP.msg("Sorry, you can't buy more items than the " + five + " items available.");
				}
				else {
				double price = Math.round((23.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(4).getName(), price, num, curBuyer));
				five = five - num;
				}
				}
			}
			else if(e.getSource() == button6) {
				if(six <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("Lysol Wipes (pk of 2) \nPrice: $8.99" 
						+ "\nQuantity Available: " + six
						+"\nHow many packs of Lysol wipes do you want?");
				int num = Integer.parseInt(n);
				if(num > six) { 
					JOP.msg("Sorry, you can't buy more items than the " + six + " items available.");
				}
				else {
				double price = Math.round((8.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(5).getName(), price, num, curBuyer));
				six = six - num;
				}
				}
			}
			else if(e.getSource() == button7) {
				if(seven <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("Latex Gloves (pk of 100) \nPrice: $18.99" 
						+ "\nQuantity Available: " + seven
						+"\nHow many boxes of latex gloves do you want?");
				int num = Integer.parseInt(n);
				if(num > seven) { 
					JOP.msg("Sorry, you can't buy more items than the " + seven + " items available.");
				}
				else {
				double price = Math.round((18.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(6).getName(), price, num, curBuyer));
				seven = seven - num;
				}
				}
			}
			else if(e.getSource() == button8) {
				if(eight <= 0) {
					JOP.msg("Sorry, you can't buy any more of this item\nbecause you reached maximum capacity.");
				}
				else {
				String n = JOP.in("Toilet Paper (pk of 6 rolls) \nPrice: $5.99" 
						+ "\nQuantity Available: " + eight
						+"\nHow many packs of toilet paper do you want?");
				int num = Integer.parseInt(n);
				if(num > eight) { 
					JOP.msg("Sorry, you can't buy more items than the " + eight + " items available.");
				}
				else {
				eight = eight - num;
				double price = Math.round((5.99*(double)num) * 1000.0) / 1000.0;
				myOrders.add(new ItemsList(_il.makeItemsArray().get(7).getName(), price, num, curBuyer));
				}
			}
				}
			
			else if(e.getSource() == orders) {
				String msg = getMyOrders();
				String again = JOP.in(msg + "\nWould you like to remove an order? Enter y or n.");
				
				if(again.equalsIgnoreCase("y")) {
					String remove1 = JOP.in(msg + "Would you like to remove an item "
							+ "\n1) By buyer \n2) By product \n3) By number on the list? "
							+ "\nEnter the number (between 1-3)");
					int rem = Integer.parseInt(remove1);
					if(rem == 1) {
						String r = JOP.in(displayBuyers() + "Which buyer's products would you like to remove?"
								+ "\nEnter the number of the buyer.");
						int re = Integer.parseInt(r);
						for(int i = 0; i < myOrders.size(); i++) {
							if(myOrders.get(i).getBuyer().equals(buyers.get(re - 1).getName())){
								if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(0).getName())) { 
									one += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(1).getName())) { 
									two += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(2).getName())) { 
									three += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(3).getName())) { 
									four += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(4).getName())) { 
									five += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(5).getName())) { 
									six += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(6).getName())) { 
									seven += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(7).getName())) { 
									eight += myOrders.get(i).getAvailability(); }
								myOrders.remove(i);
								i--;
							}
						}
					}
					else if(rem == 2) {
						String remove2 = JOP.in("THE SHOPPING CART\n" + getMyOrders() + "\n\nTHE COVID STORE'S MENU\n" + _il.getMenu() + 
								"Which item would you like to remove? Enter the number on "
								+ " the menu list. \nRemember, whatever"
								+ " item you input, ALL those items on the list"
								+ "\nwill be removed (from ALL buyers).");
						int rem2 = Integer.parseInt(remove2);
						for(int i = 0; i < myOrders.size(); i++) {
							if(_il.makeItemsArray().get(rem2 - 1).getName().equals(myOrders.get(i).getName())) {
								if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(0).getName())) { 
									one += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(1).getName())) { 
									two += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(2).getName())) { 
									three += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(3).getName())) { 
									four += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(4).getName())) { 
									five += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(5).getName())) { 
									six += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(6).getName())) { 
									seven += myOrders.get(i).getAvailability(); }
								else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(7).getName())) { 
									eight += myOrders.get(i).getAvailability(); }
								myOrders.remove(i);
								i--;
							}
						}
								
					}
					else if(rem == 3) {
						String remove3 = JOP.in("SHOPPING CART\n" + getMyOrders() + "Which specific item"
								+ " on the list would you like to remove?\nEnter it's number on"
								+ " the list");
						int rem3 = Integer.parseInt(remove3);
						int i = rem3 - 1; //to find the index (which starts at 0) 
						
						if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(0).getName())) { 
							one += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(1).getName())) { 
							two += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(2).getName())) { 
							three += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(3).getName())) { 
							four += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(4).getName())) { 
							five += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(5).getName())) { 
							six += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(6).getName())) { 
							seven += myOrders.get(i).getAvailability(); }
						else if(myOrders.get(i).getName().equals(_il.makeItemsArray().get(7).getName())) { 
							eight += myOrders.get(i).getAvailability(); }
						myOrders.remove(i);
					}
				}
			}
			else if(e.getSource() == checkout) {
				String q = JOP.in("Would you like to checkout for " + curBuyer + "? "
						+ "\nEnter y or n.");
				if(q.equalsIgnoreCase("y")) {
					String msg = getOrderSpecific(curBuyer);
					JOP.msg(msg + "\nThanks for shopping at the Covid Shop!");
					System.exit(0);
				}
				else if(q.equalsIgnoreCase("n")) {
					JOP.msg("To checkout for any of the other buyers, go back"
							+ "\nand click the button 'Switch the Current Buyer'"
							+ "\nto checkout for the buyer of your choice.");
				}
			}
		}
	
	//gets all the orders of a specific buyer
	public String getOrderSpecific(String cur) {
		String items = "";
		double totalPrice = 0;
		int ind = 0;
		for(int i = 0; i < myOrders.size(); i++)
		{
			if(myOrders.get(i).getBuyer().equals(cur)) {
				String name = myOrders.get(i).getName();
				double price = myOrders.get(i).getPrice();
				double availability = myOrders.get(i).getAvailability();
				String buyer = myOrders.get(i).getBuyer();
				items += (ind+1) + ") " + buyer + " - " + name + " - $" + price + " (" + availability + " items)";
				items += "\n";
				totalPrice += Math.round((myOrders.get(i).getPrice()) * 1000.0) / 1000.0;
				ind++;
			}
		}
		return items + "\nTotal Price: $" + totalPrice + "\n";
	}
		
	}
	

