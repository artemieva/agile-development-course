package ru.unn.agile.determinant;


public class Matrix {
    private int n;
    private double[] data;
    public static double EPS = 1e-6;

    public Matrix(int n)
    {
        if (n <= 0)
            throw new IllegalArgumentException("Wrong matrix size");
        this.n = n;
        data = new double[n * n];
        for (int i = 0; i < n * n; i++)
            data[i] = 0.0;
    }

    public double getItem(int i, int j)
    {
        if (i < 0 || i >= n || j < 0 || j > n)
            throw new IndexOutOfBoundsException("Item out of bounds");
         return data[i * n + j];
    }

    public  void setItem(int i, int j, double val)
    {
        if (i < 0 || i >= n || j < 0 || j > n)
            throw new IndexOutOfBoundsException("Item out of bounds");
        data[i * n + j] = val;
    }

    public double getNorm()
    {
        double norm = 0;
        for (int i = 0; i < n * n; i++)
            norm += data[i] * data[i];
        return Math.sqrt(norm);
    }
}
