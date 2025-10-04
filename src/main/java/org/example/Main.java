package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "9780439708180", "Harry Potter and the Sorcerer's Stone"),
                new Book(2, "9780547928227", "The Hobbit"),
                new Book(3, "9780553573428", "A Game of Thrones"),
                new Book(4, "9780345339706", "The Fellowship of the Ring"),
                new Book(5, "9780446310789", "To Kill a Mockingbird"),
                new Book(6, "9780451524935", "1984"),
                new Book(7, "9780307743657", "The Shining"),
                new Book(8, "9780385537858", "Doctor Sleep"),
                new Book(9, "9780061120084", "Brave New World"),
                new Book(10, "9780553283686", "Dune"),
                new Book(11, "9780441007462", "Neuromancer"),
                new Book(12, "9780385490818", "American Gods"),
                new Book(13, "9780307346605", "World War Z"),
                new Book(14, "9780425284704", "The Martian"),
                new Book(15, "9780553106633", "The Winds of Winter (Preview)"),
                new Book(16, "9780553386790", "The Name of the Wind"),
                new Book(17, "9780743273565", "The Great Gatsby"),
                new Book(18, "9780671027346", "Bag of Bones"),
                new Book(19, "9780765311788", "Old Man’s War"),
                new Book(20, "9780141439600", "Frankenstein")
        };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\nWelcome to my neighborhood library");
            System.out.println("1)show available books"); //done
            System.out.println("2)Check out books");//done
            System.out.println("3)Show checked out books"); //done
            System.out.println("4)Checked in books");
            System.out.println("5)exit");//done

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //show all available
                    for (Book book : books) {
                        if (book.isCheckedOut() == false){
                            System.out.println(book.getId() + " " + book.getTitle() + " " + book.getIsbn());
                        }

                    }
                    break;
                case 2:
                    //1. get the ID of the book they want
                    System.out.println("Enter book ID: ");
                    //Prompt the user to enter the ID and hold it variable
                    int id = scanner.nextInt();

                    //2. We need the person's name
                    System.out.println("Enter name: ");
                    //!
                    String name = scanner.next();

                    for(Book book: books){
                        if(book.getId() == id){
                            book.checkOut(name);
                            System.out.printf("%s successfully checked out book: %s\n\n", name, book.getTitle());
                        }
                    }

                    break;
                case 3:
                    System.out.println("checkout books");
                    for(Book book: books){
                        if(book.isCheckedOut()== true){
                            System.out.println(book.getId()+ " \t" + book.getTitle()+ " \t" + book.getIsbn() + " \t" + book.getCheckedOutTo());
                        }
                    }
                    break;

                case 4:
                    System.out.println(" check in book");
                    //ask what book they want to check in
                    System.out.println("Enter book Id:");
                    int iD = scanner.nextInt();
                    for(Book book: books){
                        if(book.getId()==iD){
                            book.checkIn();
                            System.out.println("Successfully checked in ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit...");
                    System.exit(0);
                    //1 = yes
                    //0 = no
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");


            }


        }

    }
}








