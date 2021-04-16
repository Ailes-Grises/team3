package tsuri_pkg;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Spot [] spot = new Spot[5];
		for(int i=0; i < 5; i++) spot[i] = new Spot();
		// Spot spot = new Spot();
		Fisher fisher = new Fisher("池田さん");

		System.out.println("どこで釣りますか? > ");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();

		for(int i=0; i < 3; i++){
			fisher.fishing(spot[select]);
			System.out.println(fisher.toString());
		}
		scan.close();


	}

}
