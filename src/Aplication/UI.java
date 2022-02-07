package Aplication;

import entities.Field;

public class UI {

	public void printBoard(Field[][] x) {
		System.out.println("   0     1      2");
		System.out.println("");
		System.out.printf("0       %c | %c | %c %n", x[0][0].getField(), x[0][1].getField(), x[0][2].getField());
		System.out.println("      ------------");
		System.out.printf("1       %c | %c | %c %n", x[1][0].getField(), x[1][1].getField(), x[1][2].getField());
		System.out.println("      ------------");
		System.out.printf("2       %c | %c | %c %n", x[2][0].getField(), x[2][1].getField(), x[2][2].getField());

	}

	public void InitialSetup(Field[][] x) {
		for (int r = 0; r < 3; r++) {
			for (int h = 0; h < 3; h++) {
				x[r][h] = new Field();
			}
		}
	}

	public void setPiece(Field x, char currentPlayer) {
		x.setField(currentPlayer);
	}

	public boolean validVictory(Field[][] x, char currentPlayer) {
		for (int i = 0; i < 3; i++) {
			// verifica vitoria nas linhas

			if (x[i][0].getField() != 0 && x[i][0].getField() == x[i][1].getField()
					&& x[i][0].getField() == x[i][2].getField()) {
				System.out.println("Player winner! : " + currentPlayer);
				return true;
			}
			// verifica vitoria nas colunas
			if (x[0][i].getField() != 0 && x[0][i].getField() == x[1][i].getField()
					&& x[0][i].getField() == x[2][i].getField()) {
				System.out.println("Player winner! : " + currentPlayer);
				return true;
			}
		}
		// verifica vitoria na coluna principal
		if (x[0][0].getField() != 0 && x[0][0].getField() == x[1][1].getField()
				&& x[0][0].getField() == x[2][2].getField()) {
			System.out.println("Player winner! : " + currentPlayer);
			return true;
		}
		// verifica vitoria na coluna secundario
		if (x[2][0].getField() != 0 && x[2][0].getField() == x[1][1].getField()
				&& x[2][0].getField() == x[0][2].getField()) {
			System.out.println("Player winner! : " + currentPlayer);
			return true;
		}
		return false;
	}

	public char changeTurn(int x) {
		if (x % 2 != 0) {
			System.out.println("Turn: X");
			return 'X';
		} else {
			System.out.println("Turn: O");
			return 'O';
		}
	}
	public static void limpar() {  
	for(int i=0;i<150;i++) {
		System.out.println();
	}
	}  

}
