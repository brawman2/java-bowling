package bowling;

import bowling.domain.Frames;
import bowling.domain.PlayerName;
import bowling.helper.ValidInputHelper;
import bowling.view.ConsoleInputView;
import bowling.view.ConsoleResultView;

public class BowlingGame {
    private final ConsoleInputView consoleInputView;
    private final ConsoleResultView consoleResultView;

    public BowlingGame(ConsoleInputView consoleInputView, ConsoleResultView consoleResultView) {
        this.consoleInputView = consoleInputView;
        this.consoleResultView = consoleResultView;
    }

    public void run() {
        PlayerName playerName = ValidInputHelper.get(this::getPlayerName, consoleInputView::printError);
        Frames frames = Frames.init(playerName);

        while (!frames.isEnd()) {
            setKnockDownPins(frames);
            consoleResultView.print(frames);
        }
    }

    private PlayerName getPlayerName() {
        String inputPlayerName = ValidInputHelper.get(consoleInputView::getPlayerName, consoleInputView::printError);
        return PlayerName.valueOf(inputPlayerName);
    }

    private void setKnockDownPins(Frames frames) {
        try {
            int knockDownPins = consoleInputView.getKnockDownPins(frames.getCurrentFrameIndex());
            frames.setKnockDownPins(knockDownPins);
        } catch (RuntimeException e) {
            consoleInputView.printError(e);
            setKnockDownPins(frames);
        }
    }
}
