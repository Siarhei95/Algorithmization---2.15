package Question_15;

import java.util.Scanner;
import java.util.Random;

public class question_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of lines: ");
        int lines = scanner.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = scanner.nextInt();
        int a[][] = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int max = 0;
        for(int i=0; i<lines; i++){
            for(int j=0; j<columns; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Modified matrix: ");
        for(int i=0; i<lines; i++){
            for(int j=0; j<columns; j++){
                if(a[i][j]%2!=0) {
                    a[i][j] = max;
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
