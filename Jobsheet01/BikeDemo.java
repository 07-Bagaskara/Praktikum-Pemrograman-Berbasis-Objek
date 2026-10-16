package Jobsheet01;
public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountaineBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();
        //urutannya dibaca sequential,ini speedAccelerationnya diatas gearChanges berarti dibaca terlebih dahulu,kalau gear nya dipindah keatas maka gearnya yg kebaca dulu
        mountainBike1.setBrand("Trek");
        mountainBike1.gearChanges(6);
        mountainBike1.speedAcceleration(55);
        mountainBike1.printInfo();
        mountainBike1.speedDeceleration(60);
        mountainBike1.printInfo();

        mountaineBike2.setBrand("Giant");
        mountaineBike2.gearChanges(3);
        mountaineBike2.speedAcceleration(20);
        mountaineBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(15);
        roadBike1.printInfo();
    }
}
