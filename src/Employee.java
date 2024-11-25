public class Employee extends Person {

    /**
     * The ID of the employee.
     */
    private String id;

    /**
     * The department of the employee.
     */
    private String department;

    /**
     * Default constructor.
     */
    public Employee() {
    }

    /**
     * Constructor.
     * @param name
     * @param age
     * @param sex
     * @param id
     * @param department
     */
    public Employee(String name, int age, String sex, String id, String department) {
        super(name, age, sex);
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
