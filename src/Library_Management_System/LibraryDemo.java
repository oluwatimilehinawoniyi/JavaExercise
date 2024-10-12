package Library_Management_System;

import java.time.LocalDate;

class LibraryItem {
    String title;
    String author;
    int yearPublished;

    LibraryItem(String title_arg, String author_arg, int year) {
        this.title = title_arg;
        this.author = author_arg;
        this.yearPublished = year;
    }

    String getDetails() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished;
    }
}

class Book extends LibraryItem {
    int numberOfPages;

    Book(String title, String author, int year, int numberOfPages) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
    }

    @Override
    String getDetails() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Number of Pages: " + numberOfPages + "\n" +
                "Is Classic: " + isClassic();
    }

    Boolean isClassic() {
        int currentYear = LocalDate.now().getYear();
        return (currentYear - yearPublished) > 50;
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String title, String author, int year, int issue) {
        super(title, author, year);
        this.issueNumber = issue;
    }

    @Override
    String getDetails() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Issue Number: " + issueNumber;
    }
}

class DVD extends LibraryItem {
    int duration;

    DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }

    @Override
    String getDetails() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Duration: " + duration + " minutes";
    }

}

public class LibraryDemo {
    public static void main(String[] arg) {
        LibraryItem[] arrOfRefs = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald",
                        1925, 218),
                new Book("To Kill a Mockingbird", "Harper Lee",
                        1960, 281),
                new Magazine("National Geographic", "Various", 2020,
                        7),
                new Magazine("Time Magazine", "Various", 2023, 10),
                new DVD("Shaolin Soccer", "Stephen Chow", 2001, 113)
        };

        for (LibraryItem arrOfRef : arrOfRefs) {
            System.out.println(arrOfRef.getDetails());
            System.out.println();
        }
    }
}
