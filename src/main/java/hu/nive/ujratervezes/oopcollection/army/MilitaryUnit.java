package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int eletero;
    private int tamadasiSebzes;
    private boolean pancelozott;

    public MilitaryUnit(int eletero, int tamadasiSebzes, boolean pancelozott) {
        this.eletero = eletero;
        this.tamadasiSebzes = tamadasiSebzes;
        this.pancelozott = pancelozott;
    }

    public int getHitPoints() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getTamadasiSebzes() {
        return tamadasiSebzes;
    }

    public void setTamadasiSebzes(int tamadasiSebzes) {
        this.tamadasiSebzes = tamadasiSebzes;
    }

    public boolean isPancelozott() {
        return pancelozott;
    }

    public void setPancelozott(boolean pancelozott) {
        this.pancelozott = pancelozott;
    }

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

}
