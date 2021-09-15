package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class FinalFrame implements Frame {
	private List<Ball> balls = new ArrayList<>();

	public FinalFrame(Ball ball) {
		balls.add(ball);
	}

	public FinalFrame(Ball ball, int i) {
	}

	@Override
	public boolean isComplete() {
		if(this.balls.size() == 3) {
			return true;
		}
		return this.balls.stream().reduce(Ball::add)
	}

	@Override
	public Frame makeNextFrame(Ball ball) {
	}
}
