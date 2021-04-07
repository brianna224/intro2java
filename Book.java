/********************************************************************************************
 * Brianna Patrick
 * Lab11
 * This program models a Book containing a title and author
 * 04/07/21
 * 255 003
 *******************************************************************************************/
package Labs.Lab11;

public class Book {
    /** The title of the book */
    private String title;

    /** The author of the book */
    private String author;

    /**
     * default constructor for Book that calls the parameterized constructor
     */
    public Book() {
        this("Test", null);
    }

    /**
     * Constructs a book with specified title and author
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     *This getter method returns the string value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     *This setter method sets the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *This getter method returns the string value of author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *This setter method sets the author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *This method returns a string description of the book
     */
    public String toString() {
        return "\"" + title + "\"" + " by " + author;
    }
}
