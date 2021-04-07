/********************************************************************************************
 * Brianna Patrick
 * Lab11
 * This program models a Bookshelf containing books
 * 04/07/21
 * 255 003
 *******************************************************************************************/
package Labs.Lab11;

import java.util.ArrayList;

public class Bookshelf {
    /** The size of the bookshelf */
    private int size;

    /** ArrayList named books contains the Book objects on the bookshelf */
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * default constructor for Bookshelf that calls the parameterized constructor
     */
    public Bookshelf() {
        this(2);
        books = new ArrayList<Book>();
    }

    /**
     * Constructs a bookshelf with specified size and initializes the array list of books
     */
    public Bookshelf(int size) {
        this.size = size;
        books = new ArrayList<Book>();
    }

    /**
     *This getter method returns the size of the bookshelf
     */
    public int getSize() {
        return size;
    }

    /**
     *This getter method returns the array list of books in bookshelf
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     *method addBook adds a book to the books array list if there is room on the bookshelf
     */
    public void addBook(Book book) {
        if (books.size() == size) {

        }
        else
            books.add(book);
    }

    /**
     *method removeBook removes the first book on bookshelf and returns the book that was removed
     */
    public Book removeBook() {
        if (books.size() > 0) {
            Book b = books.get(0);
            books.remove(0);
            return b;
        }
        else if (books.size() == 0) {
            return null;
        }
        return null;
    }

    /**
     *method emptyBookshelf removes all the books from the bookshelf
     */
    public void emptyBookshelf() {
        books.clear();
    }
}
