public class VehicleTest {
    public static void main(String[] args) {
        Motorcycle yamahaSR400 = new Motorcycle();
        yamahaSR400.setName("Yamaha SR400");
        yamahaSR400.makeNoise();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle();
        vehicles[0].setName("Jeep Wrangler");
        vehicles[1] = new Vehicle();
        vehicles[1].setName("Chevy Malibu");
        vehicles[2] = new Vehicle();
        vehicles[2].setName("Ford Bronco");

//        for (Vehicle[] vehicle : vehicles){
//            System.out.println(vehicle.getName());
//        }

    }
}
