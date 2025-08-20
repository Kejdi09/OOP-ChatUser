# Library Management System

## Problem Description
This project implements a simple library system based on **object-oriented programming** principles:
- **Inheritance**
- **Polymorphism**
- **Abstract classes**

The library manages three types of items:
- **Books**
- **CDs**
- **Magazines**

Each item has a **unique serial number**, **shelf number**, and **shelf index**.  
Some items have additional attributes (e.g., author for books, publisher for magazines).

Borrowing rules:
- **Students** can borrow **1 item** at a time.
- **Academics** can borrow up to **3 items** at a time.
- **Magazines cannot be borrowed** (only books and CDs).

The system manages:
- Adding/removing items and staff
- Borrowing and returning items (following constraints)

---


## Implementation Details
- **Person**: base class for all library users.
- **Student**: inherits from `Person`, can hold a single borrowed item.
- **Academic**: inherits from `Person`, can hold up to three borrowed items.
- **LibraryItem**: base class for all items (serial number, shelf info).
- **Borrowable**: abstract extension of `LibraryItem`, adds borrowing functionality.
- **Book** and **CD**: borrowable items.
- **Magazine**: not borrowable.
- **Library**: manages collections of items and users; provides operations to add, remove, borrow, and return items.

---

## Constraints
- Students are limited to **1 borrowed item**.
- Academics are limited to **3 borrowed items**.
- Borrowing is only possible if the item is not already borrowed.
- Magazines are excluded from borrowing.

---

## Example Usage
```java
public class Tester {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add staff
        String studentID = lib.addStaff("John", "Doe", 0);
        String academicID = lib.addStaff("Ada", "Lovelace", 1);

        // Create items
        Book book = new Book();
        book.serialNumber = "B001";
        book.shelfNum = 1;
        book.shelfIndex = 2;
        book.Name = "Object-Oriented Programming";
        book.Publisher = "Pearson";
        book.Author = "Smith";

        CD cd = new CD();
        cd.serialNumber = "C001";
        cd.shelfNum = 2;
        cd.shelfIndex = 5;
        cd.title = "Java Fundamentals";

        Magazine mag = new Magazine();
        mag.serialNumber = "M001";
        mag.shelfNum = 3;
        mag.shelfIndex = 1;
        mag.name = "TechMonthly";
        mag.publisher = "TechPub";

        // Add items
        lib.addItem(book);
        lib.addItem(cd);
        lib.addItem(mag);

        // Borrow book directly via Borrowable API
        Student s = lib.students[0];
        System.out.println("Student borrows book: " + book.borrow(s, "2025-08-20"));

        // Academic borrows CD
        Academic a = lib.academics[0];
        System.out.println("Academic borrows CD: " + cd.borrow(a, "2025-08-21"));

        // Library automatic borrow/return (minimal API per UML)
        System.out.println("Library borrowItem(): " + lib.borrowItem());
        System.out.println("Library giveBackItem(): " + lib.giveBackItem());
    }
}
```
## Conclusion

This system demonstrates the use of inheritance, polymorphism, and abstract classes to build a simple library management model. The solution respects the provided UML class diagram and exercise requirements.