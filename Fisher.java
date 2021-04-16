package tsuri_pkg;
import java.util.*;

public class Fisher {

	private String name;
	private int sum;
	private ArrayList<String> fished_list = new ArrayList<String>();

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
		// 旧バージョンの書き方(廃止)
		// int rand = (int)(Math.random()*7);
		// String [] fish = {"マグロ", "メダカ", "タコ", "長靴", "はまち", "ヒラメ", "スカ"};
		// this.calc_sum(spot, fish[(int)(Math.random()*7)]);
		// this.calc_sum(spot, fish[rand]);
		// this.fished_list.add(fish[rand]);
		// this.toString();

		int rand = (int)(Math.random()*spot.getFish_list_size());
		this.calc_sum(spot, spot.getFish_list_name(rand));
		this.fished_list.add(spot.getFish_list_name(rand));
		this.toString();
	}

	public String toString(){
		String msg = "<これまでに釣れた魚>\n";
		for(int i = 0; i < this.fished_list.size(); i++){
			 msg += this.fished_list.get(i) + "\n";
		}
		msg += "ポイント : " + (int)this.sum;
		return msg;
	}

}
