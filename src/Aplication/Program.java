package Aplication;

import java.io.IOException;
import java.util.Scanner;

import entities.Field;
import entities.hashException;

public class Program {
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		boolean game = false;
		int turn = 1;
		char currentPlayer ;
		int[] play = new int[2];

		Field[][] board = new Field[3][3];
		ui.InitialSetup(board);
		ui.limpar();
		ui.printBoard(board);
		while (!game) {
			try {
			System.out.println(" ");
			
			System.out.println("");
			currentPlayer = ui.changeTurn(turn);
			System.out.print("type the position you want, rows and columns whithout espaces (lc): ");

			String position = sc.nextLine();
			System.out.println("");
			play[0] = Integer.parseInt(position.valueOf(position.charAt(0)));
			play[1] = Integer.parseInt(position.valueOf(position.charAt(1)));

			ui.setPiece(board[play[0]][play[1]], currentPlayer);
			ui.limpar();
			ui.printBoard(board);
			System.out.println(" ");
			game = ui.validVictory(board, currentPlayer);
			turn++;
			}
			catch (hashException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
