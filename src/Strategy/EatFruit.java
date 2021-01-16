package Strategy;
public class EatFruit {
    public static void main(String[] args) {
        Fruit eatApple;
        eatApple = new Apple();
        eatApple.eat();
        Fruit eatBanana;
        eatBanana = new Banana();
        eatBanana.eat();
        Fruit eatWatermelon;
        eatWatermelon = new Watermelon();
        eatWatermelon.eat();
    }
}
