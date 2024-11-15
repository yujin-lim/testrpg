package testrpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Shopping {
	private StringBuffer buffer = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(System.out));
	private BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

	ArrayList<Item>shoplist = new ArrayList<>();
	
	public void Shopping() {
		Item temp = new Item ();
		temp.name = "나무검";
		temp.kind = Item.WEAPON;
		temp.price = 1000;
		temp.power = 10;
		shoplist.add(temp);
				
		temp = new Item ();
		temp.name = "철검";
		temp.kind = Item.WEAPON;
		temp.price = 2000;
		temp.power = 15;
		shoplist.add(temp);
				
		temp = new Item ();
		temp.name = "다이아검";
		temp.kind = Item.WEAPON;
		temp.price = 5500;
		temp.power = 80;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "나무갑옷";
		temp.kind = Item.ARMOR;
		temp.price = 1000;
		temp.power = 10;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "철갑옷";
		temp.kind = Item.ARMOR;
		temp.price = 1500;
		temp.power = 20;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "다이아갑옷";
		temp.kind = Item.ARMOR;
		temp.price = 5500;
		temp.power = 80;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "힘재생포션";
		temp.kind = Item.POTION;
		temp.price = 1000;
		temp.power = 50;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "힘재생포션2";
		temp.kind = Item.POTION;
		temp.price = 2000;
		temp.power = 100;
		shoplist.add(temp);
		
		temp = new Item ();
		temp.name = "힘재생포션3";
		temp.kind = Item.POTION;
		temp.price = 3000;
		temp.power = 150;
		shoplist.add(temp);
	}
	
	public void shopTable() {
		while (true) {
			buffer.append("=====상 점======");
			buffer.append("[1.무기] [2.갑옷] [3.포션]");

			String input = buffer.toString();
			int value = Integer.parseInt(input);

			if (input.equals("무기")) {
				value = Item.WEAPON;
			} else if (input.equals("갑옷")) {
				value = Item.ARMOR;
			} else if (input.equals("포션")) {
				value = Item.POTION;
			}
			
			buffer.append("===================");
			buffer.append("[골드 :" + Player.money+ "골드]");
			buffer.append("구매하시고 싶은 아이템 번호를 입력해주세요 [0.뒤로가기]");
			
		    input = buffer.toString();
			int number = Integer.parseInt(input);
			
			if(number == 0) {
				break;
			}
			int count = 0;
			for (int i = 0; i < shoplist.size(); i++) {
				if (shoplist.get(i).kind == value) {
					count += 1;

					if (count == number) {
						Player.inventory.addItem(shoplist.get(i));
						Player.money -= shoplist.get(i).price;
						buffer.append("[" + shoplist.get(i).name + "을 구매하셨습니다]");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}
				}
			}
		}
	}

	public void printItem(int kind) {
		int count = 0;
		for (int i = 0; i < shoplist.size(); i++) {
			if (shoplist.get(i).kind != kind)

			buffer.append("[" + (count + 1) + "번] ");
			buffer.append("[이름  : " + shoplist.get(i).name + "] ");
			buffer.append("[공격력 : " + shoplist.get(i).power + "] ");
			buffer.append("[가격  : " + shoplist.get(i).price + "] ");
			buffer.append("====================");
			count += 1;
		}
	}
}
