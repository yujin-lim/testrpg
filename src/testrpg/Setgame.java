package testrpg;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Setgame {
	
	private StringBuffer buffer = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	

	static Setgame  instance  = new Setgame();
	public static String nextStage = "";
	private Random ran = new Random();
	private String curStage = "";
	
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
		buffer.append("CurStage:"+ curStage);
		buffer.append("nextStage:"+ nextStage);
		
		if(curStage .equals(nextStage)) 
			return true;
		
		curStage = nextStage;
		Stage stage = stageList.get(curStage);
		stage.Init();
		
		boolean run = true;
		while (run) {
			run = stage.update();
			if (run == false)
				break;
		}
		if (nextStage.equals(""))
			return false;
		else
			return true;
	}
}
