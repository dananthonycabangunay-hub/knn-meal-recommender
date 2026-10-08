# Meal Recommender System Using K-Nearest Neighbors

I worked on this project with Alec Bradley P. Matanguihan during the Samsung SPARK11 Algorithm Research Internship, in partnership with Samsung R&D Philippines, from February to June 2024.

We built a Java program that recommends combinations of three food items based on calorie and macronutrient targets. The idea was to find meals close to a user's preferred protein, carbohydrate, and fat intake using the nutritional data available in our dataset.

## How it works

The program runs through a menu in the terminal. A user can choose:

- A fixed or randomly sampled set of food items
- Three food groups and a calorie range
- A preset meal ratio or custom macronutrient targets
- The number of recommendations to display
- A sampling size that trades food variety for shorter running time

The four presets are the ideal meal, low-fat, low-carb, and high-protein ratios used in our study.

The program generates three-item combinations, filters them by calorie range, and calculates their Euclidean distance from the target protein, carbohydrate, and fat values. It sorts the combinations by distance and returns the closest options. This is the nearest-neighbor approach we used for the recommendations.

## Original project results

The full dataset used in the study contained 14,165 food items. For the evaluation, we sampled 150 items from each of three food groups and generated 400 recommendations across the four presets.

Our original evaluation recorded:

- **0.8256% mean percent error**, approximately 0.83%
- **6.75 seconds average running time**

The error measures how close the recommended macronutrient totals were to the requested targets. These figures are from the original experiments; runtime will depend on the computer and sampling settings.

We presented the project to Samsung R&D Philippines, and it won first place in the Samsung SPARK11 idea contest.

## Files

```text
src/
  FoodReco.java       Main program, menus, and recommendation logic
  oop/Food.java      Food records and comparison logic
  *.csv              Food data grouped by category
```

The code uses Java's standard libraries and reads the food data from CSV files.

## Running the program

1. Download the repository and install a Java Development Kit (JDK).
2. Open `src/FoodReco.java`. The `filepathlist` entries near the start of `main` still point to CSV locations on the original computer. Change them to the matching CSV paths on your computer, keeping the food groups in the same order.
3. Open a terminal in the `src` folder and run:

```sh
javac FoodReco.java oop/Food.java
java FoodReco
```

4. Follow the menu prompts to choose food groups, a calorie range, and your target meal ratio.

## Notes

This repository contains the original source code and food CSVs. The manuscript and test logs are not included here.

Recommendations are based on the nutritional variables in the dataset. Food allergies, medical conditions, price, and individual dietary requirements are outside the scope of this version.

**Authors:** Dan Anthony G. Cabangunay and Alec Bradley P. Matanguihan  
**Capstone adviser:** John Cedric C. Gaza  
**School:** University of the Philippines Rural High School
