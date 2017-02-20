package TemplateMethod;

/**
 * Created by wangwenhui03 on 17/2/20.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "MoneyMarketAccount";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
