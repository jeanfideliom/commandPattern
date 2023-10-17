public class turnOff implements Command{
    private AirFryer airFryer;
    public turnOff(AirFryer airFryer){
        this.airFryer = airFryer;
    }
    @Override
    public String execute() {
        return airFryer.turnOff();
    }
}