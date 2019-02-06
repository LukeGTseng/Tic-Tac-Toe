import java.util.*;

public class Main {
	public static void main(String[] args) {
		boolean legalMove = false;
		int turn = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Board Size: ");
		int size = s.nextInt(); // get size of board
		String[][] board = new String[size][size];
		for (int i = 0; i < size; i++) { // setup for blank board
			for (int j = 0; j < size; j++) {
				board[i][j] = " ";
			}
		}
		while (checkWin(board) != true || checkTie(board) != true) { // continues running if the game isn't over
			String str = "";
			createBoard(board);
			legalMove = false;
			if (turn % 2 == 1) {
				System.out.println("Player 1, your move: (e.g. 1,3)");
				str = "X";
			} else if (turn % 2 == 0){
				System.out.println("Player 2, your move: (e.g. 1,3)");
				str = "O";
			}
			Scanner move = new Scanner(System.in);
			while (legalMove == false) {
				String input = move.next();
				int x = (Integer.parseInt(input.substring(0, input.indexOf(",")))) - 1;
				int y = (Integer.parseInt(input.substring(input.indexOf(",") +1, input.length()))) - 1;
				if (placementErrorCheck(board, x, y) == true) {
					board[x][y] = str;
					legalMove = true;
				} else {
					System.out.println("That spot is invalid. Try again.");
				}
			}
			turn++;
		}

		turn++; // change turn
	}

	public static void createBoard(String[][] board) {
		int size = board.length;
		for (int i = 0; i < size; i++) {
			for (int a = 0; a < size; a++) {
				System.out.print("+-");
			}
			System.out.println("+");
			for (int j = 0; j < size; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|");
		}
		for (int a = 0; a < size; a++) {
			System.out.print("+-");
		}
		System.out.println("+");
	}

	// btw I'm going to start doing the custom board size since it'll be to much
	// work to do if I don't start on it
	// so you'll have to do the checkWin and checkTie depending on board size
	public static boolean checkWin(String[][] board) {
		int size = board.length;
		return false;
	}

	public static boolean checkTie(String[][] board) {
		int size = board.length;
		return false;
	}

	public static boolean placementErrorCheck(String[][] board, int x, int y) {
		int size = board.length;
		if (x >= size || y >= size) {
			return false;
		}
		if (!board[x][y].equals(" ")) {
			return false;
		} else {
			return true;
		}
	}
}
