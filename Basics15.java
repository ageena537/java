package ageena;


class Books5 {
    
    String title;
    String author;
    final int booksID;

    static int bookCount = 100;
    final static String LIBRARY_NAME = "CENTRAL LIBRARY";


    public Books5() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.booksID = bookCount++;
    }

 
    public Books5(String title, String author) {
        this.title = title;
        this.author = author;
        this.booksID = bookCount++;
    }

    public void displayInfo() {
        System.out.println("Book ID: " + booksID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public void displayInfo(boolean showLibrary) {
        displayInfo();
        if (showLibrary) {
            System.out.println("Library: " + LIBRARY_NAME);
        }
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books added: " + (bookCount - 100));
    }
}
public class Basics15 {
    public static void main(String[] args) {
       
        Books5 b1 = new Books5();
        Books5 b2 = new Books5("1984","George Orwell"); 
        Books5 b3 = new Books5("To Kill a Mockingbird", "Harper Lee");

        b1.displayInfo();
        System.out.println();
        b2.displayInfo(true);
        System.out.println();
        b3.displayInfo(true);
        System.out.println();

        Books5.displayTotalBooks();
    }
}

