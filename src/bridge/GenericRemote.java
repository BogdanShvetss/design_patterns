package bridge;

public class GenericRemote extends RemoteControl {
    public GenericRemote(TVFactory tvFactory) {
        super(tvFactory);
    }

    public void nextChannel() {
        int channel = getChannel();
        setChannel(channel + 1);
    }

    public void prevChannel() {
        int channel = getChannel();
        setChannel(channel - 1);
    }
}