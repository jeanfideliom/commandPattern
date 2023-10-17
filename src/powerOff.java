public class powerOff implements Command{
    private TV tv;

    public powerOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOff();
    }
}
