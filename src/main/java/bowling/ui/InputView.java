package bowling.ui;

import java.util.Scanner;

public class InputView {
	private final Scanner scanner;

	public InputView() {
		this.scanner = new Scanner(System.in);
	}

	public String inputPlayerName() {
		System.out.println("플레이어 이름은(3 english letters)?:");
		return this.scanner.nextLine();
	}
}
