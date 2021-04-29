package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean shieldAvailable;

    public Swordsman(boolean pancelozott) {
        super(100, 10, pancelozott);
        this.shieldAvailable = true;
    }

    @Override
    public int doDamage() {
        return this.getTamadasiSebzes();
    }

    @Override
    public void sufferDamage(int damage) {
        if (!isPancelozott()) {
            if (shieldAvailable) {
                shieldAvailable = false;
                setEletero(getHitPoints());
            } else {
                setEletero(getHitPoints() - damage);
            }
        } else {
            if (shieldAvailable) {
                shieldAvailable = false;
                setEletero(getHitPoints());
            } else {
                setEletero(getHitPoints() - (damage / 2));
            }
        }
    }
}