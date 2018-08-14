package Java_Study.Synchronized;

public class TestDrawMoney {
    public static void main(String[] args) {
        Account account = new Account("110",5000);
        new DrawThread("蝈蝈",account,3000).start();
        new DrawThread("小猴子",account,3000).start();
    }
}
