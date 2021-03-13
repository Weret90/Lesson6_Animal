public class AnimalsApp {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька");
        Animal cat2 = new Cat("Пушок");
        Animal dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Каштанка");
        getCount();
        cat1.run(100);
        cat1.swim(20);
        cat2.run(300);
        dog1.run(400);
        dog2.run(700);
        dog1.swim(5);
        dog2.swim(-6);
    }

    public static void getCount() {
        System.out.println("Создано собак и кошек " + (Dog.getCount() + Cat.getCount()) + " экземпляра(-ов)");
    }
}

