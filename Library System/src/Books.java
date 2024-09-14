import java.util.Scanner;

public class Books {
    private String name;
    private int page_num;
    private String author;
    private String description;
    private String point;
    private int book_amount;

    public Books(String name, int page_num, String author, String description, String point, int book_amount) {
        this.name = name;
        this.page_num = page_num;
        this.author = author;
        this.description = description;
        this.point = point;
        this.book_amount = book_amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage_num() {
        return page_num;
    }

    public void setPage_num(int page_num) {
        this.page_num = page_num;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public int getBook_amount() {
        return book_amount;
    }

    public void setBook_amount(int book_amount) {
        this.book_amount = book_amount;
    }

    public void borrow(Scanner scanner) {
    System.out.println("Do you want to borrow this book? (Yes-No)");
    String answer = scanner.nextLine();
    if ("Yes".equalsIgnoreCase(answer)) {
        System.out.println("How many copies do you want to borrow?");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if ((book_amount - amount) >= 0) {
            System.out.println("You are borrowing " + amount + " copy/copies of this book.");
            System.out.println("Maximum borrowing period is 14 days.");
            book_amount -= amount;
        } else {
            System.out.println("Insufficient stock. Please enter a smaller amount.");
        }
    }
}

public void show_Info() {
    System.out.println("Book Title: " + name);
    System.out.println("Author: " + author);
    System.out.println("Number of Pages: " + page_num);
    System.out.println("Rating: " + point);
    System.out.println("Available Copies: " + book_amount);
}

public void show_Description(Scanner scanner) {
    System.out.println("Do you want to see the book description? (Yes-No)");
    String answer = scanner.nextLine();
    if ("Yes".equalsIgnoreCase(answer)) {
        System.out.println("Book Description: " + description);
    }
}
}
