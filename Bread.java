//Kameron Hopson
public class Bread {
	String name;
	int calories;
	String breadType;
	
	Bread() {
		this.name = "none";
		this.calories = 50;
		this.breadType = "Whole Grain";
	}
	public Bread(String name, int calories, String type) {
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
        if (calories >= 50 && calories <= 250) {
            this.calories = calories;
        } 
        else {
            this.calories = 50;
        }
    }

    public String getType() {
        return breadType;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("Honey Wheat") || type.equalsIgnoreCase("White") || type.equalsIgnoreCase("Whole Grain") || type.equalsIgnoreCase("Whole Wheat")) {
            this.breadType = type;
        } 
        else {
            this.breadType = "Whole Grain";
        }
    }
    public void displayBreadInfo() {
        System.out.println("Bread Name: " + getName());
        System.out.println("Calories per slice: " + getCalories());
        System.out.println("Type of Bread: " + getType());
        System.out.println();
    }
}