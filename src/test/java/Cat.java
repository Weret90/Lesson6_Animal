public class Cat extends Animal {
    protected static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 200) {
            System.out.printf("%s не может пробежать 200 и более м.\n", name);
        } else if (distance < 0) {
            System.out.printf("%s не может пробежать отрицательное расстояние\n", name);
        } else {
            System.out.printf("%s пробежал %d м.\n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", name);
    }

    public static int getCount() {
        return count;
    }
}
