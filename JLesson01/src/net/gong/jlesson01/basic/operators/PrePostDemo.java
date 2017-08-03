package net.gong.jlesson01.basic.operators;

/**
 * Created by gong on 2017/8/3.
 */
public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);

        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);

        // prints 7
        System.out.println(i);
    }
}
