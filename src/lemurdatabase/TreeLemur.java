
package lemurdatabase;

public class TreeLemur extends Lemur {
    String food = "Fruit";
    String colour = "Red";
    String packSize = "Large groups";

    public String toString() {
        String output = "Tree Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n";
        return output;
    }
}
