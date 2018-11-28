package lemurdatabase;

public class DesertLemur extends Lemur {
    String food = "Cacti";
    String colour = "White";
    double babyDeathRate = 0.66;

    public String toString() {
        String output = "Desert Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nBaby Death Rate = " + babyDeathRate + "\n";
        return output;
    }

}
