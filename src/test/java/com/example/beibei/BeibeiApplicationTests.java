package com.example.beibei;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class BeibeiApplicationTests {

    @Test
    public void contextLoads() {
        int[] aa=new int[1000];
        for(int i=0;i<1000;i++){

            int j = RandomUtils.nextInt(1, 10000);
            aa[i]=j;
        }
        System.out.println(Arrays.toString(aa));

    }



}
