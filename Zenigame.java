package RPG;
import java.util.*;

public class Zenigame extends Pokemon{
	private List<String> waza_list = new ArrayList<>();
	public Zenigame(){
		super("ゼニガメ", 80, 40, 40, 1);
		this.setWaza_map("バブルこうせん", 40);
		this.setWaza_map("みずでっぽう", 20);
		this.setWaza_map("れいとうビーム", 80);
		this.setWaza_map("ぜったいれいど", 10000);
		
		this.waza_list.add("バブルこうせん");
		this.waza_list.add("みずでっぽう");
		this.waza_list.add("れいとうビーム");
		this.waza_list.add("ぜったいれいど");
	}

	public String getWaza_list(int seq){
		return this.waza_list.get(seq);
	}

	public void Attack(String waza_name, Pokemon enemy){
		// ダメージ計算
		// damage = 攻撃力  + 技威力 - 相手の防御力 / 2
		int damage = (this.getWaza_map(waza_name) + this.getAtk() - enemy.getDef()) / 2;
		this.basic_attack(damage, enemy);
	}

}
