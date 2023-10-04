public class Hangar {

    public static void main(String[] args) {
        Car renault = new Car("renault", 12500);
        Car citroen = new Car("citroen", 40300);
        Boat voilier = new Boat("voilier", 400);
        Boat catamaran = new Boat("catamaran", 230);

        Vehicle[] vehicles = {
                renault,
                citroen,
                voilier,
                catamaran
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.doStuff());
        }
    }
}