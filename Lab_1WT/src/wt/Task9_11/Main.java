package wt.Task9_11;

public class Main {
    public static void main(String[] args) {
        final Basket basket = new Basket();
        basket.addBall(new Ball(Color.Blue, 5.0F));
        basket.addBall(new Ball(Color.Yellow, 7.0F));
        basket.addBall(new Ball(Color.Red, 9.0F));
        basket.addBall(new Ball(Color.Violet, 10.5F));
        basket.addBall(new Ball(Color.Red, 10.5F));
        basket.addBall(new Ball(Color.Blue, 14.5F));
        basket.addBall(new Ball(Color.Blue, 19.5F));
        basket.addBall(new Ball(Color.Blue, 29.5F));

        System.out.println("Overall weight: " + basket.getOverallWeight());
        System.out.println("Overall weight: " + basket.getBlueBallsCount());
    }
}

//lab10
//javac D:\5Sem\Lab_1WT\src\\wt.Task9-11\Ball.java D:\5Sem\Lab_1WT\src\\wt.Task9-11\Basket.java D:\5Sem\Lab_1WT\src\\wt.Task9-11\Color.java D:\5Sem\Lab_1WT\src\\wt.Task9-11\Main.java
//java -classpath D:\5Sem\Lab_1WT\src\\wt.Task9-11\Main


// lab 11
//javac -d out src/main/java/com/wt/*.java
//cd out
//jar cfe main.jar com.wt.Main com/wt/*.class
//java -jar main.jar
