package testrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class File {
	private BufferedReader bufferedReader;
	private FileWriter fileWriter;
	private FileReader filereader;
	private File file;
	private String fileName = "testrpg";
	
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private StringBuffer buffer = new StringBuffer();
//	Private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void File() {
		// TODO Auto-generated method stub
		while (true) {
			buffer.append("=====FILE====");
			buffer.append("[1.저장] [2.로드] [3.종료]");

			String input = buffer.toString();

			if (input.equals("저장")) {
				save();
			} 
			else if (input.equals("로드")) {
				load();
			} 
			else if (input.equals("종료")) {
				buffer.append("종료합니다.");
				return;
			}
		}

	}
	public void save() {
	
		
	}
	public void load() {
		
		
	}

}
