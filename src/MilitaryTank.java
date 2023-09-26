public class MilitaryTank extends Vehicle {

    public MilitaryTank() {
        super(2000);
        System.out.println("Tank created. " + getInitialMiles() + " miles to go!");
    }

    @Override
    public void drive() {
        if (!hasDriver) {
            System.out.println("Tank didn't drive - there's no driver!");
        } else {
            System.out.println("Tank drove 5 miles - 1995 miles to go");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        hasDriver = true;
        if (driver.getAge() >= 25) {
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() +
                    " is " + driver.getAge() +
                    ", but must be 25 or older to drive tank");

        }
    }
}
