package testrpg;

import java.util.Vector;

public class Guild {

	final int Party_Size = 2;
	Vector<Player>guildlist = new Vector<>();
	Unit[]  partyList;
	
	void SetGuild() {
		guildlist.add(new Player ("Hero", 300,300,100,100,150,2));
		
	}
	
	
	
	
	
}
