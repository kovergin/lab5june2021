import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст который будет разделен на строки и упорядочен согласно первой букве строки: ");
        String x = in.nextLine();

        System.out.println("Исходный текст: ");
        System.out.println(x);

        System.out.println("Текст построчно с разделением по точке: ");
        String[] sdel = x.split("\\.");

        Arrays.sort(sdel);

        for (String sdels : sdel) {
            System.out.println(sdels);
        }

    }
}
