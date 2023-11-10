package raffleToys;

public class Toy {
    public static int id = 0;                  // id игрушки
    private String name;                // название 
    private int quantity;               // количество
    private double frequency;           // частота выпадения 


    public Toy( String name, int quantity, double frequency) {
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
        id++;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

}
