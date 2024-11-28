import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Ride implements RideInterface {

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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    /**
     * LinkedBlockingQueue
     */
    private Queue<Visitor> rideQueue = new LinkedBlockingQueue<>();

    /**
     * rideHistory
     */
    private List<Visitor> rideHistory = new LinkedList<>();


    // maxRider
    private int maxRider;

    // numOfCycles
    private int numOfCycles;

    @Override
    public void addVisitorToQueue(Visitor visitor) {

        rideQueue.offer(visitor);
        System.out.println("method addVisitorToQueue add successfully. Visitor name: " + visitor.getName());
    }


    @Override
    public void removeVisitorFromQueue(Visitor visitor) {

        rideQueue.remove(visitor);
        System.out.println("method removeVisitorFromQueue remove success. Visitor name: " + visitor.getName());

    }

    @Override
    public void printQueue() {

        System.out.println("printQueue.......................");
        Iterator<Visitor> iterator = rideQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("printQueue.......................");

    }

    /**
     * synchronized method
     */
    @Override
    public synchronized void runOneCycle() {

        for (int i = 0; i < maxRider; i++) {
            Visitor visitor = rideQueue.poll();
            if (visitor != null) {
                addVisitorToHistory(visitor);
            }
        }

        numOfCycles = numOfCycles + 1;
        System.out.println("synchronized method runOneCycle process success. numOfCycles: " + numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("method addVisitorToHistory process success. visitor name: " + visitor.getName());
    }

    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        boolean contains = rideHistory.contains(visitor);
        System.out.println("method checkVisitorFromHistory process success. is contain: + " + contains + " visitor name: " + visitor.getName());
    }

    @Override
    public void numberOfVisitors() {
        System.out.println("method numberOfVisitors rideHistory size: " + rideHistory.size());
    }

    @Override
    public void printRideHistory() {
        System.out.println("printRideHistory.......................");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("printRideHistory.......................");
    }


    public void sort() {
        Collections.sort(rideHistory, new SortVisitor());
        System.out.println("method sort process success.");
    }

    public void exportRideHistory() {
        try {

            FileWriter writer = new FileWriter("d:\\visitor.txt");

            for (int i = 0; i < rideHistory.size(); i++) {
                writer.write(rideHistory.get(i).toTxt() + "\n");
            }

            writer.close();

            System.out.println(" method exportRideHistory success.");

        } catch (IOException e) {
            System.out.println(" method exportRideHistory fail");
        }

    }

    public void importRideHistory() {

        try {
            FileReader reader = new FileReader("d:\\visitor.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");

                Visitor visitor = new Visitor(split[0], Integer.parseInt(split[1]), split[2], split[3], Boolean.parseBoolean(split[4]));
                rideHistory.add(visitor);
            }
            bufferedReader.close();

            System.out.println("method importRideHistory success.");
        } catch (IOException e) {
            System.out.println(" method importRideHistory fail");
        }
    }

}

