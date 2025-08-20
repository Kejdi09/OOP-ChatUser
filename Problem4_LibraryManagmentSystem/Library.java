import java.util.Date;
import java.text.SimpleDateFormat;
class Library {

    public Student[] students  = new Student[20];
    public Academic[] academics = new Academic[20];
    public Book[] Books = new Book[20];
    public CD[] CDs = new CD[10];
    public Magazine[] Magazines = new Magazine[20];

    private int sCount = 0, aCount = 0, bCount = 0, cCount = 0, mCount = 0;
    private int nextId = 1;


    public String addStaff(String name, String surname, int stdff_type) {
        String id = "L" + nextId++;
        if (stdff_type == 0) {
            if (sCount >= students.length) return null;
            Student s = new Student();
            s.name = name; s.surname = surname; s.LibraryID = id;
            students[sCount++] = s;
            return id;
        } else if (stdff_type == 1) {
            if (aCount >= academics.length) return null;
            Academic a = new Academic();
            a.name = name; a.surname = surname; a.LibraryID = id;
            academics[aCount++] = a;
            return id;
        }
        return null;
    }

    public boolean addItem(LibraryItem item) {
        if (item instanceof Book) {
            if (bCount >= Books.length) return false;
            Books[bCount++] = (Book) item;
            return true;
        } else if (item instanceof CD) {
            if (cCount >= CDs.length) return false;
            CDs[cCount++] = (CD) item;
            return true;
        } else if (item instanceof Magazine) {
            if (mCount >= Magazines.length) return false;
            Magazines[mCount++] = (Magazine) item;
            return true;
        }
        return false;
    }

    public void removeItem(String serialNumber) {

        for (int i = 0; i < bCount; i++) {
            if (eq(Books[i].serialNumber, serialNumber)) {
                Books[i] = Books[--bCount];
                Books[bCount] = null;
                return;
            }
        }

        for (int i = 0; i < cCount; i++) {
            if (eq(CDs[i].serialNumber, serialNumber)) {
                CDs[i] = CDs[--cCount];
                CDs[cCount] = null;
                return;
            }
        }

        for (int i = 0; i < mCount; i++) {
            if (eq(Magazines[i].serialNumber, serialNumber)) {
                Magazines[i] = Magazines[--mCount];
                Magazines[mCount] = null;
                return;
            }
        }
    }

    public void removeStuff(String libraryID) {

        for (int i = 0; i < sCount; i++) {
            if (eq(students[i].LibraryID, libraryID)) {
                students[i] = students[--sCount];
                students[sCount] = null;
                return;
            }
        }

        for (int i = 0; i < aCount; i++) {
            if (eq(academics[i].LibraryID, libraryID)) {
                academics[i] = academics[--aCount];
                academics[aCount] = null;
                return;
            }
        }
    }


    public boolean borrowItem() {

        Person p = findBorrowerWithCapacity();
        if (p == null) return false;

        Borrowable item = firstAvailableBorrowable();
        if (item == null) return false;

        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return item.borrow(p, today);
    }


    public boolean giveBackItem() {
        Borrowable b = firstBorrowedBorrowable();
        if (b == null) return false;

        Person br = b.borrower;
        if (br instanceof Student) {
            Student s = (Student) br;
            s.borrowedItem = null;
        } else if (br instanceof Academic) {
            Academic a = (Academic) br;
            for (int i = 0; i < a.borrowedItems.length; i++) {
                if (a.borrowedItems[i] == b) {
                    a.borrowedItems[i] = null;
                    break;
                }
            }
        }
        b.borrower = null;
        b.borrowedDate = null;
        return true;
    }

     private static boolean eq(String a, String b) { return a != null && a.equals(b); }

    private Person findBorrowerWithCapacity() {
        for (int i = 0; i < sCount; i++) {
            if (students[i].borrowedItem == null) return students[i];
        }

        for (int i = 0; i < aCount; i++) {
            if (hasFreeSlot(academics[i])) return academics[i];
        }
        return null;
    }
    private static boolean hasFreeSlot(Academic a) {
        for (Borrowable x : a.borrowedItems) if (x == null) return true;
        return false;
    }
    private Borrowable firstAvailableBorrowable() {
        for (int i = 0; i < bCount; i++) if (Books[i].borrower == null) return Books[i];
        for (int i = 0; i < cCount; i++) if (CDs[i].borrower == null) return CDs[i];
        return null;
    }
    private Borrowable firstBorrowedBorrowable() {
        for (int i = 0; i < bCount; i++) if (Books[i].borrower != null) return Books[i];
        for (int i = 0; i < cCount; i++) if (CDs[i].borrower != null) return CDs[i];
        return null;
    }
}
