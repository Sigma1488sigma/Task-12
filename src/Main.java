import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Кобзар", "Т.Г. Шевченко", 250);
        book1.classInfo();

        Book book2 = new Book("Кладовище домашніх тварин", "С. Кінг", 200);
        book2.classInfo();
        book2.applyDiscount(20);
        System.out.println("Ціна зі знижкою: " + book2.price);

        Book book3 = new Book("Гаррі Поттер", "Дж.Роулінг", 500);

        School school1 = new School("Аня, Вася, Коля", "Містер Бургер", 20);
        school1.displaySchoolInfo();

       /** ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(-18);
        numbers.add(24);
        numbers.add(39);

        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println("Максимальне значення: " + max);*/

        Circle circle = new Circle(5);
        System.out.println("Радіус кола: " + circle.getRadius());
        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Довжина кола: " + circle.calculateCircumference());

        Students student1 = new Students("Оля", 2, 7.77);
        Students student2 = new Students("Артем", 2, 11.99);
        Students student3 = new Students("Коля", 2, 12);

        student1.addBook(book1);
        student1.addBook(book3);
        student2.addBook(book3);
        student3.addBook(book2);

        student3.updateGrade(12.01);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();

     /**   Car car1 = new Car("Toyota", "Corolla", 2020, "Червоний", 15000, 18000, "Бензин");
        Car car2 = new Car("BMW", "X5", 2023, "Чорний", 5000, 50000, "Дизель");

        System.out.println(car1.carInfo());
        System.out.println(car2.carInfo());

        car1.drive(100);
        car2.applyDiscount(10);

        System.out.println(car1.carInfo());
        System.out.println(car2.carInfo());*/

                Library library = new Library();
                library.addBook(new Book("Цитати Мао Цзедун", "Мао Цзедун", 1949));
                library.addBook(new Book("Володар кілець", "Дж. Р. Р. Толкін", 1932));
                library.addBook(new Book("Гаррі Поттер і таємна кімната", "ДЖ. Роулінг", 1937));

                System.out.println("Books by George Orwell:");
                library.searchByAuthor("George Orwell").forEach(b -> System.out.println(b.title));

                System.out.println("Books in library: " + library.countBooks());

                library.removeBookByTitle("2023");
                System.out.println("Books after removal: " + library.countBooks());

                library.printAllBooks();

    }
}

