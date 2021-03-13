public class Dog extends Animal {
    protected static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 500) {
            System.out.printf("%s не может пробежать 500 и более м.\n", name);
        } else if (distance < 0) {
            System.out.printf("%s не может пробежать отрицательное расстояние\n", name);
        } else {
            System.out.printf("%s пробежал %d м.\n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 10) {
            System.out.printf("%s не может проплыть 10 и более м.\n", name);
        } else if (distance < 0) {
            System.out.printf("%s не может проплыть отрицательное расстояние\n", name);
        } else {
            System.out.printf("%s проплыл %d м.\n", name, distance);
        }
    }

    public static int getCount() {
        return count;
    }
}
