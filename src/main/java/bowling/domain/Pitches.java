package bowling.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Pitches {
    private final List<Pitch> pitches;

    public Pitches() {
        this.pitches = new ArrayList<>();
    }

    public Pitches pitch(int point) {
        Pitch lastPitch = lastPitch();
        pitches.add(lastPitch.pitch(point));
        
        return this;
    }

    public boolean isLastPitch(int frameSize) {
        return pitches.size() == frameSize;
    }

    public void forEach(Consumer<? super Pitch> action) {
        pitches.forEach(action);
    }

    public boolean isEnd() {
        return lastPitch().isEnd();
    }

    public boolean hasBonusPitch() {
        return lastPitch().hasBonusPitch();
    }

    public int sum() {
        return pitches.stream()
                .mapToInt(Pitch::intValue)
                .sum();
    }

    private Pitch lastPitch() {
        if (pitches.isEmpty()) {
            return new Pitch(0);
        }

        return pitches.get(pitches.size() - 1);
    }
}