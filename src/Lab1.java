//11
//Завдання: Створити клас, який складається з виконавчого методу,
// що виконує обчислення значення функції.
// Результатом виконання дії є єдине значення дійсного типу.
public class Lab1 {
    public static void main(String[] args){
        System.out.println(calc((char) 2, (char) 2, (char) 6, (char) 5));
    }
    static double calc(char a, char b, char n, char m) {
        double sum = 0;
        for (double i = a; i <= n; i++) {
            if (i == 2) continue;
            for (double j = b; j <= m; j++) {
                sum += ((i / j) / (i - 2));
            }
        }
        return sum;
    }
}

