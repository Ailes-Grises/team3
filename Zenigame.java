package RPG;
import java.util.*;

public class Zenigame extends Pokemon{
	public Zenigame(){
		super("ゼニガメ", 80, 40, 40, 1);
		// this.waza_map.put("バブルこうせん", 40);
		// this.waza_map.put("みずでっぽう", 20);
		// this.waza_map.put("冷凍ビーム", 80);
		// this.waza_map.put("ぜったいれいど", 10000);
		this.setWaza_map("バブルこうせん", 40);
		this.setWaza_map("みずでっぽう", 20);
		this.setWaza_map("れいとうビーム", 80);
		this.setWaza_map("ぜったいれいど", 10000);
	}

	public void Attack(String waza_name, Pokemon enemy){
		// ダメージ計算
		// damage = 攻撃力  + 技威力 - 相手の防御力 / 2
		int damage = (this.getWaza_map(waza_name) + this.getAtk() - enemy.getDef()) / 2;
		this.basic_attack(damage, enemy);
	}

}
