public class Order {
    
    private static int count;

    private int ID;
    private Food orderedFood;
    private double portion;
    private double totalPrice;
    private boolean isFree;

    /**
     * Constructor method initializes all of the
     * instance data members either with given parameters or
     * with proper initial values.
     * @param portion
     * @param name
     * @param price
     */
    Order(double portion, String name, double price)
    {
        orderedFood = new Food(name, price);
        this.portion = portion;
        this.totalPrice = 0.0;
        this.isFree = false;
        ID = count;
        addOrder();
    }

    /**
     * Constructor method initializes all of the
     * instance data members with given parameters.
     * @param portion
     * @param orderedFood
     */
    Order(double portion, Food orderedFood)
    {
        ID = count;
        this.portion = portion;
        this.totalPrice = 0.0;
        this.orderedFood = orderedFood;
        addOrder();
    }

    /**
     *  Increments count by one.
     */
    public void addOrder()
    {
        count++;
    }

    /**
     * @param order
     * @return true if the value of ID in the target order
     * and the order passed as a parameter are the same
     */
    public boolean equals(Order order) 
    {
        return ID == order.ID;
    }

    /**
     * Calculates and sets the totalPrice of the order 
     */
    public void checkout()
    {
        totalPrice = (portion * orderedFood.getPrice());

        if(isFree) {
            totalPrice = 0.0;
        }
    }

    /**
     * Increases the portion by the given amount
     * @param extraPortion
     */
    public void increasePortion(int extraPortion)
    {
        portion += extraPortion;
    }

    /**
     * Returns a String representation of an Order object.
     */
    public String toString()
    {
        String str = "";
        if(totalPrice == 0.0)
        str += ">> Warning: this order is incomplete. \n";
        str += "Details for Order " + ID + ":\n";
        str += "\t\t" + orderedFood.getName() + "(x " + getPortion() + ")\n";
        str += "\t\tTOTAL = " + getTotalPrice() + "\n";

        return str;
    }

    // accessor methods

    /**
     * @return ID of the order
     */
    public int getID() { return ID; }

    /**
     * @return ordered food.
     */
    public Food getOrderedFood() { return orderedFood; }

    /**
     * @return portion
     */
    public double getPortion() { return portion; }

    /**
     * @return total price
     */
    public double getTotalPrice() { return totalPrice; }

    /**
     * @return count
     */
    public int getCount() { return count; }

    /**
     * @return true if the food is free
     */
    public boolean getIsFree() { return isFree; }

    // setter methods

    /**
     * sets the ID
     * @param ID
     */
    public void setID(int ID) { this.ID = ID; }

    /**
     * sets the ordered food
     * @param orderedFood
     */
    public void setOrderedFood(Food orderedFood) { this.orderedFood = orderedFood; }
    
    /**
     * sets the portion
     * @param portion
     */
    public void setPortion(double portion) { this.portion = portion; }
    
    /**
     * sets the total price
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    /**
     * sets the boolean isFree
     * @param isFree
     */
    public void setIsFree(boolean isFree) { this.isFree = isFree; }
}