import java.util.Arrays;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

// Створити клас із виконавчим методом, в якому створити масив з об’єктів класу студент
// який складається з мінімум 5 полів;
// Відсортувати масив, за одним з полів, за зростанням,
// а за іншим, за спаданням використавши при цьому стандартні засоби сортування.
// Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
// Код повинен відповідати стандартам JCC та бути детально задокументований.
public class Lab4 {
    public static void main(String[] args) {
        var student1 = new Student("Stella", "Jones", "New York",
                "MIT", 2, 15);
        var student2 = new Student("Jake", "Red", "London", "Oxford",
                3, 13);
        var student3 = new Student("Ostap", "Nalyvaiko", "Lviv",
                "UKU", 4, 22);
        var student4 = new Student("Svitlana", "Gavryna", "Kyiv",
                "KPI", 3, 10);
        var student5 = new Student("Svitlana", "Gavryna", "Kyiv",
                "KPI", 7, 10);

        var arrayOfStudents = new Student[]{student1, student2, student3, student4, student5};
        Arrays.stream(arrayOfStudents).forEach(System.out::println);
        System.out.println("---------------------------");
        Arrays.stream(sortByFields(arrayOfStudents)).forEach(System.out::println);
    }


    /**
     * @param arrayOfStudents Array of students to sort
     * @return Sorted array of students by name in ascending direction
     * and then by course in descending direction
     */
    public static Student[] sortByFields(Student[] arrayOfStudents) {
        return Arrays.stream(arrayOfStudents)
                .sorted(comparing(Student::getName).thenComparing(comparingInt(Student::getCourse).reversed()))
                .toArray(Student[]::new);
    }
}
