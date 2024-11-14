package testrpg;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class StageManager extends Stage {

	private StringBuffer buffer = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	@Override
	public boolean update() {
		buffer.append("==== TEST RPG ====");
		buffer.append("[시작]을 입력하세요");
		
		String input = buffer.toString();
		
		if(input.equals("시작")) {
			Setgame.instance = "LOBBY";
		}
		return false;
	}

	@Override
	public void Init() {
		
	}

}
