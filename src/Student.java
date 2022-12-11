import java.util.Objects;

// створений клас Student для 4 лаби з полями та гетерами та сетерами для того, щоб дістати чи змінити значення полів
public class Student {
    private String name;
    private String surname;
    private String cityFrom;
    private String university;
    private int course;
    private int subjectsQuantity;

    public Student(String name, String surname, String cityFrom, String university, int course, int subjectsQuantity) {
        this.name = name;
        this.surname = surname;
        this.cityFrom = cityFrom;
        this.university = university;
        this.course = course;
        this.subjectsQuantity = subjectsQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSubjectsQuantity() {
        return subjectsQuantity;
    }

    public void setSubjectsQuantity(int subjectsQuantity) {
        this.subjectsQuantity = subjectsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && subjectsQuantity == student.subjectsQuantity && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(cityFrom, student.cityFrom) && Objects.equals(university, student.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, cityFrom, university, course, subjectsQuantity);
    }

    //    для відображення екземпляру класу в форматі string
    @Override
    public String toString() {
        return "Student{name='%s', surname='%s', cityFrom='%s', university='%s', course=%d, subjectsQuantity=%d}"
                .formatted(name, surname, cityFrom, university, course, subjectsQuantity);
    }
}

