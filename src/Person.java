public class Person {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * The age of the person.
     */
    private int age;

    /**
     * The sex of the person.
     */
    private String sex;


    /**
     * Default constructor.
     */
    public Person() {
    }

    /**
     * Constructor.
     * @param name
     * @param age
     * @param sex
     */
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
