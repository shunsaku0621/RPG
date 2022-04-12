package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		人間リスト生成
		List<Living> humanList = new ArrayList<>();
		humanList.add(new Brave());
		humanList.add(new Fighter());
		humanList.add(new Wizard());
//		モンスターリスト生成
		List<Living> monsterList = new ArrayList<>();
		monsterList.add(new Oak());
		monsterList.add(new Slime());
		monsterList.add(new Dragon());
		
		for(int i =0; i >= 0; i++) {
			System.out.println("人間のターン！");
			humanList.get(Rand.get(humanList.size())).attack(monsterList.get(Rand.get(monsterList.size())));
			for(int j = 0; j < monsterList.size(); j++) {
//				System.out.println(monsterList.get(j).getHp());
				if(monsterList.get(j).getHp() <= 0) {
					monsterList.remove(j);
				}
			}
			
			if(humanList.size() == 0) {
				System.out.println("モンスター達は勝利した！");
				return;
			}else if(monsterList.size() == 0) {
				System.out.println("勇者達は勝利した！");
				return;
			}
					
			System.out.println("モンスターのターン！");
			monsterList.get(Rand.get(monsterList.size())).attack(humanList.get(Rand.get(humanList.size())));
			for(int s = 0; s < humanList.size(); s++) {
//				System.out.println(humanList.get(s).getHp());
				if(humanList.get(s).getHp() <= 0) {
					humanList.remove(s);
				}
			}	
						
			if(humanList.size() == 0) {
				System.out.println("モンスター達は勝利した！");
				return;
			}else if(monsterList.size() == 0) {
				System.out.println("勇者達は勝利した！");
				return;
			}
		}
		
	}
	
	

}
