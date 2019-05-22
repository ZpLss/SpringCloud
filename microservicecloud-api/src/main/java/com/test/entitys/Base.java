package com.test.entitys;

/**
 * Created by liwk
 * Date:2018/9/18 8:59
 */
public class Base {
    private String baseName = "base";
    public Base(){
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }

    static class Sub extends Base{
        private String baseName = "sub";
        public void callName(){
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        //Base b = new Sub();


        int x = 0;
        int y = 0;
        int k = 0;

        for(int z = 0; z < 5; z++){
            if((++x > 2) && (++y > 2) && (k++ > 2)){
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + " " + y + " " + k);
    }
}
