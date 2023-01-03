package Aula.Executavel;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Trabalho em matriz");
		System.out.println("Informe a quantidade de linhas");
		int linhas = sc.nextInt();
		System.out.println("Informe a quantidade de colunas");
		int colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];

		System.out.println("Entre com a matriz:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
		int x = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					
						System.out.println("Left: " + mat[i][j-1]);
						System.out.println("Up: " + mat[i-1][j]);
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Down: " + mat[i+1][j]);
					
				}
			}
		}
	}
}
