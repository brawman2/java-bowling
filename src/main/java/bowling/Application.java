package bowling;

import bowling.domain.BowlingGame;
import bowling.ui.InputView;
import bowling.ui.ResultView;

public class Application {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		ResultView resultView = new ResultView();
		BowlingGame game = new BowlingGame(inputView.inputPlayerName());
		while(game.isEnd()) {
			game.play();
			resultView.drawResult("aaa");
		}
	}

}
