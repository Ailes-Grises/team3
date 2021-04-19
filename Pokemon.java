package RPG;

public class Pokemon {
	private int hp;
	private int attack;
	// 他にもいろいろ
	
	public Pokemon(){
	}
	public Pokemon(全部受け取る){
		this.色々 = 受け取ったもの;
		this.enumy = enemy;
	}
	
	public String getName(){
	}
	public int getHp(){
		return this.hp;
	}
	// こんな感じでgetter とsetter を作る
	public void setHp(int hp){
		this.hp = hp;
	}

	public void AttackTo(String waza_name, Pokemon enemy){
		int damage = 0;
		enemy.setHp();
	}



}
