package Strategy;

public class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("是苹果，可以直接吃");
    }
}