// Non-compliant Code: Returning references to private mutable class members
/*
import java.util.Date;

public class R04_OBJ05_J {
    private Date startDate;

    public R04_OBJ05_J(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;  // Non-compliant: exposes internal reference
    }
}
*/

// Compliant Code: Return a defensive copy of the internal mutable class member
import java.util.Date;

public class R04_OBJ05_J {
    private Date startDate;

    public R04_OBJ05_J(Date startDate) {
        this.startDate = new Date(startDate.getTime());  // Defensive copy
    }

    public Date getStartDate() {
        return new Date(startDate.getTime());  // Return a copy
    }
}
