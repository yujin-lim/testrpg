package testrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StageSetting extends Stage {

	private StringBuffer buffer = new StringBuffer ();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public boolean update() {
		
		while(true) {
			buffer.append("=====setting====");
			buffer.append("[1.길드]");
			buffer.append("[2.파티]");
			buffer.append("[3.상점]");
			buffer.append("[4.인벤토리]");
			buffer.append("[5.파일]");
			buffer.append("[0.종료]");
			
			try {
				String input = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		return false;
	}

	@Override
	public void Init() {
		// TODO Auto-generated method stub
		
	}

}
