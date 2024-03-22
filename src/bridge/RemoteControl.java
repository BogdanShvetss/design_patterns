package bridge;

public class RemoteControl {
    TV tv;
    TVFactory tvFactory;

    public RemoteControl(TVFactory tvFactory) {
        this.tvFactory = tvFactory;
    }

    public void on() {
        tv.on();
    }

    public void off() {
        tv.off();
    }

    public void tuneChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public int getChannel() {
        return tv.getChannel();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public void setTv(String type) {
        try {
            tv = tvFactory.getTV(type);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}