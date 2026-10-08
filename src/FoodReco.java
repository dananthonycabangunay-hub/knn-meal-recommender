import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import oop.Food;


public class FoodReco {
	
	static ArrayList<Food> foodlist = new ArrayList<Food>();
	static ArrayList<Food> combilist = new ArrayList<Food>();
	static ArrayList<Food> placehold = new ArrayList<Food>();
	static ArrayList<Food> filepathlist = new ArrayList<Food>();
	static Scanner sc = new Scanner(System.in);
	static float ICALS;
	static float IPROTEIN;
	static float ICARBS;
	static float IFATS;
	static float mincal;
	static float maxcal;
	static float accuracy;
	static int a;
	static int b;
	static int c;
	static int k;
	static int iterations;
	static int speed;
	
	
	public static void main(String[] args) {
		int choice = menu(sc);
		
		filepathlist.add(new Food(0, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\americanindian.csv"));
		filepathlist.add(new Food(1, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\babyfood.csv"));
		filepathlist.add(new Food(2, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\bakedfoods.csv"));
		filepathlist.add(new Food(3, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\beansandlentils.csv"));
		filepathlist.add(new Food(4, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\beverages.csv"));
		filepathlist.add(new Food(5, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\breakfastcereals.csv"));
		filepathlist.add(new Food(6, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\dairyandeggs.csv"));
		filepathlist.add(new Food(7, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\fastfoods.csv"));
		filepathlist.add(new Food(8, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\fatsandoils.csv"));
		filepathlist.add(new Food(9, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\fish.csv"));
		filepathlist.add(new Food(10, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\fruits.csv"));
		filepathlist.add(new Food(11, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\grainsandpasta.csv"));
		filepathlist.add(new Food(12, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\meat.csv"));
		filepathlist.add(new Food(13, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\null.csv"));
		filepathlist.add(new Food(14, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\nutsandseeds.csv"));
		filepathlist.add(new Food(15, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\preparedfoods.csv"));
		filepathlist.add(new Food(16, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\restaurantfoods.csv"));
		filepathlist.add(new Food(17, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\snacks.csv"));
		filepathlist.add(new Food(18, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\soupsandsauces.csv"));
		filepathlist.add(new Food(19, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\spicesandherbs.csv"));
		filepathlist.add(new Food(20, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\sweets.csv"));
		filepathlist.add(new Food(21, "C:\\Users\\Laptop 80\\eclipse-workspace\\FoodRecFinal-SPARK11\\src\\veggies.csv"));
		
		while (choice != 0) {
			if(choice == 1) {
						mincal = 0;
						maxcal = 0;
						menu2();
						int choice1 = sc.nextInt();
						if (choice1 == 1) {
							mincal = 250;
							maxcal = 500;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							} else {
								menu3b();
								menu3c();
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 2) {
							mincal = 500;
							maxcal = 750;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 3) {
							mincal = 750;
							maxcal = 1000;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 4) {
							mincal = 1000;
							maxcal = 5000;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								filereader(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						} else {
							System.out.println("===== Choice out of bounds. Please choose again. =====");
							continue;
							} 
					}else if (choice == 2) {
						mincal = 0;
						maxcal = 0;
						menu2();
						int choice1 = sc.nextInt();
						if (choice1 == 1) {
							mincal = 250;
							maxcal = 500;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							} else {
								menu3b();
								menu3c();
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 2) {
							mincal = 500;
							maxcal = 750;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 3) {
							mincal = 750;
							maxcal = 1000;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						}else if(choice1 == 4) {
							mincal = 1000;
							maxcal = 5000;
							menu3();
							if (a == 100) {
								a = 11;
								b = 12;
								c = 21;
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}else {
								menu3b();
								menu3c();
								randomizer(a, b, c);
								knnalgo();
								displayer();
								choice = menu(sc);
							}
						} else {
							System.out.println("===== Choice out of bounds. Please choose again. =====");
							continue;
							} 
					} else {
						System.out.println("===== Choice out of bounds. Please choose again. =====");
						continue;
					}
		}
		sc.close();
	}
	
	public static void filereader(int a, int b, int c) {
		String line = "";
		String splitter = ",";
		iterations = 0;
		int origspeed = speed;
		if(a == 0){
				System.out.println("===== The dataset (American Indian) you chose is limited. Variability may vary =====");
				speed = 165;
		} else if(a == 13){
				System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
				speed = 128;
		} else if(a == 14){
				System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
				speed = 171;
		} else if(a == 16){
				System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
				speed = 112;
		} else if(a == 19){
				System.out.println("===== The dataset (Spices and Herbs) you chose is limited. Variability may vary =====");
				speed = 63;
		} else {
			speed = origspeed;
		}
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(a).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				foodlist.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
			iterations++;
			if(iterations == speed) {
				break;
			}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		iterations = 0;
				if(b == 0){
					System.out.println("===== The dataset (American Indian) you chose is limited. Variability may vary =====");
					speed = 165;
			} else if(b == 13){
					System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
					speed = 128;
			} else if(b == 14){
					System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
					speed = 171;
			} else if(b == 16){
					System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
					speed = 112;
			} else if(b == 19){
					System.out.println("===== The dataset Spices and Herbs) you chose is limited. Variability may vary =====");
					speed = 63;
			} else {
				speed = origspeed;
			}
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(b).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				foodlist.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
				iterations++;
				if(iterations == speed) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		iterations = 0;
				if(c == 0){
					System.out.println("===== The dataset (American Indian) you chose is limited. Variability may vary =====");
					speed = 165;
			} else if(c == 13){
					System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
					speed = 128;
			} else if(c == 14){
					System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
					speed = 171;
			} else if(c == 16){
					System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
					speed = 112;
			} else if(c == 19){
					System.out.println("===== The dataset (Spices and Herbs) you chose is limited. Variability may vary =====");
					speed = 63;
			} else {
				speed = origspeed;
			}
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(c).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				foodlist.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
				iterations++;
				if(iterations == speed) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public static void randomizer(int a, int b, int c) {
		String line = "";
		String splitter = ",";
		placehold.clear();
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(a).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				placehold.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.shuffle(placehold);
		
		if(a == 0){
			for(int i = 0; i < 165; i++) {
				System.out.println("===== The dataset you chose (American Indian) is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(a == 13){
			for(int i = 0; i < 128; i++) {
				System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(a == 14){
			for(int i = 0; i < 171; i++) {
				System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(a == 16){
			for(int i = 0; i < 112; i++) {
				System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(a == 19){
			for(int i = 0; i < 63; i++) {
				System.out.println("===== The dataset (Spices and Herbs) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else {
			for(int i = 0; i < speed; i++) {
				foodlist.add(placehold.get(i));
		}
		}
		placehold.clear();
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(b).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				placehold.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.shuffle(placehold);
		if(b == 0){
			for(int i = 0; i < 165; i++) {
				System.out.println("===== The dataset (American Indian) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(b == 13){
			for(int i = 0; i < 128; i++) {
				System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(b == 14){
			for(int i = 0; i < 171; i++) {
				System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(b == 16){
			for(int i = 0; i < 112; i++) {
				System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(b == 19){
			for(int i = 0; i < 63; i++) {
				System.out.println("===== The dataset (Spices and Herbs) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else {
			for(int i = 0; i < speed; i++) {
				foodlist.add(placehold.get(i));
		}
		}
		placehold.clear();
		try (BufferedReader  br = new BufferedReader(new FileReader(filepathlist.get(c).filepath()))){	
			while((line = br.readLine()) != null) {
				String [] placeholder = line.split(splitter);
				placehold.add(new Food(placeholder[0], placeholder[1], Float.parseFloat(placeholder[2]), Float.parseFloat(placeholder[3]), Float.parseFloat(placeholder[4]), Float.parseFloat(placeholder[5]), placeholder[6], placeholder[7]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.shuffle(placehold);
		if(c == 0){
			for(int i = 0; i < 165; i++) {
				System.out.println("===== The dataset (American Indian) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(c == 13){
			for(int i = 0; i < 128; i++) {
				System.out.println("===== The dataset (Miscellaneous) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(c == 14){
			for(int i = 0; i < 171; i++) {
				System.out.println("===== The dataset (Nuts and Seeds) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(c == 16){
			for(int i = 0; i < 112; i++) {
				System.out.println("===== The dataset (Restaurant Foods) you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else if(c == 19){
			for(int i = 0; i < 63; i++) {
				System.out.println("===== The dataset (Speices and Herbs you chose is limited. Variability may vary =====");
				foodlist.add(placehold.get(i));
			}
		} else {
			for(int i = 0; i < speed; i++) {
				foodlist.add(placehold.get(i));
		}
		}
		placehold.clear();
}
		
	public static int menu (Scanner sc) {
			foodlist.clear();
			System.out.println("===== Food Recommender System =====\r\n"
					+ "[!] Please Choose Which Dataset Would You Like to get food items from.\r\n"
					+ "[1] Fixed Dataset \r\n"
					+ "[2] Randomized Dataset\r\n"
					+ "[0] Exit");
			int choice = sc.nextInt();
			if (choice == 0) {
			System.out.printf("Choice: %d %nGood Bye!\n", choice);
			} else {
			speedmenu();
			}
		return choice;
	}
	
	public static void knnalgo() {
	
	System.out.println("===== Choose Diet Options =====\r\n"
			+ "[0] User Input\r\n"
			+ "[1] Ideal Weightloss Ratio\r\n"
			+ "[2] Low Fat Ratio\r\n"
			+ "[3] Low Carb Ratio\r\n"
			+ "[4] High Protein Ratio");
	int choicee = sc.nextInt();
	if(choicee == 0) {
		System.out.println("===== Input Your Desired Macronutrients =====\r\n"
				+ "[1] Calories:\r\n");
	ICALS = Float.parseFloat(sc.next());
	System.out.println("[2] Protein:\r\n");
	IPROTEIN = Float.parseFloat(sc.next());
	System.out.println("[3] Carbohydrates:\r\n");
	ICARBS = Float.parseFloat(sc.next());
	System.out.println("[4] Fats:\r\n");
	IFATS = Float.parseFloat(sc.next());
	}else if(choicee == 1) {
		System.out.println("===== Ideal Meal Ratio=====\r\n"
				+ "Protein: 30% \r\n"
				+ "Fats: 20%\r\n"
				+ "Carbohydrates: 50%");
		System.out.println("===== Please Input Desired Calories =====\r\n"
				+ "Enter: ");
		ICALS = Float.parseFloat(sc.next());
		IPROTEIN = (float) (0.30 * ICALS)/4;
		ICARBS = (float) (0.50 * ICALS)/4;
		IFATS = (float) (0.20 * ICALS)/9;
		System.out.println("Loading..... Please Wait :D ");
	} else if(choicee == 2) {
		System.out.println("===== Low Fat Meal Ratio=====\r\n"
				+ "Protein: 20%\r\n"
				+ "Fats: 30%\r\n"
				+ "Carbohydrates: 50%");
		System.out.println("===== Please Input Desired Calories =====\r\n"
				+ "Enter: ");
		ICALS = Float.parseFloat(sc.next());
		IPROTEIN = (float) (0.20 * ICALS)/4;
		ICARBS = (float) (0.50 * ICALS)/4;
		IFATS = (float) (0.30 * ICALS)/9;
		System.out.println("Loading..... Please Wait :D ");
	} else if(choicee == 3) {
		System.out.println("===== Low Carb Meal Ratio=====\r\n"
				+ "Protein: 25%\r\n"
				+ "Fats: 45%\r\n"
				+ "Carbohydrates: 30%");
		System.out.println("===== Please Input Desired Calories =====\r\n"
				+ "Enter: ");
		ICALS = Float.parseFloat(sc.next());
		IPROTEIN = (float) (0.25 * ICALS)/4;
		ICARBS = (float) (0.30 * ICALS)/4;
		IFATS = (float) (0.45 * ICALS)/9;
		System.out.println("Loading..... Please Wait :D ");
	} else if(choicee == 4) {
		System.out.println("===== High Protein Meal Ratio=====\r\n"
				+ "Protein: 40%\r\n"
				+ "Fats: 30%\r\n"
				+ "Carbohydrates: 30%");
		System.out.println("===== Please Input Desired Calories =====\r\n"
				+ "Enter: ");
		ICALS = Float.parseFloat(sc.next());
		IPROTEIN = (float) (0.40 * ICALS)/4;
		ICARBS = (float) (0.30 * ICALS)/4;
		IFATS = (float) (0.30 * ICALS)/9;
		System.out.println("Loading..... Please Wait :D ");
	} else {
		System.out.println("Choice out of bounds. Please choose again");
		knnalgo();
	}


	float TOTCALS = 0;
	float TOTPROTEIN = 0;
	float TOTCARBS = 0;
	float TOTFATS = 0;
	float DISTANCE = 0;
	combilist.clear();
	for (int i = 0; i < foodlist.size(); i++) {
		for (int j = i+1; j < foodlist.size(); j++) {
			for (int k = j+1; k < foodlist.size(); k++) {
				TOTCALS = foodlist.get(i).cals() + foodlist.get(j).cals() + foodlist.get(k).cals();	
					if(TOTCALS >= mincal && TOTCALS <= maxcal) {
								String combination = foodlist.get(i).foodname() + " (and) " + foodlist.get(j).foodname() + " (and) " + foodlist.get(k).foodname();
								TOTPROTEIN = foodlist.get(i).protein() + foodlist.get(j).protein() + foodlist.get(k).protein();
								TOTCARBS = foodlist.get(i).carbs() + foodlist.get(j).carbs() + foodlist.get(k).carbs();
								TOTFATS = foodlist.get(i).fats() + foodlist.get(j).fats() + foodlist.get(k).fats();
								DISTANCE = (float) Math.sqrt(Math.pow(IPROTEIN - TOTPROTEIN, 2)+ Math.pow(ICARBS - TOTCARBS, 2) + Math.pow(IFATS - TOTFATS, 2));						
								float protratio = (IPROTEIN-TOTPROTEIN)/IPROTEIN * 100;
								float carbratio = (ICARBS-TOTCARBS)/ICARBS * 100;
								float fatratio = (IFATS-TOTFATS)/IFATS * 100;
								protratio=Math.abs(protratio);
								carbratio=Math.abs(carbratio);
								fatratio=Math.abs(fatratio);
								float percentdiff = (protratio + carbratio + fatratio)/3;
								percentdiff=Math.abs(percentdiff);
								accuracy = percentdiff;
								combilist.add(new Food(combination, DISTANCE, TOTCALS, TOTPROTEIN, TOTCARBS, TOTFATS  
										, foodlist.get(i).foodname(), foodlist.get(i).foodgroup(), foodlist.get(i).cals(), foodlist.get(i).protein(), foodlist.get(i).carbs(), foodlist.get(i).fats(), foodlist.get(i).serving(), foodlist.get(i).servegram()
										, foodlist.get(j).foodname(), foodlist.get(j).foodgroup(), foodlist.get(j).cals(), foodlist.get(j).protein(), foodlist.get(j).carbs(), foodlist.get(j).fats(), foodlist.get(j).serving(), foodlist.get(j).servegram()
										, foodlist.get(k).foodname(), foodlist.get(k).foodgroup(), foodlist.get(k).cals(), foodlist.get(k).protein(), foodlist.get(k).carbs(), foodlist.get(k).fats(), foodlist.get(k).serving(), foodlist.get(k).servegram(), accuracy, ICALS));
							
								}
							}
						}
					}
	Collections.sort(combilist);
				}

	public static void displayer() {
		System.out.println("You have " + combilist.size()+ " combinations.");
		System.out.println("How many food meal combinations would you like to list out? ");
		k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			combilist.get(i).displayResult();
		}
	}

	public static void menu2() {
		System.out.print("===== How many calories would you like to get for the meal? =====\r\n"
				+ "[1] 250-500 Calories\r\n"
				+ "[2] 500-750 Calories\r\n"
				+ "[3] 750-1000 Calories\r\n"
				+ "[4] Above 1000 Calories\r\n");
	}

	public static void menu3() {
		System.out.println("===== Choose 3 Foodgroups to Pick From =====\r\n"
				+ " 	[100] Default (Meat + Grains and Pasta + Veggies)\r\n"
				+ "	[0] American Indian\r\n"
				+ "	[1] Baby Foods\r\n"
				+ "	[2] Baked Foods\r\n"
				+ "	[3] Beans and Lentils\r\n"
				+ "	[4] Beverages\r\n"
				+ "	[5] Breakfast Cereals\r\n"
				+ "	[6] Dairy and Egg Products\r\n"
				+ "	[7] Fast Foods\r\n"
				+ "	[8] Fats and Oils (Dressing)\r\n"
				+ "	[9] Fish\r\n"
				+ "	[10] Fruits\r\n"
				+ "	[l1] Grains and Pasta\r\n"
				+ "	[12] Meats\r\n"
				+ "	[13] Miscellaneous\r\n"
				+ "	[14] Nuts and Seeds\r\n"
				+ "	[15] Prepared Meals\r\n"
				+ "	[16] Restaurant Foods\r\n"
				+ "	[17] Snacks\r\n"
				+ "	[18] Soups and Sauces\r\n"
				+ "	[19] Spices and Herbs\r\n"
				+ "	[20] Sweets\r\n"
				+ "	[21] Vegetables");
		a = sc.nextInt();
		if (a < 0 || a > 100) {
				System.out.println("===== Choice out of bounds. Please choose again. =====");
				menu3();
		} else if(a > 21 && a < 100) {
				System.out.println("===== Choice out of bounds. Please choose again. =====");
				menu3();
		}
	}
	
	public static void menu3b() {
		System.out.println("===== Please Choose Another 2 =====\r\n"
				+ "	[0] American Indian\r\n"
				+ "	[1] Baby Foods\r\n"
				+ "	[2] Baked Foods\r\n"
				+ "	[3] Beans and Lentils\r\n"
				+ "	[4] Beverages\r\n"
				+ "	[5] Breakfast Cereals\r\n"
				+ "	[6] Dairy and Egg Products\r\n"
				+ "	[7] Fast Foods\r\n"
				+ "	[8] Fats and Oils (Dressing)\r\n"
				+ "	[9] Fish\r\n"
				+ "	[10] Fruits\r\n"
				+ "	[l1] Grains and Pasta\r\n"
				+ "	[12] Meats\r\n"
				+ "	[13] Miscellaneous\r\n"
				+ "	[14] Nuts and Seeds\r\n"
				+ "	[15] Prepared Meals\r\n"
				+ "	[16] Restaurant Foods\r\n"
				+ "	[17] Snacks\r\n"
				+ "	[18] Soups and Sauces\r\n"
				+ "	[19] Spices and Herbs\r\n"
				+ "	[20] Sweets\r\n"
				+ "	[21] Vegetables");
		b = sc.nextInt();
		if (a < 0 || a > 100) {
			System.out.println("===== Choice out of bounds. Please choose again. =====");
			menu3b();
	} else if(a > 21 && a < 100) {
			System.out.println("===== Choice out of bounds. Please choose again. =====");
			menu3b();
	} else if (b == a) {
			System.out.println("===== No food group duplicates allowed. Please choose again. =====");
			menu3b();
	}
	}
	
	public static void menu3c() {
		System.out.println("===== Please Choose Last 1 =====\r\n"
				+ "	[0] American Indian\r\n"
				+ "	[1] Baby Foods\r\n"
				+ "	[2] Baked Foods\r\n"
				+ "	[3] Beans and Lentils\r\n"
				+ "	[4] Beverages\r\n"
				+ "	[5] Breakfast Cereals\r\n"
				+ "	[6] Dairy and Egg Products\r\n"
				+ "	[7] Fast Foods\r\n"
				+ "	[8] Fats and Oils (Dressing)\r\n"
				+ "	[9] Fish\r\n"
				+ "	[10] Fruits\r\n"
				+ "	[l1] Grains and Pasta\r\n"
				+ "	[12] Meats\r\n"
				+ "	[13] Miscellaneous\r\n"
				+ "	[14] Nuts and Seeds\r\n"
				+ "	[15] Prepared Meals\r\n"
				+ "	[16] Restaurant Foods\r\n"
				+ "	[17] Snacks\r\n"
				+ "	[18] Soups and Sauces\r\n"
				+ "	[19] Spices and Herbs\r\n"
				+ "	[20] Sweets\r\n"
				+ "	[21] Vegetables");
		c = sc.nextInt();
		if (a < 0 || a > 100) {
			System.out.println("===== Choice out of bounds. Please choose again. =====");
			menu3c();
	} else if(a > 21 && a < 100) {
			System.out.println("===== Choice out of bounds. Please choose again. =====");
			menu3c();
	} else if (c == a || c == b) {
		System.out.println("===== No food group duplicates allowed. Please choose again. =====");
		menu3c();
	}
}
	
	public static void speedmenu() {
		System.out.println("===== How fast would you like the program to be? =====\r\n"
				+ "[1] Very fast (Very low food variability)\r\n"
				+ "[2] Fast (Low food variability)\r\n"
				+ "[3] Medium (Medium food variability)\r\n"
				+ "[4] Slow (High food variability)\r\n");
		int d = sc.nextInt();
		if(d == 1) {
			speed = 50;
		} else if(d == 2) {
			speed = 100;
		} else if(d == 3) {
			speed = 150;
		} else if(d == 4) {
			speed = 200;
		} else {
			System.out.println("===== Choice out of bounds. Please choose again. =====");
			speedmenu();
		}
		
	}
}
