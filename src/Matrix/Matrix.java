package Matrix;

import java.util.Scanner;

public class Matrix {

    private final int rows;
    private final int columns;
    private double[][] matrix;


    public Matrix() {
        this.rows    = 10;
        this.columns = 10;
        this.matrix  = new double[rows][columns];
    }

    public Matrix(int rows, int columns){

        if(rows <= 0 || columns <= 0) {
           System.out.println("Заданы неверные размеры матрицы");
        }

        this.rows    = rows;
        this.columns = columns;
        this.matrix  = new double[rows][columns];
    }
    public Matrix(double[][] matrix) {
        this.rows    = matrix.length;
        this.columns = matrix[0].length;
        this.matrix  = matrix;
    }

    private int getSizeRows(double[][] matrix) {return matrix.length;}
    private int getSizeColumns(double[][] matrix) {return matrix[0].length;}
    private boolean comparison(Matrix matrix)
    {
        return this.rows == matrix.rows && this.columns == matrix.columns;
    }
    private int rnd(double max)
    {
        return (int) (Math.random() * max);
    }
    public void print()
    {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix sum(Matrix matrix) {
        Matrix temp = null;
        if (this.comparison(matrix)) {
            temp = new Matrix(this.rows, this.columns);
            for (int i = 0; i < temp.rows; i++) {
                for (int j = 0; j < temp.columns; j++) {
                    temp.matrix[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
                }
            }
        }
        return temp;
    }
    public Matrix subtraction(Matrix matrix)
    {
        Matrix temp = null;
        if (this.comparison(matrix)) {
            temp = new Matrix(this.rows, this.columns);
            for (int i = 0; i < temp.rows; i++) {
                for (int j = 0; j < temp.columns; j++) {
                    temp.matrix[i][j] = this.matrix[i][j] - matrix.matrix[i][j];
                }
            }
        }
        return temp;
    }

    public Matrix multiply(Matrix matrix) {

        Matrix temp = null;
        if (this.comparison(matrix)) {
            temp = new Matrix(this.rows, this.columns);
            for (int i = 0; i < temp.rows; i++) {
                for (int j = 0; j < temp.columns; j++) {
                    temp.matrix[i][j] = this.matrix[i][j] * matrix.matrix[i][j];
                }
            }
        }
        return temp;
    }
    public double arithmeticMean()
    {
        double temp = 0;
        int count = 0;

        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                temp += this.matrix[i][j];
                count++;
            }
        }
        return temp/count;
    }

    public void fillManually() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < this.rows; i++) {
            System.out.printf("Введите значение [строка: %d]",i);
            for(int j = 0; j < this.columns; j++) {
                System.out.printf("[колонка: %d]",j);

                this.matrix[i][j] = in.nextDouble();
            }
        }
    }
    public void automaticFilling(double max)
    {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = rnd(max);
            }
        }
    }
    public double minNamber()
    {
        var temp = this.matrix[0][0];

        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                if(this.matrix[i][j] < temp)
                    temp = this.matrix[i][j];
            }
        }
        return temp;
    }
    public double maxNamber()
    {
        var temp = this.matrix[0][0];

        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                if(this.matrix[i][j] > temp)
                    temp = this.matrix[i][j];
            }
        }
        return temp;
    }
}


