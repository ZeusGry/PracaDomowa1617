package robot;

public class Robot {
    int poziomBaterii;
    String nazwaRobota;
    boolean isOn;

    public void poruszRobotem(RuchRobota ruch) {
        if (poziomBaterii >= ruch.procentBaterii && isOn) {
            System.out.println(ruch.toString());
            poziomBaterii -= ruch.procentBaterii;
        }
    }

    public void naladujRobota() {
        if (!isOn) {
            poziomBaterii = 100;
        }
    }

    public void wlaczRobota() {
        isOn = true;
    }

    public void wylaczRobota() {
        isOn = false;
    }

}
