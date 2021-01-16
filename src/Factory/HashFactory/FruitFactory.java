package Factory.HashFactory;

import java.util.HashMap;
import java.util.Map;

public class FruitFactory {
    private static Map<String, String> fruitMap = new HashMap<>();
    static {
        fruitMap.put("apple", "是苹果，可以直接吃");
        fruitMap.put("banana", "吃香蕉了，需要先剥下皮");
        fruitMap.put("watermelon", "吃西瓜了，但是还得弄把水果刀切一下先");
    }
    public static String getFruit(String fruitType) {
        String fruit= fruitMap.get(fruitType);

        if( fruit != null){
            return fruit;
        }else {
            String error= "输入不正确";
            return error;
        }
    }
}
