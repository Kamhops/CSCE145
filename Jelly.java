//Kameron Hopson
public class Jelly{
	String name;
	int calories;
	String fruitType;
	
	Jelly() {
		this.name = "none";
		this.calories = 50;
		this.fruitType = "Grape";
	}
	public Jelly(String name, int calories, String type) {
        setName(name);
        setCalories(calories);
        setType(type);
    }
	public String getName() {
        return name;
    }
	public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } 
        else {
            this.name = "none";
        }
    }
	public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories >= 50 && calories <= 200) {
            this.calories = calories;
        } 
        else {
            this.calories = 50;
        }
    }

    public String getType() {
        return fruitType;
    }

    public void setType(String type) {
        if (type.equals("Apple") || type.equalsIgnoreCase("Blackberry") || type.equalsIgnoreCase("Grape") || type.equalsIgnoreCase("Blueberry")|| type.equalsIgnoreCase("Tomato")) {
            this.fruitType = type;
        } 
        else {
            this.fruitType = "Grape";
        }
    }
    public void displayJellyInfo() {
        System.out.println("Jelly Name: " + getName());
        System.out.println("Calories: " + getCalories());
        System.out.println("Type of Jelly: " + getType());
        System.out.println();
    }
}
