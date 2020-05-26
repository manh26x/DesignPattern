import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void Test() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Light light1 = new Light();
        System.out.println("light " + light);
        System.out.println("light1 " + light1);
        LightOnCommand lightOn = new LightOnCommand(light1);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }
}
