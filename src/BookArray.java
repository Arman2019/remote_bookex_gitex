public class BookArray {

    Book[] bookArray = new Book[10];

    public void addBook(Book book){
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null){
                bookArray[i] = book;
                break;
            }
        }
    }

    public void printBook(){
        for (Book book:bookArray) {
            if (book != null){
                System.out.println(book);
            }

        }
    }

}
