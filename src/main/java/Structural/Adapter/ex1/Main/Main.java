package Structural.Adapter.ex1.Main;

import Structural.Adapter.ex1.ExternalJar.ICar;
import Structural.Adapter.ex1.ExternalJar.Lamborgini;

public class Main {
    public static void main(String[] args) {

        ICar lamborgini = new Lamborgini();
        IMoveableTarget s = new MoveAbleAdapter(lamborgini);
        System.out.println(s.getCarSpeed());


    }
}
