package homeWorkMas3;

import java.util.Scanner;

public class hwmass3 {

	public static void main(String[] args) {
		int n = 5;
		int z = 0;
		int x = 0;
		int i = 0;
		int j = 0;
		int p=0;
		int k =0;
		int[][] mass = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number in degree, to rotate: ");
		p=input.nextInt();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n; j++)
				System.out.print(mass[i][j] + " ");
			System.out.println();
		}
		for (k = 0; k<(p/90); k++) {
			for (i = 0; i <= 2; i++) {
				for (j = 0; j <= 2; j++) {
					z = mass[i][j];
					mass[i][j] = mass[n - j][i];
					x = mass[j][n - i];
					mass[j][n - i] = z;
					z = mass[n - i][n - j];
					mass[n - i][n - j] = x;
					mass[n - j][i] = z;
				}
			}
		}
		System.out.println();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n; j++)
				System.out.print(mass[i][j] + " ");
			System.out.println();
		}
		input.close();
	}
}
