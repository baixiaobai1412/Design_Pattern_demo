package Factory.FactoryIF;

import java.util.Scanner;

public class EatFruit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //选择的水果种类
        String fruitType = scanner.nextLine();
        String fruit = FruitFactory.getFruit(fruitType);
        System.out.print(fruit);
    }
}
