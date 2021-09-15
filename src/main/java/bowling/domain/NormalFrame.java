package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class NormalFrame implements Frame {
	private final int round;
	private Pins pins;
	private Balls balls;

	public NormalFrame(int round) {
		this.round = round;
		this.pins = new Pins();
	}

	public boolean isComplete() {
		return this.balls.isFull() || pins.isEmpty();
	}

	public void play(Ball ball) {
		this.pins = pins.hit(ball);
		this.balls = balls.add(ball);
	}

	@Override
	public Frame makeNextFrame() {
		if(isComplete()) {
			
		}
	}
}
