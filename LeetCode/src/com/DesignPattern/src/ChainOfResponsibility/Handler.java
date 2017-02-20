package ChainOfResponsibility;

/**
 * Created by wangwenhui03 on 17/2/20.
 * 抽象处理者角色类
 */
public abstract class Handler {
    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    /**
     * 取得下一个处理请求的对象
     * @return
     */
    public Handler getSuccessor(){
        return successor;
    }

    /**
     * 设置下一个处理请求的对象
     * @param successor
     */
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    /**
     * 具体的处理逻辑
     * @param user 申请人
     * @param fee  申请的钱数
     * @return     成功或失败的具体通知
     */
    public abstract String handleRequest(String user,double fee);
}
