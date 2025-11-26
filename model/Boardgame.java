package model;

public class Boardgame {
	private int[][] board;
	public static final int SIZE = 8;
	public Boardgame() {
		board = new int[SIZE][SIZE];
		reset();
		
	}
	// xoa bang 
	public void reset() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = player.EMPTY;
			}
		}
		// tao bang o vij tri co dinh cac quan co 
		
		board[3][3] = player.WHITE;
		board[3][4] = player.BLACK;
		board[4][4]= player.WHITE;
		board[4][3]=player.BLACK;
		
	}
	// lấy thông tin từ bàn cờ
	 public int getprice(int d, int c) {
		 if(d >= 0 && d< SIZE && c >= 0 && c < SIZE) {
			return  board[d][c];
		 }
		 
		 return -1;
	 }
	 // đặt quân cờ vào bàn cờ
	 public void  setprice(int d, int c, int price) {
		 if(d >= 0 && d< SIZE && c >= 0 && c < SIZE) {
				 board[d][c] = price;
		 }
		 
	 }
	 // tạo 1 bảng ảo để cho máy dùng
	 public int[][] getboardArray(){
		 return board;
	 }
	
}
