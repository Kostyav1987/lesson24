package by.overone.lesson24;

public class Fruit {
    public static void main(String[] args) throws Exception {
        Fruit fruit = new Fruit();
//        fruit.method();
//        Pip pip = fruit.new Pip();
//        pip.getAmount();
        System.out.println(Fruit.Pip.amount);
    }
//    public void method() {
//        Pip pip = new Pip();
//        pip.getAmount();
//        System.out.println(pip.amount);
//    }

    class Pip {
        private final static int amount = 20;

//        void getAmount() {
//            System.out.println(amount);
        }


    }




