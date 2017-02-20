package TemplateMethod;

/**
 * Created by wangwenhui03 on 17/2/20.
 */
public class Client {
    public static void main(String[] args){
        Account account = new MoneyMarketAccount();

        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();

        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
    }
}
