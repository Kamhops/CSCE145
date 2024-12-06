//Kameron Hopson
public class PeanutButter{
	String name;
	int calories;
	String IsCrunchy;
	
	PeanutButter() {
		this.name = "none";
		this.calories = 100;
		this.IsCrunchy = "false";
	}
	public PeanutButter(String name, int calories, String IsCrunchy) {
        setName(name);
        setCalories(calories);
        setConsistency(IsCrunchy);
		
	}
	public String getName() {
        return name;
    }
	public void setName(String pbName) {
        if (pbName != null && !pbName.trim().isEmpty()) {
            this.name = pbName;
        } 
        else {
            this.name = "none";
        }
    }
	public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories >= 100 && calories <= 300) {
            this.calories = calories;
        } 
        else {
            this.calories = 100;
        }
    }

    public String getConsistency() {
        return IsCrunchy;
    }

    public void setConsistency(String IsCrunchy) {
        if (IsCrunchy != null && !IsCrunchy.trim().isEmpty()) {
            this.IsCrunchy = "true";
        } 
        else {
            this.IsCrunchy = "false";
        }
    }
    public void displayPeanutButterInfo() {
        System.out.println("Peanut Butter Brand: " + getName());
        System.out.println("Calories: " + getCalories());
        System.out.println("Crunchy?: " + getConsistency());
        System.out.println();
    }
}
