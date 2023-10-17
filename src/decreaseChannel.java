public class decreaseChannel implements Command{
    private TV tv;

    public decreaseChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.decreaseChannel();
    }
}
