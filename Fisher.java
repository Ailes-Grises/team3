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
		int rand = (int)(Math.random()*spot.getFish_list_size());
		this.calc_sum(spot, spot.getFish_list_name(rand));
		this.fished_list.add(spot.getFish_list_name(rand));
		spot.fish_list_update(spot.getFish_list_name(rand));
		this.toString();
	}

	public String toString(){
		String msg = "<これまでに釣れた魚>\n";
		for(int i = 0; i < this.fished_list.size(); i++){
			 msg += this.fished_list.get(i) + "\n";
		}
		msg += "ポイント : " + (int)this.sum + "\n============";
		return msg;
	}

}
