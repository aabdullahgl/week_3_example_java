package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculater[] gameCalculaters = new GameCalculater[] { new ManGameCalculater(), new WomanGameCalculater(),
				new KidsGameCalculater(), new OlderGameCalculater() };
		for (GameCalculater calculater : gameCalculaters) {
			calculater.calculate();

		}

	}

}
