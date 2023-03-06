package ToyShop;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toys toy1 = new Toys(0, "Кукла", 25);
        Toys toy2 = new Toys(1, "Машинка", 30);
        Toys toy3 = new Toys(2, "Робот", 5);
        Toys toy4 = new Toys(3, "Матрёшка", 40);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyShop toyShop = new ToyShop(toys);
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();


    }
    
    
}