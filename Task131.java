public class Meal {
    String[] ingredients;

    public Meal(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void showIngredients() {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println();
    }
}

class Afritada extends Meal {
    public Afritada() {
        super(new String[]{"Tomato Sauce","Meat"});
    }
}

class Mechado extends Meal {
    public Mechado() {
        super(new String[]{"Tomato Sauce","Meat","Potatoes & Carrots","Tomato Paste"});
    }
}

class Menudo extends Meal {
    public Menudo() {
        super(new String[]{"Tomato Sauce","Meat","Potatoes & Carrots","Liver Spread","Raisins","Hotdog"});
    }
}

class Caldereta extends Meal {
    public Caldereta() {
        super(new String[]{"Tomato Sauce","Meat","Potatoes & Carrots","Tomato Paste","Liver Spread","Raisins","Hotdog","Cheese"});
    }
}

class Main {
    public static void main(String[] args) {
        Afritada meal1 = new Afritada();
        Mechado meal2 = new Mechado();
        Menudo meal3 = new Menudo();
        Caldereta meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}