package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		d1 = new Die();
		d2 = new Die();
		// TODO: Determine 'Score'
		Score = d1.getDieValue() + d2.getDieValue();
	}

	public int getScore() {
		return Score;
	}

}
