public class tempDown implements Command{
    private AirFryer airFryer;
    public tempDown(AirFryer airFryer){
        this.airFryer = airFryer;
    }
    @Override
    public String execute() {
        return airFryer.tempDown();
    }
}
