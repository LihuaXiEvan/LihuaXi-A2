public class Ride {

    private Employee employee;

    /**
     * The item of the ride.
     */
    private String item;

    /**
     * The restrictions of the ride.
     */
    private String restrictions;

    /**
     * Default constructor.
     */
    public Ride() {
    }

    /**
     * Constructor.
     * @param employee
     * @param item
     * @param restrictions
     */
    public Ride(Employee employee, String item, String restrictions) {
        this.employee = employee;
        this.item = item;
        this.restrictions = restrictions;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

}

