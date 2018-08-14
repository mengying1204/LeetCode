package Java_Study.Synchronized;

public class DrawThread extends Thread {
    private Account account;
    private double drawMoney;

    public DrawThread(String name, Account account, double drawMoney) {
        super(name);
        this.account = account;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run() {
        synchronized (account){
            if (account.getBalance() >= drawMoney){
                System.out.println(getName()+" 取钱成功，取款："+drawMoney);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance()-drawMoney);
                System.out.println("目前账户余额："+account.getBalance());
            }else {
                System.out.println("余额不足！");
            }
        }

    }
}
