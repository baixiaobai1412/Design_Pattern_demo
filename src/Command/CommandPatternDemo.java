package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock my_txt = new Stock();

        BuyStock buyStockOrder = new BuyStock(my_txt);
        SellStock sellStockOrder = new SellStock(my_txt);
        call callOrder = new call(my_txt);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(callOrder);
    }
}
