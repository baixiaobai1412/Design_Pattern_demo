package Command;

public class BuyStock implements Order {
    private Stock my_txt;

    public BuyStock(Stock my_txt){
        this.my_txt = my_txt;
    }

    public void execute() {
        my_txt.buy();
    }
}