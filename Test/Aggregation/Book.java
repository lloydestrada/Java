package Test.Aggregation;

public class Book {

    String title;
    int pages;
    String authors;

    Book(String title, int pages, String authors){
        this.title = title;
        this.pages = pages;
        this.authors = authors;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + ") pages " + this.authors;
    }
}
