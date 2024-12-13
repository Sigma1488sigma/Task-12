import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.author.equalsIgnoreCase(author)) result.add(b);
        }
        return result;
    }

    public int countBooks() {
        return books.size();
    }

    public void removeBookByTitle(String title) {
        books.removeIf(b -> b.title.equalsIgnoreCase(title));
    }

    public void printAllBooks() {
        if (books.isEmpty()) System.out.println("Бібліотека порожня.");
        else books.forEach(b -> System.out.println(b.title + " - " + b.author));
    }
}
