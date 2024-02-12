package inheritance.task1;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd kiaAd = new VehicleAd("Kia k5", "555", new CarType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, kiaAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println(" ");

        adsService.filterByVehicleTypeByPurpose(new TruckType());
        System.out.println(" ");

        adsService.filterByVehicleTypeByBodyTypes(new SedanType());
        System.out.println(" ");

        adsService.filterByVehicleTypeByFuelTypes(new DieselType());
        System.out.println(" ");
    }
}
