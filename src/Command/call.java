package Command;

public class call implements Order {
    private Stock my_txt;

    public call(Stock my_txt){
        this.my_txt = my_txt;
    }

    public void execute() {
        my_txt.call();
    }
}
