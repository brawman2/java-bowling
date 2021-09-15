package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	private final Player player;
	private List<Frame> frames = new ArrayList<>();

	public BowlingGame(String name) {
		this.player = new Player(name);
	}

	public boolean isEnd() {
		return this.frames.size() == 10 && this.frames.get(this.frames.size() - 1).isComplete();
	}

	public void play(int number) {
		if(frames.isEmpty()) {
			NormalFrame frame = new NormalFrame(1);
			frame.play(new Ball(number));
			frames.add(frame);
			return;
		}
		Frame current = this.frames.get(this.frames.size() - 1);
		if(current.isComplete()) {
			Frame newFrame = frame.makeNextFrame();
			newFrame.play(new Ball(number));
			frames.add(frame);
			return;
		}
		newFrame.play(new Ball(number));
	}
}
