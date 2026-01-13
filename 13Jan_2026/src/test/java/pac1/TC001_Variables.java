
package pac1;

public class TC001_Variables {
    private static double width = 20;
    private static double height = 10;
    private static double depth = 5;
    private static int boxid; // Currently unused, but kept as per your class

    public static double volume() {
        double temp = 0;
        try {
            temp = width * height * depth;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

    public static void main(String[] args) {
        // Print volume
        System.out.println("volume : " + volume());

        
    }
}


