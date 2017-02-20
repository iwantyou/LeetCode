package TemplateMethod;

/**
 * Created by wangwenhui03 on 17/2/20.
 * 模板方法 ---jiang
 */
public abstract class Account {
    /**
     * 模板方法，定义了计算利息的步骤
     * @return
     */
    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amout = calculateAmount(accountType);
        return amout*interestRate;
    }
    /**
     * 还可以设置钩子方法，方法置空，子类可以动态扩展
     */
    public void doHook(){};
    /**
     * 基本方法，留给子类实现
     * @return
     */
    protected abstract String doCalculateAccountType();

    /**
     * 基本方法，留给子类实现
     * @return
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法，已经实现
     * @param accountType
     * @return
     */
    private double calculateAmount(String accountType){
        /**
         * 省略相关的业务逻辑
         */
        if(accountType.equals("MoneyMarketAccount")) return 1234.00;
        else  return 7243.00;
    }

}
