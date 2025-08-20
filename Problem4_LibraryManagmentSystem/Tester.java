
public class Tester {
    public static void main(String[] args) {
        Library lib = new Library();

        String s1 = lib.addStaff("Xhesi", "Pinjaku", 0);
        String a1 = lib.addStaff("Ada", "Gjuzi", 1);
        System.out.println("Added Student ID: " + s1 + ", Academic ID: " + a1);

        Book b = new Book();
        b.serialNumber = "B001"; b.shelfNum = 1; b.shelfIndex = 1;
        b.Name = "OOP"; b.Publisher = "Pearson"; b.Author = "Smith";

        CD c = new CD();
        c.serialNumber = "C001"; c.shelfNum = 2; c.shelfIndex = 5;
        c.title = "Java CD";

        Magazine m = new Magazine();
        m.serialNumber = "M001"; m.shelfNum = 3; m.shelfIndex = 7;
        m.name = "TechMag"; m.publisher = "TechPub";

        System.out.println("addItem(Book): " + lib.addItem(b));
        System.out.println("addItem(CD): " + lib.addItem(c));
        System.out.println("addItem(Magazine): " + lib.addItem(m));

        Student s = findStudent(lib, s1);
        System.out.println("Student direct borrow book: " + b.borrow(s, "2025-08-20"));

        System.out.println("Student second borrow attempt (CD): " + c.borrow(s, "2025-08-21"));

        Academic a = findAcademic(lib, a1);
        System.out.println("Academic borrow CD: " + c.borrow(a, "2025-08-21"));

        System.out.println("Library.borrowItem(): " + lib.borrowItem());
        System.out.println("Library.giveBackItem(): " + lib.giveBackItem());

        lib.removeItem("M001");
        lib.removeStuff(s1);
        System.out.println("Done.");
    }

    private static Student findStudent(Library lib, String id) {
        for (Student st : lib.students) if (st != null && id.equals(st.LibraryID)) return st;
        return null;
    }
    private static Academic findAcademic(Library lib, String id) {
        for (Academic ac : lib.academics) if (ac != null && id.equals(ac.LibraryID)) return ac;
        return null;
    }
}