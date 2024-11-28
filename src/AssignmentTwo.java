public class AssignmentTwo {

    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();
        partSeven();

    }

    public static void partThree() {
        System.out.println("********************************partThree********************************");

        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");


        Visitor visitor1 = new Visitor("Charlie Clark", 18, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor2 = new Visitor("Frank Foster", 23, "boy", "The Wizard of Oz", Boolean.TRUE);
        Visitor visitor3 = new Visitor("Grace Green", 16, "girl", "The Flash: Speed Force", Boolean.FALSE);
        Visitor visitor4 = new Visitor("Jack Jackson", 66, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor5 = new Visitor("Bob Brown", 34, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.removeVisitorFromQueue(visitor4);

        ride.printQueue();

        System.out.println("********************************partThree********************************");
        System.out.println();

    }

    public static void partFourA() {
        System.out.println("********************************partFourA********************************");
        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");
        Visitor visitor1 = new Visitor("Charlie Clark", 18, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor2 = new Visitor("Frank Foster", 23, "boy", "The Wizard of Oz", Boolean.TRUE);
        Visitor visitor3 = new Visitor("Grace Green", 16, "girl", "The Flash: Speed Force", Boolean.FALSE);
        Visitor visitor4 = new Visitor("Jack Jackson", 66, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor5 = new Visitor("Bob Brown", 34, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.checkVisitorFromHistory(visitor1);

        ride.numberOfVisitors();

        ride.printRideHistory();
        System.out.println("********************************partFourA********************************");
        System.out.println();
    }

    public static void partFourB() {
        System.out.println("********************************partFourB********************************");
        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");
        Visitor visitor1 = new Visitor("Charlie Clark", 18, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor2 = new Visitor("Frank Foster", 23, "boy", "The Wizard of Oz", Boolean.TRUE);
        Visitor visitor3 = new Visitor("Grace Green", 16, "girl", "The Flash: Speed Force", Boolean.FALSE);
        Visitor visitor4 = new Visitor("Jack Jackson", 66, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor5 = new Visitor("Bob Brown", 34, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.printRideHistory();

        ride.sort();

        ride.printRideHistory();

        System.out.println("********************************partFourB********************************");
        System.out.println();
    }

    public static void partFive() {
        System.out.println("********************************partFive********************************");
        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");
        ride.setMaxRider(3);

        Visitor visitor1 = new Visitor("Charlie Clark", 18, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor2 = new Visitor("Frank Foster", 23, "boy", "The Wizard of Oz", Boolean.TRUE);
        Visitor visitor3 = new Visitor("Grace Green", 16, "girl", "The Flash: Speed Force", Boolean.FALSE);
        Visitor visitor4 = new Visitor("Jack Jackson", 66, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor5 = new Visitor("Bob Brown", 34, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        Visitor visitor6 = new Visitor("Sally Smith", 22, "boy", "Flight of the Wicked Witch", Boolean.FALSE);
        Visitor visitor7 = new Visitor("Tom Thompson", 45, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        Visitor visitor8 = new Visitor("Harry Harris", 12, "girl", "Flight of the Wicked Witch", Boolean.FALSE);
        Visitor visitor9 = new Visitor("Lily Lee", 19, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        Visitor visitor10 = new Visitor("Lucy Liu", 27, "boy", "Flight of the Wicked Witch", Boolean.FALSE);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        ride.printQueue();

        ride.runOneCycle();

        ride.printQueue();

        ride.printRideHistory();

        System.out.println("********************************partFive********************************");
        System.out.println();
    }

    public static void partSix() {
        System.out.println("********************************partSix********************************");
        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");

        Visitor visitor1 = new Visitor("Charlie Clark", 18, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor2 = new Visitor("Frank Foster", 23, "boy", "The Wizard of Oz", Boolean.TRUE);
        Visitor visitor3 = new Visitor("Grace Green", 16, "girl", "The Flash: Speed Force", Boolean.FALSE);
        Visitor visitor4 = new Visitor("Jack Jackson", 66, "boy", "The Flash: Speed Force", Boolean.TRUE);
        Visitor visitor5 = new Visitor("Bob Brown", 34, "boy", "Flight of the Wicked Witch", Boolean.TRUE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.exportRideHistory();

        System.out.println("********************************partSix********************************");
        System.out.println();
    }

    public static void partSeven() {
        System.out.println("********************************partSeven********************************");
        Ride ride = new Ride(
                new Employee("king", 45, "boy", "88888", "Security Department"),
                "Green Lantern Coaster",
                "Height less than 140cm");

        ride.importRideHistory();

        ride.numberOfVisitors();

        ride.printRideHistory();

        System.out.println("********************************partSeven********************************");
    }

}
