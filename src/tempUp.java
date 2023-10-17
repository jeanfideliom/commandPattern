public class tempUp implements Command {
    private AirFryer airFryer;

    public tempUp(AirFryer airFryer) {
        this.airFryer = airFryer;
    }

    @Override
    public String execute() {
        return airFryer.tempUp();
    }
}
