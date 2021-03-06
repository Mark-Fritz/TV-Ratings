package Event;

public class channelEvent extends event {
    String channel = "";
    String show = "";

    channelEvent(int typeID) {
        super(typeID);
    }

    public channelEvent() {
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return super.toString() + (this.channel.isEmpty() ? "" : (" channel: " + this.channel)) + (this.show.isEmpty() ? "" : " show: " + this.show);
    }
}
