public class Cat {
    public String name;
    public int appetite;
    static int quantityEat;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void infoCat() {
        System.out.println("Кошака кличут " + name + ". У него аппетит " + appetite + " у.е.");

    }

    public void eat(Dish d) {
        d.decreaseFood(appetite);
        satiety = true;
        quantityEat++;
        System.out.println("Кошак " + name + " с аппетитом " + appetite + " покушал.");
        System.out.println("Сытость: " + satiety);
        System.out.println();
    }
}
