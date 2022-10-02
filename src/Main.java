import Matrix.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var menu = 0;

        int row, col;
        System.out.print("\nВведите кол-во строк в матрице:");
        row = in.nextInt();
        System.out.print("\nВведите кол-во колонок в матрице:");
        col = in.nextInt();
        Matrix matrix1 = new Matrix(row, col);
        matrix1.fillManually();

        Matrix matrix2 = new Matrix(row,col);
        matrix2.automaticFilling(100);

        System.out.println("Matrix1:");
        matrix1.print();
        System.out.println("\nMatrix2:");
        matrix2.print();
        System.out.println("""
                Выбирете действие:
                сложение - 1
                вычетание - 2
                умножение - 3
                max число - 4
                min число - 5
                среднеарифметическое - 6""");
        menu = in.nextInt();

        if(menu == 1){
            Matrix res = new Matrix(row,col);
            res = matrix1.sum(matrix2);
            System.out.println("Result:");
            res.print();
        }
        else if (menu == 2) {
            Matrix res = new Matrix(row,col);
            res = matrix1.subtraction(matrix2);
            System.out.println("Result:");
            res.print();
        }
        else if(menu == 3) {
            Matrix res = new Matrix(row,col);
            res = matrix1.multiply(matrix2);
            System.out.println("Result:");
            res.print();
        }
        else if(menu == 4) {
            System.out.println("Matrix1:");
            matrix1.print();
            System.out.println(matrix1.maxNamber());
        }
        else if(menu == 5) {
            System.out.println("Matrix1:");
            matrix1.print();
            System.out.println(matrix1.minNamber());
        }
        else if(menu == 6) {
            System.out.println("Matrix1:");
            matrix1.print();
            System.out.println(matrix1.arithmeticMean());
        }

    }
}