package Robot;

public class VolcanoRobot {
    String status;
    String name;
    String location;
    int speed;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    float temperature;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    void checkTemperature() {
        if (temperature > 660){
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("temperature: " + temperature);

    }
}
