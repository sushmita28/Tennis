public class ScoreBoard {

	Player A = new Player();
	Player B = new Player();
	
	private final int GAME_MIN_SCORE = 4;
	private final int SET_MIN_SCORE = 6;
	private final int BEST_OF = 3;
	private int setNum = 0;

	public String convertToGame(int score1, int score2) {
		if(score1 == 0) {
			return "0";
		} else if(score1 == 1) {
			return "15";
		} else if(score1 == 2) {
			return "30";
		} else if(score1 == 3) {
			return "40";
		} else if(score1 == score2) {
			return "40";
		} else {
			return "AD";
		}
		
	}
	
	public static void main(String args[]) {

		ScoreBoard sc = new ScoreBoard();
		String test = args[0];
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == 'A') {
				sc.updateGameScore(sc.A, sc.B);
			} else {
				sc.updateGameScore(sc.B, sc.A);
			}
			sc.printScore();
			if(sc.setNum == sc.BEST_OF) {
				break;
			}	
		}
	}

	private void printScore() {
		// TODO Auto-generated method stub
		System.out.println("Player 1" + " " + A.getSetsWon() + " " + A.getSetScore() + " " + convertToGame(A.getGameScore(), B.getGameScore()));
		System.out.println("Player 2" + " " + B.getSetsWon() + " " + B.getSetScore() + " " + convertToGame(B.getGameScore(), A.getGameScore()));
		System.out.println();
		
		//System.out.println(A.getGameScore() + " " + B.getGameScore());
	}

	public void updateGameScore(Player winner, Player loser) {
		winner.incrementGameScore();
		
		
		if (isGameOver(winner.getGameScore(), loser.getGameScore(), GAME_MIN_SCORE)) {
			updateSetScore(winner, loser);
			winner.resetGameScore();
			loser.resetGameScore();
		}
		
		//System.out.println("Winner" + winner.getGameScore());
		//System.out.println("loser " + loser.getGameScore());
	}

	private boolean isGameOver(int score1, int score2, int min) {
		return (score1 >= min) && (score1 - score2) >= 2;
	}

	private void updateSetScore(Player winner, Player loser) {
		winner.incrementSetScore();
		if(isGameOver(winner.getSetScore(), loser.getSetScore(), SET_MIN_SCORE)) {
			setNum++;
			winner.incrementSetsWon();
			winner.resetSetScore();
			loser.resetSetScore();
		}
	}

}
