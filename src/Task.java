import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String text2 = in.nextLine();
        int length = text.length();
        int length2 = text2.length();
        if (length>length2){
            System.out.println("Строка с наибольшей длиной: " + text);
        }
        if (length2>length){
            System.out.println("Строка с наибольшей длиной: " + text2);
        }
        if (length2==length){
            System.out.println("Длина двух строк равна.");
        }
    }
}
