package tsuri_pkg;
import java.util.*;

public class Fisher {
	/*
	 * 釣った魚リスト
	 *
	 * func 合計ポイント
	 * func 釣り(スポット)
	 *
	 */

	private String name;
	private int sum;
	private ArrayList<String> fished_list;

	public Fisher(){
		this.name = null;
		this.sum = 0;
	}
	public Fisher(String name){
		this.name = name;
		this.sum = 0;
	}

	public void calc_sum(Spot spot, String fish_name){
		this.sum += spot.getPoint(fish_name);
	}
	public void fishing(Spot spot){
		int rand = (int)Math.random()*7;
		String [] fish = {"マグロ", "メダカ", "タコ", "長靴", "はまち", "ヒラメ", "スカ"};
		// this.calc_sum(spot, fish[(int)Math.random()*7]);
		// System.out.println(rand + "\n");
		this.calc_sum(spot, fish[rand]);
		this.toString();
	}
	public String toString(){
		return "ポイント : " + (int)this.sum;
	}

}
