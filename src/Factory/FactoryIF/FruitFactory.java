package Factory.FactoryIF;

public class FruitFactory {
    public static String getFruit(String fruitType) {
        String result;
        if ("apple".equals(fruitType)) {
            result = "是苹果，可以直接吃";
        } else if ("banana".equals(fruitType)) {
            result = "吃香蕉了，需要先剥下皮";
        } else if ("watermelon".equals(fruitType)) {
            result = "吃西瓜了，但是还得弄把水果刀切一下先";
        }else {
            result= "输入不正确";
        }
        return result;
    }
}
