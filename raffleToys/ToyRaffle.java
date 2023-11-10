package raffleToys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy( "Смартфон", 4, 20);
        Toy toy2 = new Toy( "ПК", 1, 10);
        Toy toy3 = new Toy( "Повербанк", 50, 60);
        Toy toy4 = new Toy( "Солдатики", 20, 15);
        Toy toy5 = new Toy( "Мягкая игрушка", 100, 40);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);


        store.changeToyFrequency(2, 20);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}

