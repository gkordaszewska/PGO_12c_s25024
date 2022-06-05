package g12c.cw5;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {

        private String name;
        private boolean isCreated = false;
        private int power;
        private List<Ingredient> ingredients = new ArrayList<>();
        private Liquid catalyst;

        public Eliksir (String name) {
            this.name = name;
        }

        public String getName () {
                return name;
        }
        public void setName (String name) {
                if (name.isEmpty()) {
                        throw new RuntimeException("Nazwa nie może być pusta");
                } else {
                        this.name = name;
                }
        }
        public boolean isCreated() {
                return isCreated;
        }

         public int getPower() {
                 if (!isCreated) {
                         throw new RuntimeException("Eliksir nie został utworzony");
                 } else {
                         return power;
                 }
         }

        public void addIngredient(Ingredient i) {
                if (!isCreated) {
                        ingredients.add(i);
                } else {
                        throw new RuntimeException("Eliksir został już utworzony");
                }
        }
        public void removeIngredient(Ingredient i) {
                if (!isCreated) {
                        ingredients.remove(i);
                } else {
                        throw new RuntimeException("Eliksir został już utworzony");
                }
        }

        public Liquid getCatalyst () {
                return catalyst;
         }

        public void setCatalyst (Liquid catalyst) {
                if (!isCreated) {
                        this.catalyst = catalyst;
                } else {
                        throw new RuntimeException("Eliksir został już utworzony");
                }
        }

        public List<Ingredient> getIngredients() {
                return ingredients;
        }

        public void Create () {
                isCreated = true;
                for (Ingredient ingredient: ingredients) {
                    power += ingredient.getReagent();
                }
                power=power/catalyst.getReagent();
                }

    }

