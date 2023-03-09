public abstract class Book {

    String bookTitle;
    double bookPrice;

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setBookPrice(double bookPrice);

    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
