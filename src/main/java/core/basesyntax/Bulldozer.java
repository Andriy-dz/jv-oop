package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer start its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop its work.");
    }
}
