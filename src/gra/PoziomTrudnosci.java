package gra;

public enum PoziomTrudnosci {
    LOW(1),
    SEMI_MEDIUM(2),
    MEDIUM(3),
    SEMI_PRO(4),
    PRO(5),
    ADVANCED(6),
    CHICK_NORRIS(69);

    int poziomTrudności;

    PoziomTrudnosci(int poziomTrudności) {
        this.poziomTrudności = poziomTrudności;
    }

}
