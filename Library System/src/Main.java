import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create book objects
        Books sapiens = new Books("Sapiens: A Brief History of Humankind", 512, "Yuval Noah Harari", "Provides a comprehensive view of modern history and human history.", "4.7", 20);
        Books turkishHistory = new Books("The History of the Turks", 650, "Hasan Cengiz", "A detailed examination of the history of the Turks.", "4.5", 15);
        Books lonely = new Books("Lonely", 280, "Haldun Taner", "Contains the author's personal and societal memories from his era.", "4.3", 10);
        Books oneDay = new Books("One Day", 320, "Ferhan Şensoy", "Presents memoirs and stories about Ferhan Şensoy's stage life and artistic career.", "4.6", 12);
        Books steveJobs = new Books("Steve Jobs", 656, "Walter Isaacson", "A biography detailing the life and achievements of Apple founder Steve Jobs.", "4.8", 25);
        Books ataturk = new Books("Atatürk", 480, "Andrew Mango", "A comprehensive biography examining Mustafa Kemal Atatürk's life and leadership.", "4.7", 18);
        Books littlePrince = new Books("The Little Prince", 96, "Antoine de Saint-Exupéry", "A classic work containing philosophical and thought-provoking short stories.", "4.9", 30);
        Books whiteFang = new Books("White Fang", 300, "Jack London", "An impactful story about nature and life from the perspective of animals.", "4.4", 22);
        Books crimeAndPunishment = new Books("Crime and Punishment", 430, "Fyodor Dostoyevsky", "A deep examination of human nature and crime.", "4.8", 17);
        Books oneHundredYearsOfSolitude = new Books("One Hundred Years of Solitude", 417, "Gabriel García Márquez", "A masterpiece depicting Latin America's history and culture through interwoven stories.", "4.9", 20);

        while (true) {
            System.out.println("Welcome to the Library Management System");
            System.out.println("Please choose a book category...\n"
                                + "1-History\n"
                                + "2-Novel\n"
                                + "3-Story\n"
                                + "4-Research\n"
                                + "5-Biography\n"
                                + "6-Memoir\n"
                                + "7-Exit System");

            String bookCategory = scanner.nextLine();

            if ("7".equals(bookCategory)) {
                System.out.println("Exiting the system...");
                break;
            }

            switch (bookCategory) {
                case "1":
                    System.out.println("Books in this category: Sapiens: A Brief History of Humankind, The History of the Turks");
                    System.out.println("Select a book...");
                    String selectedHistory = scanner.nextLine();
                    if ("Sapiens: A Brief History of Humankind".equals(selectedHistory)) {
                        sapiens.show_Info();
                        sapiens.show_Description(scanner);
                        sapiens.borrow(scanner);
                    } 
                    else if ("The History of the Turks".equals(selectedHistory)) {
                        turkishHistory.show_Info();
                        turkishHistory.show_Description(scanner);
                        turkishHistory.borrow(scanner);
                    } 
                    else {
                        System.out.println("Invalid book title.");
                    }
                    break;
                case "2":
                    System.out.println("Books in this category: Crime and Punishment, One Hundred Years of Solitude");
                    System.out.println("Select a book...");
                    String selectedNovel = scanner.nextLine();
                    if ("Crime and Punishment".equals(selectedNovel)) {
                        crimeAndPunishment.show_Info();
                        crimeAndPunishment.show_Description(scanner);
                        crimeAndPunishment.borrow(scanner);
                    } 
                    else if ("One Hundred Years of Solitude".equals(selectedNovel)) {
                        oneHundredYearsOfSolitude.show_Info();
                        oneHundredYearsOfSolitude.show_Description(scanner);
                        oneHundredYearsOfSolitude.borrow(scanner);
                    } 
                    else {
                        System.out.println("Invalid book title.");
                    }
                    break;
                case "3":
                    System.out.println("Books in this category: The Little Prince, White Fang");
                    System.out.println("Select a book...");
                    String selectedStory = scanner.nextLine();
                    if ("The Little Prince".equals(selectedStory)) {
                        littlePrince.show_Info();
                        littlePrince.show_Description(scanner);
                        littlePrince.borrow(scanner);
                    } 
                    else if ("White Fang".equals(selectedStory)) {
                        whiteFang.show_Info();
                        whiteFang.show_Description(scanner);
                        whiteFang.borrow(scanner);
                    } 
                    else {
                        System.out.println("Invalid book title.");
                    }
                    break;
                case "4":
                    System.out.println("Research category has not been added yet.");
                    break;
                case "5":
                    System.out.println("Books in this category: Steve Jobs, Atatürk");
                    System.out.println("Select a book...");
                    String selectedBiography = scanner.nextLine();
                    if ("Steve Jobs".equals(selectedBiography)) {
                        steveJobs.show_Info();
                        steveJobs.show_Description(scanner);
                        steveJobs.borrow(scanner);
                    } 
                    else if ("Atatürk".equals(selectedBiography)) {
                        ataturk.show_Info();
                        ataturk.show_Description(scanner);
                        ataturk.borrow(scanner);
                    } 
                    else {
                        System.out.println("Invalid book title.");
                    }
                    break;
                case "6":
                    System.out.println("Books in this category: Lonely, One Day");
                    System.out.println("Select a book...");
                    String selectedMemoir = scanner.nextLine();
                    if ("Lonely".equals(selectedMemoir)) {
                        lonely.show_Info();
                        lonely.show_Description(scanner);
                        lonely.borrow(scanner);
                    } 
                    else if ("One Day".equals(selectedMemoir)) {
                        oneDay.show_Info();
                        oneDay.show_Description(scanner);
                        oneDay.borrow(scanner);
                    } 
                    else {
                        System.out.println("Invalid book title.");
                    }
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
