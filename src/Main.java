public class Main {
    public static void main(String[] args) {

        BookArray bookArray = new BookArray();
        Fiction fiction = new Fiction("World war 2");
        NonFiction nonFiction = new NonFiction("World war 1");

        bookArray.addBook(fiction);
        bookArray.addBook(nonFiction);

        bookArray.printBook();
    }
}