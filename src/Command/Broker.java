package Command;

public class Broker {
    public void takeOrder(Order order){
        order.execute();
    }
}
