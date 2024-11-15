package testrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Vector;

public class Guild {
	private Random  ran = new Random();
	private static final String LOBBY = null;
	private StringBuffer buffer = new StringBuffer ();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    

	private final int Party_Size = 2;
	public Vector<Player>guildlist = new Vector<>();
	public Unit[]  partyList;
	
	public void SetGuild() {
		guildlist.add(new Player("Hero", 300, 100, 100, 100, 2));
		guildlist.add(new Player("Magicican", 250, 200, 150, 100, 3));

		for (int i = 0; i < Party_Size; i++) {
			guildlist.get(i).party = true;
		}

		partyList = new Unit[Party_Size];

		int n = 0;
		for (int i = 0; i < guildlist.size(); i++) {
			if (guildlist.get(i).party == true) {
				partyList[n] = guildlist.get(i);
				n += 1;
			}
		}
	}
	
	Player GetGuildUnit (int num) {
		return guildlist.get(num);
	}
	
	public void printAllUnit () {
		buffer.append("==================");
		buffer.append("[골드 : " + Player.money +  " 골드 ");
		buffer.append("=======길드원========");
		for(int i = 0; i < guildlist.size(); i++) {
			buffer.append("[" + (i+1)+ "번]");
			buffer.append("[이름  : " + guildlist.get(i).getName() + "]");
			buffer.append("[체력  : " + guildlist.get(i).getHp() + "]");
			buffer.append("[마력  : " + guildlist.get(i).getMp() + "]");
			buffer.append("[방어력 : " + guildlist.get(i).getShield() + "]");
			buffer.append("[파워력 : " + guildlist.get(i).getPower()+ "]");
			buffer.append("[스킬 : " + guildlist.get(i).getSkill() + "]");
			buffer.append("[파티중 : " + guildlist.get(i).party + "]");
			buffer.append("==================");
		}
		buffer.append("==================");
	}
	
	public void printUnit(int selUnit) {
		guildlist.get(selUnit). printAllUnit();
	}
	
	public void printUnitItem(int selUnit) {
		guildlist.get(selUnit). printAllUnitItem();
	}
	
	public void printGuildMenu() {
		while (true) {
			buffer.append("======길드메뉴=====");
			buffer.append("[1.길드원 추가] \t\t [2.길드원 삭제] \t\t [3. 길드 목록]");
			buffer.append("[4.파티원 교체] \t\t [5. 종료] ");
			buffer.append("==================");

			String input = buffer.toString();
			if (input.equals("길드원 추가")) {
				addGuild();
			} else if (input.equals("길드원 삭제")) {
				removeGuild();
			} else if (input.equals("길드 목록")) {
				printAllUnit();
			} else if (input.equals("파티원 교체")) {
				partyChange();
			} else if (input.equals("종료")) {
				return;
			}
		}
	}
	
	public void addGuild() {
		
		if(Player.money < 60000) 
			return;
		String []name1 = { "김","이","박","최","정","강","조","윤"};
		String []name2 = { "민","서","도","예","지","하","시","주"};
		String []name3 = { "준","윤","주","유","호","원","우","현"};
		
		String name = name1[ran.nextInt(name1.length)];
		name += name2[ran.nextInt(name2.length)];
		name += name3[ran.nextInt(name3.length)];
		
		int rNum = ran.nextInt(2)+8;
		int hp = rNum * 5;
		int mp = rNum * 5;
		int shield =  rNum * 5;
		int power = rNum * 5;
		int skill = 2;
		
		Player temp = new Player(name, hp, mp, shield, power, skill, true);
		
	}
	
	
	
	
}
