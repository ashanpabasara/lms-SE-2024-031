package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addItem(
                new Book("B001", "Clean Code", "Robert C. Martin")
        );

        library.addItem(
                new Book("B002", "Effective Java", "Joshua Bloch")
        );

        // Add DVD
        library.addItem(
                new DVD("D001", "Introduction to Algorithms", 120)
        );

        // Add members
        library.addMember(
                new Student("M001", "Nadeesha Perera")
        );

        library.addMember(
                new Staff("M002", "Mr. Kasun Silva")
        );

        // Display items
        library.listItems();

        // Display members
        library.listMembers();

        // Display late fees
        library.printAllLateFees(3);

        // Test validation
        try {
            new Book("B003", "", "Unknown");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}