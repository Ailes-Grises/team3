package RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Hitokage hitokage = new Hitokage();
		Zenigame zenigame = new Zenigame();
		System.out.println(zenigame.getName() + "があらわれた！");
		System.out.println("君のポケモンは" + hitokage.getName() + "だ");
		while(true) {
			System.out.println("技名を入力＞");
			for(int i = 0; i < 4; i++) System.out.println(hitokage.getWaza_list(i));

			String input = sc.nextLine();
			// 自分の攻撃
			hitokage.Attack(input, zenigame);

			// 敵の攻撃
			// あんまりよくないけどこうやって実装してみる
			// List<String> enemy_attack_list = new ArrayList<>();
			// enemy_attack_list.add("バブルこうせん");
			// enemy_attack_list.add("みずでっぽう");
			// enemy_attack_list.add("れいとうビーム");
			// enemy_attack_list.add("ぜったいれいど");

			// 乱数で攻撃を選択
			String waza = zenigame.getWaza_list((int)(Math.random()*4.0));
			zenigame.Attack(waza, hitokage);
			System.out.println(zenigame.getName()  + "の" + waza + "！");
			if (hitokage.getHp()<=0) {
				System.out.println(hitokage.getName() + "はたおれた！");
				break;
			}else if(zenigame.getHp()<=0) {
				System.out.println(zenigame.getName() + "はたおれた！");
				break;
			}else {
				System.out.println("次の行動をえらべ");
			}
		}
	}

}
