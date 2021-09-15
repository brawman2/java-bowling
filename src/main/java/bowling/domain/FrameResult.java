package bowling.domain;

public enum FrameResult {
	STRIKE("X") {
		@Override
		public boolean isMatch(int tryCount, int hitCount) {
			return true;
		}
	},
	SPARE("/") {
		@Override
		protected boolean isMatch(int tryCount, int hitCount) {
			return false;
		}
	},
	GUTTER("-") {
		@Override
		protected boolean isMatch(int tryCount, int hitCount) {
			return false;
		}
	};

	FrameResult(String icon) {
	}

	protected abstract boolean isMatch(int tryCount, int hitCount);
}
