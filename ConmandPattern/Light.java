public class Light {

    private String name;
    public Light() {
        name= "Light";
    }
    public Light(String name) {
        this.name = name + " light ";
    }
    public void off() {
        System.out.println(name + " is off");
    }

    public void on() {
        System.out.println(name + " is on");
    }
}
