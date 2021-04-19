package RPG;

public class Pokemon {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private String type;
	private double type_k;
	
//	コンストラクタ-------------------------------------------
	
public Pokemon() {
}
	
public Pokemon(String name, int hp, int atk, int def, String type) {
		super();
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
	public String getType() {
		return type;
	}
	/**
	 * @return type_k
	 */
	public double getType_k() {
		return type_k;
	}

	/**
	 * @param type_k セットする type_k
	 */
	public void setType_k(double type_k) {
		this.type_k = type_k;
	}

	/**
	 * @param type セットする type
	 */
	public void setType(String type) {
		this.type = type;
	}
//---------------------------------------------------
	
	public void type_relation(Pokemon enemy) {
		if(this.type.equals(1) && enemy.equals(2)) {
			type_k = 0.5;
		}else if(this.type.equals(1) && enemy.equals(3)) {
			type_k = 2;
		}else if(this.type.equals(2) && enemy.equals(3)) {
			type_k = 0.5;
		}else if(this.type.equals(2) && enemy.equals(1)) {
			type_k = 2;
		}else if(this.type.equals(3) && enemy.equals(1)) {
			type_k = 0.5;
		}else if(this.type.equals(3) && enemy.equals(2)) {
			type_k = 2;
		}else {
			type_k = 1;
		}
	}
	
	public void attack(String waza_name, Pokemon enemy) {
		int damage = (int)(waza_list.get(waza_name)*this.atk*this.type_k - enemy.getDef()/2.0);
		enemy.setHp(enemy.getHp()-damage);
	}
}
