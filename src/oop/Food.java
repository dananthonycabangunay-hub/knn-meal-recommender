package oop;

public class Food implements Comparable<Food> {
	String foodname;
	float cals;
	float protein;
	float carbs;
	float fats;
	String foodgroup;
	String serving;
	String servegram;
	float distance;
	String foodcombi;
	float min;
	float max;
	String categ;
	float accuracy;
	
	String foodname2;
	String foodgroup2;
	float cals2;
	float protein2;
	float carbs2;
	float fats2;
	String serving2;
	String servegram2;
	
	String foodname3;
	String foodgroup3;
	float cals3;
	float protein3;
	float carbs3;
	float fats3;
	String serving3;
	String servegram3;
	
	float totcals;
	float totprotein;
	float totcarbs;
	float totfats;
	
	int index;
	String filepath;
	float ical;
	
	public Food(int index, String filepath) {
		this.index = index;
		this.filepath = filepath;
	}
	
	public int index() {
		return this.index;
	}
	
	public float distance() {
		return this.distance;
	}
	public String filepath() {
		return this.filepath;
	}
	
	public Food(String foodname, String foodgroup, float cals, float protein, float carbs, float fats, String serving, String servegram) {
		this.foodname = foodname;
		this.foodgroup = foodgroup;
		this.cals = cals;
		this.protein = protein;
		this.carbs = carbs;
		this.fats = fats;
		this.serving = serving;
		this.servegram = servegram;
	}
	
	public String categ() {
		return this.categ;
	}
	
	public String foodname() {
		return this.foodname;
	}

	public float cals() {
		return this.cals;
	}
	
	public float protein() {
		return this.protein;
	}
	
	public float carbs() {
		return this.carbs;
	}
	
	public float fats() {
		return this.fats;
	}
	
	public String serving() {
		return this.serving;
	}
	
	public String servegram() {
		return this.servegram;
	}
	
	public String foodgroup() {
		return this.foodgroup;
	}
	
    public int compareTo(Food p) {
        if (this.distance > p.distance) return 1;
        else if (this.distance == p.distance) return 0;
        else return -1;
    }

    public String foodcombi() {
    	return this.foodcombi;
    }
    public Food(String foodcombi, float distance, float totcals, float totprotein, float totcarbs, float totfats, String foodname, String foodgroup, float cals, float protein, float carbs, float fats, String serving, String servegram, String foodname2, String foodgroup2, float cals2, float protein2, float carbs2, float fats2, String serving2, String servegram2, String foodname3, String foodgroup3, float cals3, float protein3, float carbs3, float fats3, String serving3, String servegram3, float accuracy, float ical) {
    	this.foodcombi = foodcombi;
    	this.distance = distance;
    	this.totcals = totcals;
    	this.totprotein = totprotein;
    	this.totcarbs = totcarbs;
    	this.totfats = totfats;
    	
    	this.foodname = foodname;
		this.foodgroup = foodgroup;
		this.cals = cals;
		this.protein = protein;
		this.carbs = carbs;
		this.fats = fats;
		this.serving = serving;
		this.servegram = servegram;
		this.foodname2 = foodname2;
		this.foodgroup2 = foodgroup2;
		this.cals2 = cals2;
		this.protein2 = protein2;
		this.carbs2 = carbs2;
		this.fats2 = fats2;
		this.serving2 = serving2;
		this.servegram2 = servegram2;
		this.foodname3 = foodname3;
		this.foodgroup3 = foodgroup3;
		this.cals3 = cals3;
		this.protein3 = protein3;
		this.carbs3 = carbs3;
		this.fats3 = fats3;
		this.serving3 = serving3;
		this.servegram3 = servegram3;
		this.accuracy = accuracy;
		this.ical = ical;
    }

    public void displayResult() {
    	System.out.println("================================");
    	System.out.println("Food Items: " + this.foodcombi);
    	System.out.println("Percent Error: " + this.accuracy + " %");
        System.out.println("Calories for the whole meal: " + this.totcals);
        System.out.println("If you want " + this.ical + " calories, then you should eat " + (this.ical/this.totcals)*100 + " % serving size per portion.");
        System.out.println("---------------------------------");
        System.out.println("Macronutrients values: ");
        System.out.println("Protein: " + this.totprotein);
        System.out.println("Carbohydrates: " + this.totcarbs);
        System.out.println("Fats: " + this.totfats);
        System.out.println("================================");
        
        System.out.println("Food Item 1: " + this.foodname);
        System.out.println("Food group: " + this.foodgroup);
        System.out.println("Calories: " + this.cals);
        System.out.println("Protein: " + this.protein);
        System.out.println("Carbohydrates: " + this.carbs);
        System.out.println("Fats: " + this.fats);
        System.out.println("Serving: " + this.serving);
        System.out.println("Grams per serving: " + this.servegram);
        System.out.println("---------------------------------");
        
        System.out.println("Food Item 2: " + this.foodname2);
        System.out.println("Food group: " + this.foodgroup2);
        System.out.println("Calories: " + this.cals2);
        System.out.println("Protein: " + this.protein2);
        System.out.println("Carbohydrates: " + this.carbs2);
        System.out.println("Fats: " + this.fats2);
        System.out.println("Serving: " + this.serving2);
        System.out.println("Grams per serving: " + this.servegram2);
        System.out.println("---------------------------------");
        
        System.out.println("Food Item 3: " + this.foodname3);
        System.out.println("Food group: " + this.foodgroup3);
        System.out.println("Calories: " + this.cals3);
        System.out.println("Protein: " + this.protein3);
        System.out.println("Carbohydrates: " + this.carbs3);
        System.out.println("Fats: " + this.fats3);
        System.out.println("Serving: " + this.serving3);
        System.out.println("Grams per serving: " + this.servegram3);
        System.out.println("---------------------------------");
        System.out.println();
    }
}
