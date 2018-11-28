

import org.junit.Test;

import java.util.Random;

public class TestRandom {

   static Random random = new Random();

    public static void mains(String[] args){

        for (int i = 0; i <20 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    int i = random.nextInt(4)%(8-4+1);
                    System.out.println(i);
                }

            }).start();
        }



    }
    @Test
    public    void  TestHans(){
        int i = 2;
        System.out.println(1+(i<<2));
    }
}
