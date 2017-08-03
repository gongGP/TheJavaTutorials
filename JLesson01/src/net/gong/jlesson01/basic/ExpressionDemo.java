package net.gong.jlesson01.basic;

/**
 * Created by gong on 2017/8/3.
 * 语句：expression statements，declaration statements and control flow statements
 */
public class ExpressionDemo {

    {
        int b = 0;
        int c = 1;
        System.out.println("init ExpressionDemo");
    }

    static {
        System.out.println("static ExpressionDemo");
    }

    public static void main(String[] args) {
        ExpressionDemo demo = new ExpressionDemo();
        ExpressionDemo demo2 = new ExpressionDemo();
//        System.out.println(demo.getExpressValue());
    }

    public int getExpressValue() {
        int a = 0;
        return a = 1;
    }
}
