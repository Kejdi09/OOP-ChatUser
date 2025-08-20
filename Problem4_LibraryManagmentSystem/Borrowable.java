import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Borrowable extends LibraryItem {
    public Person borrower;
    public Date borrowedDate;

    public boolean borrow(Person borrower, String date) {
        if (this.borrower != null || borrower == null) return false;

        if (borrower instanceof Student) {
            Student s = (Student) borrower;
            if (s.borrowedItem != null) return false;
            Date d = parseDate(date);
            if (d == null) return false;

            s.borrowedItem = this;
            this.borrower = borrower;
            this.borrowedDate = d;
            return true;
        } else if (borrower instanceof Academic) {
            Academic a = (Academic) borrower;
            int slot = firstEmpty(a.borrowedItems);
            if (slot == -1) return false;
            Date d = parseDate(date);
            if (d == null) return false;

            a.borrowedItems[slot] = this;
            this.borrower = borrower;
            this.borrowedDate = d;
            return true;
        }
        return false;
    }

    public Person getBorrower() {
        return borrower;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    private static Date parseDate(String s) {
        try { return new SimpleDateFormat("yyyy-MM-dd").parse(s); }
        catch (ParseException e) { return null; }
    }
    private static int firstEmpty(Borrowable[] arr) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == null) return i;
        return -1;
    }
}