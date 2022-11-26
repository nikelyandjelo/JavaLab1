import java.util.Arrays;
import java.util.Comparator;

public class lab4 {
    public static void main(String[] args) {
        Inventory[] school = new Inventory[3];

        school[0] = new Inventory("football",2,"red","ball",13);
        school[1] = new Inventory("volleyball", 1, "black", "ball", 23);
        school[2] = new Inventory("hockey", 3, "green", "hockey stick", 56);


        Comparator<Inventory> byWeight = Comparator.comparing(Inventory::getWeight);
        Arrays.sort(school, byWeight);
        for (Inventory piece: school) {
            System.out.println(piece.showData());
        }

        Comparator<Inventory> byQuantity = Comparator.comparing(Inventory::getQuantity).reversed();
        Arrays.sort(school, byQuantity);

        for (Inventory piece: school) {
            System.out.println(piece.showData());
        }
    }
}

// C11 = 7
class Inventory {
    public String nameOfSport;

    private final int weight;
    public String color;

    public String name;

    private final int quantity;

    public int getWeight() {
        return this.weight;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String showData() {
        return String.format("%s / %d / %s / %s / %d", nameOfSport, weight, color, name, quantity);
    }

    public Inventory(String nameOfSport, int weight, String color, String name, int quantity) {
        this.nameOfSport = nameOfSport;
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.quantity = quantity;
    }
}