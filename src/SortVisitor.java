import java.util.Comparator;

public class SortVisitor implements Comparator<Visitor> {


    @Override
    public int compare(Visitor o1, Visitor o2) {

        if (o1.getSex().equals("boy") && o2.getSex().equals("girl")) {
            return 1;
        }
        if (o1.getSex().equals("girl") && o2.getSex().equals("boy")) {
            return -1;
        }

        if (o1.getAge() == o2.getAge()) {
            return 0;
        }

        return o1.getAge() - o2.getAge();
    }
}
