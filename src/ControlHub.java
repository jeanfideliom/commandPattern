public class ControlHub {
    public static void main(String[] args) {
        TV tv = new TV();
        AirFryer airFryer = new AirFryer();
        RemoteControl rc = new RemoteControl();
        //TV Commands
        powerOn pwrON = new powerOn(tv);
        System.out.println(pwrON.execute());

        powerOff pwrOFF = new powerOff(tv);
        System.out.println(pwrOFF.execute());

        increaseChannel incChann = new increaseChannel(tv);
        System.out.println(incChann.execute());

        decreaseChannel decChann = new decreaseChannel(tv);
        System.out.println(decChann.execute());
        //AirFryer Commands
        turnOn tON = new turnOn(airFryer);
        System.out.println(tON.execute());

        turnOff tOFF = new turnOff(airFryer);
        System.out.println(tOFF.execute());

        tempUp tUP = new tempUp(airFryer);
        System.out.println(tUP.execute());

        tempDown tDOWN = new tempDown(airFryer);
        System.out.println(tDOWN.execute());

    }
}