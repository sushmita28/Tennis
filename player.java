public class Player {
	private int gameScore = 0;
	private int setScores = 0;
	private int setsWon = 0;

	public void incrementGameScore() {
		++gameScore;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void resetGameScore() {
		gameScore = 0;
	}

	public void incrementSetScore() {
		++setScores;
	}

	public int getSetScore() {
		return setScores;
	}
	
	public void resetSetScore() {
		setScores = 0;
	}
	
	public void incrementSetsWon() {
		setsWon++;
	}
	
	public int getSetsWon() {
		return setsWon;
	}

}
