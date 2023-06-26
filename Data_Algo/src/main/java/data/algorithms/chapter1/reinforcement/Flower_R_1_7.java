package data.algorithms.chapter1.reinforcement;

/**
 * R_1.7
 * Write a Java class, Flower, 
 * that has three instance variables of type String, int, and float,
 * which respectively represent the name of the flower, its
 * number of petals, and price. 
 * Your class must include a constructor method that initializes 
 * each variable to an appropriate value, and your 
 * class should include methods for setting the value of each type, 
 * and getting the value of each type.
 */
public class Flower_R_1_7 {
    //instance variables
    private String flowerName;
    
    private int numOfPetals;
    
    private float price;
    
    Flower_R_1_7(String name, int petalsNo, float cost) {
        flowerName = name;
        numOfPetals = petalsNo;
        price = cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String name) {
        flowerName = name;
    }

    public int getNumOfPetals() {
        return numOfPetals;
    }

    public void setNumOfPetals(int petalsNo) {
        numOfPetals = petalsNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float cost) {
        price = cost;
    }
}
