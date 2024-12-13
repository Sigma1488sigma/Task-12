public class School {
    String students;
    String name;
    int numOfStudents;

    public School(String students, String name, int numOfStudents) {
        this.students = students;
        this.name = name;
        this.numOfStudents = numOfStudents;
    }

    public void displaySchoolInfo() {
        System.out.println("Вчитель: " + name);
        System.out.println("Учні: " + students);
        System.out.println("Кількість учнів: " + numOfStudents);
    }
}