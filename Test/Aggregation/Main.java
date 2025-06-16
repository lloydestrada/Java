package Test.Aggregation;

public class Main {
    public static void main(String[] args){

        //Aggregations = type of association that represents a "has-a" relationship between two classes.

        Book book1 = new Book("Java Programming", 198, "James Gosling");
        Book book2 = new Book("C", 18, "Idk");
        Book book3 = new Book("Python", 8, "I forgot");

        Book[] books = {book1,book2,book3};

        Library library = new Library("Manila Library", 1998, books);

        library.displayInfo();
    }
}
