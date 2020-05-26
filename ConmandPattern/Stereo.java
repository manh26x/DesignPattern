public class Stereo {
    private String name;
    private int volume;

    public Stereo(String name) {
        this.name = name + " stereo ";
    }
    public Stereo() {
        this.name = "Stereo";
    }
    public void on() {
        System.out.println(name + " is on");
    }

    public void setCD() {
        System.out.println(name + " is set for CD input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " volume is set for " + volume);
    }

    public void off() {
        System.out.println(name + " is off");
    }
}
