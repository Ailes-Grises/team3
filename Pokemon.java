package RPG;
import java.util.*;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int type; // ノーマル=0, 炎=1, 水=2, 風=3
	private final int type_max = 3;
	private final int type_min = 1;
	private Map<String, Integer> waza_map = new HashMap<>();

	//	コンストラクタ-------------------------------------------

	public Pokemon() {
	}

	public Pokemon(String name, int hp, int atk, int def, int type) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.type = type;
	}

	//	とりあえず全部ゲッタセッタ-----------------------------------

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return atk
	 */
	public int getAtk() {
		return atk;
	}
	/**
	 * @param atk セットする atk
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}
	/**
	 * @return def
	 */
	public int getDef() {
		return def;
	}
	/**
	 * @param def セットする def
	 */
	public void setDef(int def) {
		this.def = def;
	}
	/**
	 * @return type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type セットする type
	 */
	public void setType(int type) {
		this.type = type;
	}

	public Integer getWaza_map(String waza_name){
		return this.waza_map.get(waza_name);
	}
	public void setWaza_map(String waza_name, Integer damage){
		this.waza_map.put(waza_name, damage);
	}


	//---------------------------------------------------


	public void basic_attack(int basic_damage, Pokemon enemy) {
		// basic_damage で技の威力や攻撃力を含めた基本ダメージを受け取る
		// この関数ではタイプ相性のみを計算する

		// 炎、水、風にそれぞれ1~3 の値をセットする
		// 「自分のtype値より1だけ大きい相手は相性bad」
		// 「自分のtype値より1だけ小さい相手は相性good」
		// 最小のtype値と最大の	type値を比較すると最小の typeが優勢
		if((this.type - enemy.getType() == this.type_min) || (this.type == this.type_min && enemy.getType() == this.type_max)){
			// こうかばつぐん
			enemy.setHp(enemy.getHp() - (basic_damage*2));
		}else if((enemy.getType() - this.type == this.type_min) || (this.type == this.type_max && enemy.getType() == this.type_min)){
			// こうかはいまひとつのようだ
			enemy.setHp(enemy.getHp() - (basic_damage/2));
		}else{
			enemy.setHp(enemy.getHp() - basic_damage);
		}
	}

}
