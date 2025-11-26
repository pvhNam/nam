package model;

public class player {

	public static final int EMPTY = 0;
	public static final int WHITE = 1;
	public static final int BLACK = 2;

// hàm đề biết đến lượt quân đen hay quân trắng đi
	public static int getOpponent(int player) {
		if (player == BLACK) {
			return WHITE;
		} else {
			return BLACK;
		}
	}
}