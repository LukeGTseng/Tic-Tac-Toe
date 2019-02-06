import java.util.*;

public class Main {
	public static void main(String[] args) {
		int turn = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Board Size: ");
		int size = s.nextInt(); //get size of board
		String[][] board = new String[size][size];
		for(int i = 0;i<size;i++) { //setup for blank board
			for(int j = 0;j<size;j++) {
				board[i][j] = " ";
			}
		}
		createBoard(board);
		while(checkWin(board) != true || checkTie(board) != true) { //continues running if the game isn't over
		String str = "";
			if(turn%2 == 1) {
				System.out.println("Player 1, your move: (e.g. 1,3)");
				str = "X";
			} else {
				System.out.println("Player 2, your move: (e.g. 1,3)");
				str = "O";
			}
		}
		
		turn++; //change turn
	}

	public static void createBoard(String[][] board) {
		int size = board.length;
		for (int i = 0; i < size; i++) {
			for(int a=0;a<size;a++) {
				System.out.print("+-");
			}
			System.out.println("+");
			for (int j = 0; j < size; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|");
		}
		for(int a=0;a<size;a++) {
			System.out.print("+-");
		}
		System.out.println("+");
	}
	//btw im going to start doing the custom board size since it'll be to much work to do if I dont start on it
	//so youll have to do the checkWin and checkTie depending on board size
	public static boolean checkWin(String[][] board) { 
		int size = board.length;
	}

	public static boolean checkTie(String[][] board) {
		int size = board.length;
	}

	public static boolean placementErrorCheck(String[][] board) {
		int size = board.length;
	}
}
