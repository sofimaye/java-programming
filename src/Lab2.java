// 11
//Створити клас, який складається з виконавчого методу,
// що виконує дію з матрицями (тип зазначений).Вивести на екран результати
// першої та другої дій
// 1. С=Bт
// 2. Обчислити суму найменших елементів кожного стовпця матриці

public class Lab2 {
    public static void main(String[] args) {
        long[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        var C = transpose(B);
        System.out.println("Original matrix:\n" + matrixToString(B));
        System.out.println("Transposed matrix: \n" + matrixToString(C));
        System.out.println("Sum of smallest nums in cols: \n" + sumOfSmallestColNums(C));
    }
    public static long[][] transpose(long[][] B) {
        var C = new long[B[0].length][B.length];
        for(int row = 0; row < B[0].length; row++){
           for(int col = 0; col < B.length; col++){
               C[row][col] = B[col][row];
           }
        }
        return C;
    }
    public static long sumOfSmallestColNums(long[][] C){
        var sumOfSmallest = 0;
        for (int row = 0; row < C[0].length; row++) {
            var smallest = C[0][row];
            for (long[] longs : C) {
                if (smallest > longs[row]) {
                    smallest = longs[row];
                }
            }
            sumOfSmallest += smallest;
        }
        return sumOfSmallest;
    }
    public static String matrixToString(long[][] matrix) {
        StringBuilder out = new StringBuilder();
        for (long[] longs : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                out.append(longs[j]);
                out.append(" ");
            }
            out.append("\n");
        }
        return out.toString();
    }
}
