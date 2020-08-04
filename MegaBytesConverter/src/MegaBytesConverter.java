public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            // 1 MB = 1024KB
        }else{
            double megabytes2 = (kiloBytes/1024d);
            long megabytes = Math.round(megabytes2);
            double kilobytes2 = (megabytes2 - megabytes)*1024d;
            long kilobytes = Math.round(kilobytes2);

            System.out.println(kiloBytes + " KB = " + megabytes2 + " MB and " + Math.abs(kilobytes) + " KB");

        }

    }
}
