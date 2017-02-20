package ChainOfResponsibility;

/**
 * Created by wangwenhui03 on 17/2/20.
 * 具体处理者角色--项目经理，权限比较小，只能在500以内
 */
public class ProjectManager extends Handler {
    @Override
    public String handleRequest(String user, double fee) {
        String str = "";
        if(fee<500){
            if("张三".equals(user)){
                str="成功:项目经理同意："+user+"的聚餐费用，金额为："+fee+"元";
            }else {
                //其他人一律不同意
                str="失败:项目经理不同意："+user+"的聚餐费用，金额为："+fee+"元";
            }
        }else{
            //超过500元，继续传递给更高级的人处理
            if(getSuccessor()!=null){
                return getSuccessor().handleRequest(user,fee);
            }
        }
        return str;
    }
}
