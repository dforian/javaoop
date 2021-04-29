package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {


    public Archer() {
        super(50, 20, false);
    }

    @Override
    public int doDamage() {
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