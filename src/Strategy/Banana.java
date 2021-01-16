package Strategy;

public class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉了，需要先剥下皮");
    }
}