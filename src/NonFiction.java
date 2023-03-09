public class NonFiction extends Book{

    public NonFiction(String bookTitle) {
        super(bookTitle);
        setBookPrice(37.99);
    }

    @Override
    public void setBookPrice(double bookPrice) {
        super.bookPrice = bookPrice;
    }
}
