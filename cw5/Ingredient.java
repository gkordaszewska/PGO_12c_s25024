package g12c.cw5;

public class Ingredient {

    protected String name;
    protected int baseReagent;

    public Ingredient(String name, int baseReagent) {
        setName(name);
        setBaseReagent(baseReagent);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Nazwa nie może być pusta");
        } else {
            this.name = name;
        }
    }

    public void setBaseReagent(int baseReagent) {
        if (baseReagent < 0) {
            throw new RuntimeException("Wartość baseReagent nie może być mniejsza od 0");
        } else {
            this.baseReagent = baseReagent;
        }
    }

    public int getReagent() {
        return baseReagent;
    }
}

