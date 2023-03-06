package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyShop {
    private List<Toys> toys;

    public ToyShop(List<Toys> toys) {
        this.toys = toys;
    }
    
    public Toys getToyForPrice() {
        ToyChooseRandome random = new ToyChooseRandome();
        Toys toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toys toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToyShop/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}