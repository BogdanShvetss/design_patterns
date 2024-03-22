package command.lambdas;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, light::on, light::off);

        Command command = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };

        remoteControl.setCommand(1, command, stereo::off);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
    }
}