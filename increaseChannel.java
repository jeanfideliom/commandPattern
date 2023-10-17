public class increaseChannel implements Command{
    private TV tv;

    public increaseChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.increaseChannel();
    }
}
