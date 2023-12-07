public class Food {

    private String name;
    private String ingredients;
    private int calories;
    private String type;
    private double price;

    /**
     * It initializes all of the instance data members either
     * with given parameters or with proper initial values
     * @param name
     * @param price
     */
    Food(String name, double price)
    {
        this.name = name;
        this.price = price;
        ingredients = "";
        calories = 0;
        type = "";
    }

    /**
     * It initializes all of the instance data members with given parameters
     * @param name
     * @param ingredients
     * @param calories
     * @param type
     * @param price
     */
    Food(String name, String ingredients, int calories, String type, int price)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.type = type;
        this.price = price;
    }

    /**
     * @param food
     * @return true if the values of name and ingredients in the target food and
     * the food passed as aparameter are the same.
     */
    public boolean equals(Food food)
    {
        return name.equals(food.name) && ingredients.equals(food.ingredients);
    }

    /**
     * adds new ingredients
     * @param newIngredient
     */
    public void addNewIngredients(String newIngredient)
    {
        ingredients += ", " + newIngredient;
    }

    /**
     * checks if a food contains the ingredient in parameter
     * @param ingredient
     * @return true if contains.
     */
    public boolean doesContain(String ingredient) 
    {
        return getIngredients().contains(ingredient);
    }

    /**
     * Returns a String representation of a Food object. 
     */
    public String toString()
    {
        String str = "";
        str += "***************************\n";
        str += getName() + " is a " + getType() + " dish.\n";
        str += "It includes " + getIngredients() + ".\n";
        str += "Single portion contains " + getCalories() + " calories.\n";
        str += "Single serving cost = " + getPrice() + "\n\n";

        return str;
    }

    //accessor methods

    /**
     * @return the name of the food
     */
    public String getName() { return name; }

    /**
     * @return the ingredients of the food
     */
    public String getIngredients() { return ingredients; }

    /**
     * @return the calories of the food
     */
    public int getCalories() { return calories; }

    /**
     * @return the type of the food
     */
    public String getType() { return type; }

    /**
     * @return the price of the food
     */
    public double getPrice() { return price; }

    // setter methods

    /**
     * sets the name of the food
     * @param name
     */
    public void setName(String name) { this.name = name; }
    
    /**
     * sets the ingredients of the food
     * @param ingredients
     */
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    /**
     * sets the calories of the food
     * @param calories
     */
    public void setCalories(int calories) {this.calories = calories; }

    /**
     * sets the type of the food
     * @param type
     */
    public void setType(String type) { this.type = type; }

    /**
     * sets the price of the food
     * @param price
     */
    public void setPrice(double price) { this.price = price; }



}
