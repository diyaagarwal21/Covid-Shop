package mod;

import java.util.ArrayList;
import view.ImageButton;

import cont.JOP;
import view.ImageButton;

/** This class calls the ImageButton class (with all the GUI)
 * to start the program.
 */
public class CovidShop {

	private ItemsList _m;
	private ImageButton b;
	
	public CovidShop() {
		_m = new ItemsList("", 0, 0, "");
		b = new ImageButton();
		b.setSize(600, 700);
		b.setVisible(true);
	}
}

