import java.util.Random;

public class TestRandom {

   static Random random = new Random();

    public static void main(String[] args){

        for (int i = 0; i <20 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    int i = random.nextInt(4)%(8-4+1);
                    System.out.println(i);
                }

            }).start();
        }



    }
}
