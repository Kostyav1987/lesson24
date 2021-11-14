package by.overone.lesson24;

public class Fruit1 {
    private static int amount = 20;

    public static void main(String[] args) throws Exception {
        Pip1 pip1 = new Pip1();
        pip1.getAmount();
    }

    static class Pip1 {
        public static void getAmount() {
            System.out.println("amount = " + amount);

        }
    }
}

    class Fruit2 {
        public static void main(String[] args) {
            Fruit1.Pip1.getAmount();
        }

}
