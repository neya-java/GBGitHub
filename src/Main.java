public class Main {
    public static void main(String[] args) {

        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Masha", 10);
        cat[1] = new Cat("Dasha", 8);
        cat[2] = new Cat("Vasya", 80);
        Dish dish = new Dish(100, 90);
        /*dish.infoDish();*/

        for(int i = 0; i < cat.length; i++) {
            dish.infoDish();
            cat[i].infoCat();
            if(dish.checkTheRemainingFood(cat[i].appetite)) {
                cat[i].eat(dish);

            } else {
                System.out.println("Кошак " + cat[i].name + " остался голоден. Ему не хватило еды.");
                System.out.println("Сытость: " + cat[i].satiety);
                System.out.println();
                System.out.println("Добавим еды.");
                dish.addFood(100);
                System.out.println("Стало еды: " + dish.food);
            }
        }
        System.out.println("Из миски покушали " + Cat.quantityEat + " кошака.");
    }
}