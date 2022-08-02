package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
    public static class Book{
        private String author;
        private String title;
        private String year;

        public Book(String author, String title, String year){
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String toString(){
            return author + ", " + title + ", " + year;
        }

    }

    public static void BookLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        final String done = "DONE";
        final String show = "SHOW";
        final String add = "ADD";
        final String yes = "YES";
        final String no = "NO";
        books.add(new Book("James", "Peach Giant", "1999"));
        Scanner s = new Scanner(System.in);
        String key;

        do {
            System.out.println("What would you like to do?");
            System.out.println("To show your books type SHOW");
            System.out.println("To add a new book type ADD");
            System.out.println("When you are done type DONE");
            key = s.nextLine().toUpperCase();

            if(key.equalsIgnoreCase(show)){
                for (Book book: books){
                    System.out.println(book);
                }
            } else if (key.equalsIgnoreCase(add)) {
                do{
                    System.out.println("Who is the author?");
                    String author = s.nextLine();
                    System.out.println("What is the title?");
                    String title = s.nextLine();
                    System.out.println("When was it published?");
                    String year = s.nextLine();

                    System.out.println("Do you want to add a new book?");
                    key = s.nextLine().toUpperCase();
                    books.add(new Book(author, title, year));

                }while (key.equalsIgnoreCase(yes) || !key.equalsIgnoreCase(no));
            } else if (key.equalsIgnoreCase(done)) {
                System.out.println("Thank you for organizing your books!");
            } else {
                System.out.println("INVAILD RESPONSE");
            }

        } while (!key.equalsIgnoreCase(done));
    }
}
