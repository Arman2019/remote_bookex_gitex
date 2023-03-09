public class Fiction extends Book{

    public Fiction(String bookTitle) {
        super(bookTitle);
        setBookPrice(24.99);
    }

    @Override
    public void setBookPrice(double bookPrice) {
        super.bookPrice = bookPrice;
    }
}
