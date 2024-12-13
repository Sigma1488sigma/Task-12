public class Book {
    String title;
    String author;
    public float price;

    public Book(String title, String author, float price ){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void applyDiscount(int discount){
        this.price = price - (price/100*discount);
    }

    public void classInfo(){
        System.out.println("Автор: " + this.author);
        System.out.println("Назва: " + this.title);
        System.out.println("Ціна: " + this.price);
    }
}
