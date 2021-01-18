package robot;

public enum RuchRobota {
    KROK_LEWA (10),
    KROK_PRAWA (10),
    RUCH_REKA_LEWA (5),
    RUCH_REKA_PRAWA (5),
    SKOK (25);

    int procentBaterii;

    RuchRobota(int procentBaterii) {
        this.procentBaterii = procentBaterii;
    }


}
