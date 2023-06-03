import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String walking;

        walking = firstMethod(18, 28);
        System.out.println("Первый случай: " + walking);

        walking = firstMethod(25,33);
        System.out.println("Второй случай: " + walking);

        walking = firstMethod(56,21);
        System.out.println("Третий случай: " + walking);

        walking = firstMethod(10,-2);
        System.out.println("Четвертый случай: " + walking);

        walking = firstMethod(45,9);
        System.out.println("Пятый случай: " + walking);


        walking = firstMethod(generateRandomAge(), 14);
        System.out.println(walking);

    }

    public static String firstMethod(int age, int temperature) {

        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
    Random random = new Random();
    return random.nextInt(100+1);
    }
}