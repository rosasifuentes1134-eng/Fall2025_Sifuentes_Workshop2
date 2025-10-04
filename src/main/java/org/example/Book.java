package org.example;

public class Book {
    private int Id;
    private String isbn;
    private String title;
    private boolean isCheckedOut = false;
    private String checkedOutTo = " ";

    public Book(int id, String isbn, String title) {
        Id = id;
        this.isbn = isbn;
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //Custom methods
    public void checkOut(String name){
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkIn(){
        this.checkedOutTo = " ";
        this.isCheckedOut = false;
    }


    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }
}

