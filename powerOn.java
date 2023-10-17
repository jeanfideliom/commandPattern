public class powerOn implements Command {
    private TV tv;

    public powerOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOn();
    }
}
