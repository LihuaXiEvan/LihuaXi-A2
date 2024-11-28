public class Visitor extends Person {

    /**
     * visit item
     */
    private String visitItem;

    /**
     *  VIP status
     */
    private boolean isVIP;

    /**
     * Default constructor.
     */
    public Visitor() {
    }

    /**
     * Constructor.
     * @param name
     * @param age
     * @param sex
     * @param visitItem
     * @param isVIP
     */
    public Visitor(String name, int age, String sex, String visitItem, boolean isVIP) {
        super(name, age, sex);
        this.visitItem = visitItem;
        this.isVIP = isVIP;
    }

    public String getVisitItem() {
        return visitItem;
    }

    public void setVisitItem(String visitItem) {
        this.visitItem = visitItem;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public String toTxt() {
        return super.getName() + "," + super.getSex() + "," + super.getAge() + "," + visitItem + "," + isVIP;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                super.toString() +
                " visitItem='" + visitItem + '\'' +
                ", isVIP=" + isVIP +
                '}';
    }
}
