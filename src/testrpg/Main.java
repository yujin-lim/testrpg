package testrpg;

public class Main {
	public static void main(String[] args) {
		boolean run = true;
	    Setgame.instance.init();
	    while (true) {
	      run =  Setgame.instance.changeStage();
	      if (run == false) {
	        break;
	      }
	    }
	    System.out.println("게임 종료");
	  }
	}