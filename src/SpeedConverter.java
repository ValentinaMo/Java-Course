public class SpeedConverter {
    public static long toMilesPerHour (double KilometersPerHour){
        if(KilometersPerHour < 0){
            return -1;
        }
        long milesPerHour = Math.round(KilometersPerHour/1.609);
        return milesPerHour;
    }
    public static void printConversion(double KilometesPerHour){
        if (KilometesPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(KilometesPerHour);
            System.out.printf("%skm/h = %dmi/h%n", KilometesPerHour, milesPerHour);

        }

    }
}
