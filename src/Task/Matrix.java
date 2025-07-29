package Task;


import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        Scanner s = new Scanner(System.in);
//normal matrix input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        //y transposee matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[j][i] = matrix1[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix2[i][j]);//print m dikkat aayi

            }
            System.out.println();
        }
    }
}