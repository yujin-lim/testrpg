package testrpg;

public class Item {

	static final int WEAPON = 1;
	static final int ARMOR = 2;
	static final int POTION = 3;
	
	String name;
	int kind;
	int price; 
	int power;
	
	
	public void setItem(String n, int k, int pr, int pow) {
		name = n;
		kind = k;
		price = pr;
		power = pow;
	}
	
}
