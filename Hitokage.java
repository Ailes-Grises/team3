package RPG;
import java.util.*;

public class Hitokage extends Pokemon{
	public Hitokage(){
		super("ヒトカゲ", 80, 40, 40, 1);
		// this.waza_map.put("ひのこ", 40);
		// this.waza_map.put("ひっかく", 20);
		// this.waza_map.put("たいあたり", 20);
		// this.waza_map.put("かえんほうしゃ", 100);
		this.setWaza_map("ひのこ", 40);
		this.setWaza_map("ひっかく", 20);
		this.setWaza_map("たいあたり", 20);
		this.setWaza_map("かえんほうしゃ", 100);
	}

	public void Attack(String waza_name, Pokemon enemy){
		// ダメージ計算
		// damage = 攻撃力  + 技威力 - 相手の防御力 / 2
		int damage = (this.getWaza_map(waza_name) + this.getAtk() - enemy.getDef()) / 2;
		this.basic_attack(damage, enemy);
	}

}
