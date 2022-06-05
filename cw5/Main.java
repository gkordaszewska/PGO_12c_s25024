package g12c.cw5;

public class Main {
    public static void main(String[] args) {

        Liquid l1= new Water("liquid1",3,23,false);
        Liquid l2= new Alcohol("Liquid2",10,30,40);

        Mineral m1 = new Ore("mineral1",15,30,true);
        Mineral m2 = new Crystal("mineral2",15,25,90);

        Plant p1 = new Flower("plant1",27,13);
        Plant p2 = new Root("plant2",60,50);

        Eliksir eliksir1 = new Eliksir("Eliksir1");
        eliksir1.setCatalyst(l2);
        eliksir1.addIngredient(l1);
        eliksir1.addIngredient(m2);
        eliksir1.removeIngredient (m2);
        eliksir1.addIngredient(m1);
        eliksir1.addIngredient(p1);
        eliksir1.removeIngredient (p1);
        eliksir1.addIngredient(p2);

        eliksir1.Create();
        System.out.println(eliksir1.getPower());

    }
}

