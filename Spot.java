package tsuri_pkg;
import java.util.ArrayList;
import java.util.HashMap;

public class Spot {

	private HashMap<String, Integer> fish_hash = new HashMap<String, Integer>();
	private ArrayList<String> fish_list = new ArrayList<String>();

	public Spot(){
		// for fish_hash
		this.fish_hash.put("マグロ", 100);
		this.fish_hash.put("メダカ", 1);
		this.fish_hash.put("タコ", 30);
		this.fish_hash.put("長靴", -30);
		this.fish_hash.put("はまち", 70);
		this.fish_hash.put("ヒラメ", 50);
		this.fish_hash.put("スカ", 0);

		// for fish_list
		this.fish_list.add("マグロ");
		this.fish_list.add("メダカ");
		this.fish_list.add("タコ");
		this.fish_list.add("長靴");
		this.fish_list.add("はまち");
		this.fish_list.add("ヒラメ");
		this.fish_list.add("スカ");

	}
	public Spot(int temp){
		this.fish_hash.put("マグロ", 100);
		this.fish_hash.put("メダカ", 1);
		this.fish_hash.put("タコ", 30);
		this.fish_hash.put("長靴", -30);
		this.fish_hash.put("はまち", 70);
		this.fish_hash.put("ヒラメ", 50);
		this.fish_hash.put("スカ", 0);

		// for fish_list
		this.fish_list.add("マグロ");
		this.fish_list.add("メダカ");
		this.fish_list.add("タコ");
		this.fish_list.add("長靴");
		this.fish_list.add("はまち");
		this.fish_list.add("ヒラメ");
		this.fish_list.add("スカ");
	}

	public Integer getPoint(String key){
		return this.fish_hash.get(key);
	}

	public void fish_list_update(String fish){
		this.fish_list.remove(this.fish_list.indexOf(fish));
	}
	public int getFish_list_size(){
		return this.fish_list.size();
	}
	public String getFish_list_name(int seq){
		return this.fish_list.get(seq);
	}
}
