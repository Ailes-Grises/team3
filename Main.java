package tsuri_pkg;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Spot [] spot = new Spot()[5];
		Spot spot = new Spot();
		Fisher fisher = new Fisher("池田さん");

		System.out.println("どこで釣りますか? > ");
		Scanner scan = new Scanner(System.in);
		String select = scan.nextLine();

		for(int i=0; i < 3; i++){
			fisher.fishing(spot);
			System.out.println(fisher.toString());
		}
		scan.close();


	}

}
