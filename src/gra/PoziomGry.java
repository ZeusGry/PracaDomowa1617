package gra;

public class PoziomGry {
    String nazwa;
    int iloscPotworow;
    PoziomTrudnosci poziomTrudnosci;
    int dlugoscPoziomu;
    int limitCzasu;
    int punktyZaPrzejscie;


    public PoziomGry() {
    }

    public PoziomGry(String nazwa, int iloscPotworow, PoziomTrudnosci poziomTrudnosci, int dlugoscPoziomu, int limitCzasu, int punktyZaPrzejscie) {
        this.nazwa = nazwa;
        this.iloscPotworow = iloscPotworow;
        this.poziomTrudnosci = poziomTrudnosci;
        this.dlugoscPoziomu = dlugoscPoziomu;
        this.limitCzasu = limitCzasu;
        this.punktyZaPrzejscie = punktyZaPrzejscie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscPotworow() {
        return iloscPotworow;
    }

    public void setIloscPotworow(int iloscPotworow) {
        this.iloscPotworow = iloscPotworow;
    }

    public PoziomTrudnosci getPoziomTrudnosci() {
        return poziomTrudnosci;
    }

    public void setPoziomTrudnosci(PoziomTrudnosci poziomTrudnosci) {
        this.poziomTrudnosci = poziomTrudnosci;
    }

    public int getDlugoscPoziomu() {
        return dlugoscPoziomu;
    }

    public void setDlugoscPoziomu(int dlugoscPoziomu) {
        this.dlugoscPoziomu = dlugoscPoziomu;
    }

    public int getLimitCzasu() {
        return limitCzasu;
    }

    public void setLimitCzasu(int limitCzasu) {
        this.limitCzasu = limitCzasu;
    }

    public int getPunktyZaPrzejscie() {
        return punktyZaPrzejscie;
    }

    public void setPunktyZaPrzejscie(int punktyZaPrzejscie) {
        this.punktyZaPrzejscie = punktyZaPrzejscie;
    }

    @Override
    public String toString() {
        return "PoziomGry{" +
                "nazwa='" + nazwa + '\'' +
                ", iloscPotworow=" + iloscPotworow +
                ", poziomTrudnosci=" + poziomTrudnosci +
                ", dlugoscPoziomu=" + dlugoscPoziomu +
                ", limitCzasu=" + limitCzasu +
                ", punktyZaPrzejscie=" + punktyZaPrzejscie +
                '}';
    }
}
