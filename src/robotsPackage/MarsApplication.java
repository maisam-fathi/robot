package robotsPackage;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.batteryLevel = 10;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("Changing Battery Level to 2.");
        spirit.batteryLevel = 2;
        spirit.showAttributes();
        System.out.println("Checking the Battery Level.");
        spirit.checkBatteryLevel();
        spirit.showAttributes();
    }
}
