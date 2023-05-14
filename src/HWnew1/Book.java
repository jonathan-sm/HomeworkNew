package HWnew1;

public class Book {
    private String bookname;
    private final Author author;
    private int publishingYear;

    public Book(String bookname, Author author, int publishingYear) {
        this.bookname = bookname;
        this.author = author;
        this.publishingYear = publishingYear;

    }

    public String getbookname(){
        return this.bookname;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
