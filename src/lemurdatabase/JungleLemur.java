package lemurdatabase;

public class JungleLemur extends Lemur {
    String food = "Mice, Snails, and Insects";
    String colour = "Black or Blue";
    String packSize = "Small groups";

    public String toString() {
        String output = "Jungle Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n";
        return output;
    }

}
