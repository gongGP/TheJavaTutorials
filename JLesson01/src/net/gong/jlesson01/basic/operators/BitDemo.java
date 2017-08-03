package net.gong.jlesson01.basic.operators;

/**
 * Created by gong on 2017/8/3.
 */
public class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0b0010_1000;
        int val = 0b1101_1010;
        // prints "2"
//        int result = val & bitmask;  // 0000_1000 //都为1,取1
//        int result = val | bitmask;  // 1111_1010 //只要有1，就取1
        int result = val ^ bitmask; // 1111_0010 //不相同,取1

        System.out.println(Integer.toBinaryString(result));
    }
}
