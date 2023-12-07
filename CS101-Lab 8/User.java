import java.util.Random;

public class User {
    private static int count;

    private int ID;
    private String name;
    private int age;
    private String orders; // store the ID of the orders that the user makes. Multiple entries are
                           //separated by a single dash (“-”) character in this string.
    private int numberOfOrders;
    private String eatenFoods; //Multiple entries are separated by a single dash (“-”) character in this string.
    private Food favoriteFood;

    /**
     * Constructor method assigns an ID to the user and initializes
     * all of the instance data members either with given parameters or with proper
     * initial values. 
     * @param name
     * @param age
     */
    User(String name, int age){
        this.ID = count;
        this.name = name;
        this.age = age;
        this.orders += ID + "-";
        this.numberOfOrders = 0;
        this.eatenFoods = "";
        addUser();
    }

    /**
     * Increments count by one
     */
    public void addUser() {
        count++;
    }

    /**
     * 
     * @param user
     * @return
     */
    public boolean equals(User user) {
        return ID == user.ID && name.equals(user.name) && age == user.age;
    }

    /**
     * Checks if the user has eaten the food given in the paramete
     * @param food
     * @return true if user ate this food
     */
    public boolean didEat(Food food)
    {
        return eatenFoods.contains(food.getName());
    }
    /**
     * Returns the order ID as a String with the index.
     * @param index
     * @return the order ID
     */
    public String pickOrderByIndex(int index)
    {
        String str = orders;
        if(index < orders.length())
            for(int i = 0; i < orders.length(); i++) {
                if(orders.charAt(index - 1)  == '-')
                {
                    str = orders.substring(index);
                    for(int j = 0; j < orders.length(); j++) {
                        str = str.substring(index, str.indexOf('-'));
                    }
                }
            }
        return str;
    }

    /**
     * This method accepts an Order object as parameter and updates
     * orders, numberOfOrders, and eatenFoods data members of the user.
     * @param order
     */
    public void addNewOrder(Order order) {
        orders += order.getOrderedFood();
        numberOfOrders++;
        eatenFoods += order.getOrderedFood() + "-";

        System.out.println("Adding a new order of Cheesecake to Ajda Pekkan...");
        System.out.println(favoriteFood.getName() + " is " + getName() + "'s favorite food!");

        if(favoriteFood.getName().equals(order.getOrderedFood().getName())) {
            Random rand = new Random();
            int n = rand.nextInt(8);
            if(n + 1 < 5)
            {
                order.setIsFree(true);
                System.out.println(getName() + " is not paying today!");
            }
            else {
                System.out.println(getName() + " lost the chance.");
            }
        }
    }

    /**
     * Returns a String representation of a user.
     */
    public String toString() {
        return "User ID: " + getID() + ", User name: " 
            + getName() + ", Age: " + getAge();
    }

    // getter methods

    /**
     * @return ID of the user
     */
    public int getID() { return ID; }

    /**
     * @return name of the user
     */
    public String getName() { return name; }

    /**
     * @return age of the user
     */
    public int getAge() { return age; }

    /**
     * @return orders String 
     */
    public String getOrders() { return orders; }

    /**
     * @return number of orders
     */
    public int getNumberOfOrders() { return numberOfOrders; }

    /**
     * @return eaten foods of the user
     */
    public String getEatenFood() { return eatenFoods; }

    /**
     * @return counts of the user
     */
    public int getCount() { return count; }

    /**
     * @return ID of the user
     */
    public Food getFavoriteFood() { return favoriteFood; }

    // setter methods

    /**
     * sets the ID of the user
     */
    public void setID(int ID) { this.ID = ID; }

    /**
     * sets the name of the user
     */
    public void setName(String name) { this.name = name; }

    /**
     * sets the age of the user
     */
    public void setAge (int age) { this.age = age; }

    /**
     * sets the String orders as new food is ordered 
     */
    public void setOrders(String orders) { this.orders = orders; }

    /**
     * sets the number of orders
     */
    public void setNumberOfOrders(int numberOfOrders)
    {
        this.numberOfOrders = numberOfOrders; 
    }

    /**
     * sets the favorite food of the user
     */
    public void setFavoriteFood(Food favoriteFood) { this.favoriteFood = favoriteFood;}

    /**
     * sets the eaten foods of the user
     */
    public void setEatenFoods(String eatenFoods)
    {
        this.eatenFoods = eatenFoods;
    }
}