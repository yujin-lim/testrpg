package testrpg;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Setgame {

	static Setgame  instance  = new Setgame();
	public static String nextStage;
	Random ran = new Random();
	
	Map<String, Stage> stageList = new HashMap<String, Stage>();
	
	
	
	Setgame(){}
	
	public void init() {
		stageList.put("MANAGER",new StageManager());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("SETTING", new StageSetting());
		nextStage = "TITLE";	
	}

	public boolean changeStage() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
