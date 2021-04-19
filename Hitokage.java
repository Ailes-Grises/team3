package RPG;
import java.util.*;

public class Hitokage extends Pokemon{
	private List<String> waza_list = new ArrayList<>();

	public Hitokage(){
		super("ヒトカゲ", 80, 40, 40, 1);
		this.setWaza_map("ひのこ", 40);
		this.setWaza_map("ひっかく", 20);
		this.setWaza_map("たいあたり", 20);
		this.setWaza_map("かえんほうしゃ", 100);

		this.waza_list.add("ひのこ");
		this.waza_list.add("ひっかく");
		this.waza_list.add("たいあたり");
		this.waza_list.add("かえんほうし");
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
