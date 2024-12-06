//Kameron Hopson
public class PBJSandwich{
	Bread topSlice;
	PeanutButter peanutButter;
	Jelly jelly;
	Bread bottomSlice;
	
	PBJSandwich(){
		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter(); 
        this.jelly = new Jelly(); 
        this.bottomSlice = new Bread(); 
	}
	 public PBJSandwich(Bread topSlice, PeanutButter peanutButter, Jelly jelly, Bread bottomSlice) {
	        setTopSlice(topSlice);
	        setPeanutButter(peanutButter);
	        setJelly(jelly);
	        setBottomSlice(bottomSlice);
	    }
	 public Bread getTopSlice() {
	        return topSlice;
	    }

	    public void setTopSlice(Bread topSlice) {
	        if (topSlice != null) {
	            this.topSlice = topSlice;
	        } 
	        else {
	            this.topSlice = new Bread();
	        }
	    }

	    public PeanutButter getPeanutButter() {
	        return peanutButter;
	    }

	    public void setPeanutButter(PeanutButter peanutButter) {
	        if (peanutButter != null) {
	            this.peanutButter = peanutButter;
	        } 
	        else {
	            this.peanutButter = new PeanutButter();
	        }
	    }

	    public Jelly getJelly() {
	        return jelly;
	    }

	    public void setJelly(Jelly jelly) {
	        if (jelly != null) {
	            this.jelly = jelly;
	        } 
	        else {
	            this.jelly = new Jelly();
	        }
	    }

	    public Bread getBottomSlice() {
	        return bottomSlice;
	    }

	    public void setBottomSlice(Bread bottomSlice) {
	        if (bottomSlice != null) {
	            this.bottomSlice = bottomSlice;
	        } 
	        else {
	            this.bottomSlice = new Bread();
	        }
	    }
	    public void displaySandwichInfo() {
	        System.out.println("Top Slice:"
	        		+ "\n--------------------");
	        topSlice.displayBreadInfo();
	        System.out.println("Peanut Butter:"
	        		+ "\n--------------------");
	        peanutButter.displayPeanutButterInfo();
	        System.out.println("Jelly:"
	        		+ "\n--------------------");
	        jelly.displayJellyInfo();
	        System.out.println("Bottom Slice:"
	        		+ "\n--------------------");
	        bottomSlice.displayBreadInfo();
	    }
}
