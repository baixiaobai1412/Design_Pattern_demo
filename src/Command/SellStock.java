package Command;

public class SellStock implements Order {
    private Stock my_txt;

    public SellStock(Stock my_txt){
        this.my_txt = my_txt;
    }

    public void execute() {
        my_txt.sell();
    }
}