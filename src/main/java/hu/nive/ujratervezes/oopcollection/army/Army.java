package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    List<MilitaryUnit> hadsereg = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        hadsereg.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> militaryUnitIterable =  hadsereg.iterator();
        while(militaryUnitIterable.hasNext()) {
            MilitaryUnit nextUnit = militaryUnitIterable.next();
            nextUnit.setEletero(nextUnit.getHitPoints() - damage);
            if (nextUnit.getHitPoints() < 25) {
                militaryUnitIterable.remove();
            }
        }
    }

    public int getArmyDamage() {
        int sumAttack = 0;
        for (MilitaryUnit unit : hadsereg) {
            sumAttack += unit.doDamage();
        }
        return sumAttack;
    }

    public int getArmySize() {
        return hadsereg.size();
    }
}