/********************************************************************************************
 * Brianna Patrick
 * Lab11
 * This program will test the Book and Bookshelf classes
 * 04/07/21
 * 255 003
 *******************************************************************************************/
package Labs.Lab11;

import java.util.ArrayList;

public class Lab11 {
    public static void main(String[] args) {
        /** create first Book object */
        Book myBook1 = new Book("Film for Her", "Orion Carloto");

        /** create second Book object */
        Book myBook2 = new Book("home body", "rupi kaur");

        /** create third Book object */
        Book myBook3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        /** print data from each Book object */
        System.out.println(myBook1);
        System.out.println(myBook2);
        System.out.println(myBook3);

        /** create Bookshelf object that contains the three book objects */
        Bookshelf b1 = new Bookshelf(3);
        b1.addBook(myBook1);
        b1.addBook(myBook2);
        b1.addBook(myBook3);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(myBook1);
        books.add(myBook2);
        books.add(myBook3);

        /** display contents of bookshelf */
        for (Book b:books) {
            System.out.println(b);
        }

        /** empty bookshelf */
        books.clear();

        /** display contents of bookshelf again */
        for (Book b:books) {
            System.out.println(b);
        }
    }
}
