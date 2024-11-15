package testrpg;

public class Player extends Unit{
	
	static Guild guild = new Guild();
	static Inventory inventory = new Inventory();
	static int money = 100000;
	
	public Player(){}
	
	

	public Player(String name, int hp, int mp, int shield, int power, int skill) {
		super(name, hp, mp, shield, power, skill);
	}
	
	public Player(String name, int hp, int mp, int shield, int power, int skill, boolean party) {
		super(name, hp, mp, shield, power, skill, false);
	}

	

	public static void skill() {
		
	}

	public static void init() {
		money = 100000;
		guild.SetGuild();
	}

	public void printGuildMenu() {
		guild.printGuildMenu();
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}



	public void printAllUnit() {
		// TODO Auto-generated method stub
		
	}



	public void printAllUnitItem() {
		// TODO Auto-generated method stub
		
	}

	
}
