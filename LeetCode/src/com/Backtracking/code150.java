package com.baidu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 直接对后缀表达式进行计算，直接用栈
 * 如果是原始表达式，要先转化成后缀表达式,根据优先级、栈
 * Created by wangwenhui03 on 17/1/10.
 */
public class code150 {
    public static void main(String[] args){
        String[] tokens={"4","13","5","/","+"};
        code150 code =new code150();
        System.out.print(code.evalRPN(tokens));
    }
    public int evalRPN(String[] tokens) {

        Stack<Integer>stack =new Stack<Integer>();
        for(int i=0;i<tokens.length;i++) {
            switch (tokens[i]) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int a=stack.pop();
                    int b=stack.pop();
                    int temp=b/a;
                    stack.push(temp);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));

            }
        }
        return stack.pop();
    }

}
