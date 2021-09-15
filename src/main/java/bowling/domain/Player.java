package bowling.domain;

import java.util.regex.Pattern;

public class Player {
	private final String name;

	public Player(String name) {
		if(name.length() != 3) {
			throw new IllegalArgumentException("이름이 3자가 아닙니다.");
		}

		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		if(!pattern.matcher(name).find()){
			throw new IllegalArgumentException("알파벳이 아닙니다.");
		}

		this.name = name;
	}
}
