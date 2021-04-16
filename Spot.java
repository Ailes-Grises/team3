package tsuri_pkg;
import java.util.ArrayList;
import java.util.HashMap;

public class Spot {
	/*
	 * HashMap -> 魚
	 * List -> 釣った魚リスト
	 *
	 * コンストラクタ -> 魚の出現率を設定
	 *
	 */

	private HashMap<String, Integer> fish = new HashMap<String, Integer>();
	private ArrayList<String> fished_list;

	public Spot(){
		this.fish.put("マグロ", 100);
		this.fish.put("メダカ", 1);
		this.fish.put("タコ", 30);
		this.fish.put("長靴", -30);
		this.fish.put("はまち", 70);
		this.fish.put("ヒラメ", 50);
		this.fish.put("スカ", 0);
	}
	public Spot(int temp){
		// 確率初期化
		this.fish.put("マグロ", 100);
		this.fish.put("メダカ", 1);
		this.fish.put("タコ", 30);
		this.fish.put("長靴", -30);
		this.fish.put("はまち", 70);
		this.fish.put("ヒラメ", 50);
		this.fish.put("スカ", 0);
	}
	public Integer getPoint(String key){
		return this.fish.get(key);
	}


}
