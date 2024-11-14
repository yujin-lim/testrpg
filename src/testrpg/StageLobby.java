package testrpg;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class StageLobby extends Stage {
	
	private StringBuffer buffer = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	@Override
	public boolean update() {
		buffer.append("====Lobby====");
		buffer.append("[1.전투] [2.설정] [3.종료]");

		String input = buffer.toString();

		if (input.equals("전투")) {
			Setgame.instance = "BATTLE";
		} else if (input.equals("설정")) {
			Setgame.instance = "SETTING";
		} else if (input.equals("종료")) {
			Setgame.instance = "EXIT";
		}
		return false;
	}

	@Override
	public void Init() {
		UnitManager.instance.init();

	}

}
