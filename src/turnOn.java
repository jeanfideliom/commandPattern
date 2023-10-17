public class turnOn implements Command{
    private AirFryer airFryer;
    public turnOn(AirFryer airFryer){
        this.airFryer = airFryer;
    }
    @Override
    public String execute() {
        return airFryer.turnOn();
    }
}
