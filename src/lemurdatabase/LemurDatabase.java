package lemurdatabase;

import javax.swing.*;

public class LemurDatabase {
    public static void main(String[] args) {
        int choice;
        String myInput;
        myInput = JOptionPane.showInputDialog("How many Lemurs do you want to add to the list?");
        int num = Integer.parseInt(myInput);

        Lemur lemurs[] = new Lemur[num];

        for(int i = 0; i < num; i++){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter the type of Lemur to add:\n"
                    + "1 - Tree Lemur\n2 - Desert Lemur\n3 - JungleLemur"));
            if(choice == 1){
                System.out.println("Creating Tree Lemur.");
                lemurs[i] = new TreeLemur();
            }
            else if(choice == 2){
                System.out.println("Creating Desert Lemur.");
                lemurs[i] = new DesertLemur();
            }
            else if(choice == 3){
                System.out.println("Creating Jungle Lemur.");
                lemurs[i] = new JungleLemur();
            }
            else {
                System.out.println("Invalid selection.  Try again.");
                i--;
            }
        }

        System.out.println("Displaying the list of Lemurs:\n--------------------------------------------\n");

        for(int i = 0; i < num; i++){
            System.out.println(lemurs[i].toString());
        }
    }
}
