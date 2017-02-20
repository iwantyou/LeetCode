package TemplateMethod;

/**
 * Created by wangwenhui03 on 17/2/20.
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "CDAccount";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
