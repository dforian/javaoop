package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean elsoTamadas;

    public HeavyCavalry() {
        super(150, 20, true);
        this.elsoTamadas = true;
    }

    @Override
    public int doDamage() {
        if (elsoTamadas) {
            elsoTamadas = false;
            return this.getTamadasiSebzes() * 3;
        }
        return this.getTamadasiSebzes();
    }

    @Override
    public void sufferDamage(int damage) {
        if (!isPancelozott()) {
            setEletero(getHitPoints() - damage);
        } else {
            setEletero(getHitPoints() - (damage / 2));
        }
    }
}