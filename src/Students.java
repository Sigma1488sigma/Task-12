public class Students {
    private int booksCount;
    private String name;
    private int groupNumber;
    private double averageGrade;
    Book [] books;

    public Students(String name, int groupNumber, double averageGrade){
        this.name = name;
        this.groupNumber = groupNumber;
        this.averageGrade = averageGrade;
        books = new Book[20];
        booksCount = 0;
    }

    public void addBook(Book book){
        this.books[this.booksCount] = book;
        this.booksCount++;
    }
    public void updateGrade(double newGrade) {
        this.averageGrade = newGrade;
    }
  public void printInfo(){
      System.out.println("Name: " + this.name);
      System.out.println("Group: " + this.groupNumber);
      System.out.println("AverageGrade: " + this.averageGrade);
      System.out.println("Books: ");

      for(int i = 0; i <= this.booksCount - 1; i++){
          System.out.println(books[i].author + ", " + books[i].title + ", " + books[i].price);
      }

      System.out.println("");
  }

}
