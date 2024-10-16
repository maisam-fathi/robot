package robotsPackage;

public class MarsRobot {

    String status;
    int speed;
    float temperature;
    int batteryLevel;

    public void checkTemperature() {
        if (temperature < -80) {
        status = "returning home";
        speed = 5;
            }
        }

        void showAttributes() {
            System.out.println("Status: " + status);
            System.out.println("Speed: " + speed);
            System.out.println("Temperature: "+ temperature);
            System.out.println("Battery Level: "+ batteryLevel);
        }

    public void checkBatteryLevel() {
        if(batteryLevel < 3){
            status = "Stop Moving";
            speed = 0;
        }
    }
}


