
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem {
static ArrayList<String> books = new ArrayList<>();    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        books.add("The Hobbit");
        books.add("The Mystery");
        books.add("Brave Kind");
        books.add("Home Workout");

        while (true) {
            System.out.println("Welcome to the Book Suggestion System!");
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update Book");
            System.out.println("5. Show Books");
            System.out.println("6. Exit");
            System.out.print("Enter operation: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    suggestBook();
                    break;
                case "2":
                    addBook();
                    break;
                case "3":
                    removeBook();
                    break;
                case "4":
                    updateBook();
                    break;
                case "5":
                    showBooks();
                    break;
                case "6":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void  suggestBook() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        Random rand = new Random();
        String title = books.get(rand.nextInt(books.size()));
        int page = rand.nextInt(100) + 1;
        System.out.println("\nBook for the Day:\nBook Title: " + title + "\nPage: " + page);

        while (true) {
            System.out.print("\nWould you like another suggestion? (yes/no): ");
            String again = input.nextLine();
            if (again.equals("yes")) {
                title = books.get(rand.nextInt(books.size()));
                page = rand.nextInt(100) + 1;
                System.out.println("\nBook Title: " + title + "\nPage: " + page);
            } else {
                break;
            }
        }
    }

    public static void addBook() {
        System.out.print("Enter the book title: ");
        String name = input.nextLine();
        if (books.contains(name)) {
            System.out.println("Book already exists.");
        } else {
            books.add(name);
            System.out.println("Book added successfully.");
        }
    }

    public static void removeBook() {
        System.out.print("Enter the book title to remove: ");
        String name = input.nextLine();
        if (books.remove(name)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void updateBook() {
        System.out.print("Enter the old title: ");
        String old = input.nextLine();
        if (books.contains(old)) {
            System.out.print("Enter the new title: ");
            String newTitle = input.nextLine();
            books.set(books.indexOf(old), newTitle);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the list.");
        } else {
            System.out.println("\nAll Books:");
            for (int count = 0; count < books.size(); count++) {
                System.out.println((count + 1) + ". " + books.get(count));
            }
        }
    }
}



            
