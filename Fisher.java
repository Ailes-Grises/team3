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
	private ArrayList<String> fished_list;
	private int sum;

	public Fisher(){
	}
	public Fisher(String name){
		this.name = name;
	}

	public void calc_sum(Spot spot){
		this.sum += spot.getPoint("マグロ");
	}

}
