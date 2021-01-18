package robot;

public class Robot {
    private short poziomBaterii;
    private String nazwaRobota;
    private boolean isOn;

    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
        isOn = false;
        poziomBaterii = 100;
    }

    public boolean isOn() {
        return isOn;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (isOn) {
            if (poziomBaterii >= ruch.procentBaterii) {
                System.out.println("Robot wykonał: " + ruch.toString());
                poziomBaterii -= ruch.procentBaterii;
                System.out.println("Poziom baterii wynosi: " + poziomBaterii);
                if (poziomBaterii == 0) {
                    wylaczRobota();
                }
            } else  {
                System.out.println("Za mało energii");
            }
        } else {
            System.out.println("Robot jest wyłączony");
        }
    }

    public void naladujRobota() {
        if (!isOn) {
            poziomBaterii = 100;
        }
    }

    public void wlaczRobota() {
        if (!isOn) {
            isOn = true;
            System.out.println("Robot został włączony");
            if (poziomBaterii == 0) {
                wylaczRobota();
            }
        } else {
            System.out.println("Robot już był włączony");
        }
    }

    public void wylaczRobota() {
        if (isOn) {
            isOn = false;
            System.out.println("Robot został wyłączony");
        } else {
            System.out.println("Robot już był wyłączony");
        }
    }
}
