package unknown.demo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int y = random.nextInt(20);
        System.out.println(y);
        if(y %2 == 0){
            System.out.println("четное");
        } else System.out.println("нечетное");
    }
}
