package testrpg;

import java.util.Random;
import java.util.Vector;

public class UnitManager  {
 
	static UnitManager instance = new UnitManager();
	Random ran = new Random();
	
	Vector<Player> playerlist = new Vector<Player>();
	Vector<Monster> monsterlist = new Vector<Monster>();
	
	String monsters[] = {"Wolf", "Oak", "Golem"};
	
	void init () {
		Player.init();
	}
	
	
	void random_monster_set(int size) {
		for(int i = 0; i < size; i ++ ) {
			int ranIdx = ran.nextInt(monsters.length);
			
			try {
				Class<?>clazz = Class.forName(monsters[ranIdx]);
			
                Object obj = clazz;
                Monster temp = (Monster) obj;
                int hp = ran.nextInt(100)+100;
                int mp = ran.nextInt(100)+100;
                int power = ran.nextInt(10)+50;
                temp.init (hp,mp,power);
                monsterlist.add(temp);
                
			}catch(Exception e) {
				 e.printStackTrace();
			}
			
		}
	}


	public void Guild() {
		
		
	}


	public void Inventory() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
	
	
	

}
