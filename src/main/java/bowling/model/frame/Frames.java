package bowling.model.frame;

import bowling.model.frame.dto.FramesDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Frames {
    private final List<Frame> frames;

    public Frames() {
        this.frames = new ArrayList<>();
        initFrames();
    }

    private void initFrames() {
        Frame frame = Frame.start();
        frames.add(frame);

        for (int i = 1; i < Frame.MAX_FRAME_INDEX; i++) {
            frame = frame.next();
            frames.add(frame);
        }
    }

    public void addResult(int count) {
        Frame frame = frames.get(getCurrentFrame().getIndex() - 1);
        frame.addResult(count);
    }

    public Frame getCurrentFrame() {
        return frames.stream()
                .filter(frame -> !frame.isEnded())
                .findFirst()
                .orElse(null);
    }

    public boolean isEnded() {
        return getCurrentFrame() == null;
    }

    public FramesDto getDto() {
        return new FramesDto(frames.stream()
                .map(Frame::getDto)
                .collect(Collectors.toList()));
    }
}