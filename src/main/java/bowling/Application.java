package bowling;

import bowling.ui.InputView;
import bowling.ui.ResultView;

public class Application {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		ResultView resultView = new ResultView();
		inputView.inputPlayerName();
		resultView.drawResult("aaa");
	}

}
