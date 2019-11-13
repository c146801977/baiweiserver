package com.wollo.baiweiserver.controller.food;

public class test {
    public static void main(String[] args) {
        System.out.println(mai(100));
    }

    public static int mai(int money){
        int gai = 0;
        int kong = 0;
        int count = 0;
        count = money/2;
        gai =money/2;
        kong =money/2;
        while (gai>=4 || kong >=2){
            if(gai >= 4){
                int i = gai / 4;
                count += i;
                gai -= i * 3;
                kong += i;
            }
            if(kong >= 2){
                int j = kong / 2;
                count += j;
                kong -= j;
                gai += j;
            }
        }
        return count;
    }
}
