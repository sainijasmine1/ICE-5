/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that models a pizza cutter. We only ever want one pizza cutter to cut
 * the pizzas to ensure consistency. Users can choose how many slices to divide
 * the pizza into. Note that the following source was used as a reference in
 * creating this example: Freeman, E.Freeman, E., Sierra, K., & Bates, B.
 * (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 *
 * @author dancye
 */
public class PizzaCutter {

    private static PizzaCutter instance = null;
    private int numSlices;

    /**
     * Private constructor to prevent direct instantiation from outside the
     * class.
     */
    private PizzaCutter() {
        // Intentionally left blank
    }

    /**
     * Method to get the single instance of PizzaCutter. If the instance doesn't
     * exist, it will create one; otherwise, it will return the existing
     * instance.
     *
     * @return the single instance of PizzaCutter
     */
    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();
        }
        return instance;
    }

    /**
     * Getter for the number of pizza slices.
     *
     * @return the number of pizza slices
     */
    public int getNumSlices() {
        return numSlices;
    }

    /**
     * Setter for the number of pizza slices.
     *
     * @param numSlices the number of pizza slices to set
     */
    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }
}
