package Structural.Adapter.ex1.Main;

import Structural.Adapter.ex1.ExternalJar.ICar;

public class MoveAbleAdapter implements IMoveableTarget {

    ICar luxaryCar;

    public MoveAbleAdapter(ICar luxaryCar) {
        this.luxaryCar = luxaryCar;
    }

    @Override
    public int getCarSpeed() {
        int a = luxaryCar.GetSpeed();
        return a + 20;
    }
}

