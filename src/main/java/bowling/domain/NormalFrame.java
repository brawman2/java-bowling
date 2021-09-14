package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class NormalFrame implements Frame {
	private final int round;
	private List<Ball> balls = new ArrayList<>();

	public NormalFrame(Ball ball, int round) {
		this.balls.add(ball);
		this.round = round;
	}

	public NormalFrame(List<Ball> balls, int round) {
		this.balls = balls;
		this.round = round;
	}

	public boolean isComplete() {
		return this.balls.size() == 2 || this.balls.stream().filter(ball -> ball.equals(new Ball(10))).findFirst().isPresent();
	}

	@Override
	public Frame makeNextFrame(Ball ball) {
		if(isComplete()) {
			if(this.round == 10)
			return new NormalFrame(ball, this.round + 1);
		}
		this.balls.add(ball);
		return new NormalFrame(this.balls, this.round);
	}
}
