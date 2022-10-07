import java.util.Scanner;

public class Calculator {
    private static Scanner read;

    public static void main(String[] args) {
        Scanner scunner = new Scanner(System.in);
        System.out.println("5 - Квадрат(в степени)");
        System.out.println("4 - Сочетание");
        System.out.println("3 - Вычитание");
        System.out.println("2 - Деление");
        System.out.println("1 - Умножение");
        int choose = scunner.nextInt();
        int itog = 0;
        if (choose == 5) {
            System.out.println("Число - ");
            int first = scunner.nextInt();
            System.out.println("Степень - ");
            int second = scunner.nextInt();
            int itog2 = first;
            if(second>0) {
                while (1 < second) {
                    itog2 = itog2 * first;
                    itog = itog2;
                    second = second - 1;
                }
            } else if (second<0) {
                itog2=1;
                while((-1)>second){
                    itog2=itog2/first;
                    itog=itog2;
                    second=second+1;
                }
            }else{
                itog = 1;
            }

            System.out.println("Результат - " + itog);
        }
        if (choose == 4) {
            System.out.println("Первое слагаемое - ");
            int first = scunner.nextInt();
            System.out.println("Второе слагаемое - ");
            int second = scunner.nextInt();
            itog = first + second;
            System.out.println("Сумма - " + itog);
        }
        if (choose == 3) {
            System.out.println("Уменьшаемое - ");
            int first = scunner.nextInt();
            System.out.println("Вычитаемое - ");
            int second = scunner.nextInt();
            itog = first - second;
            System.out.println("Разность - " + itog);
        }
        if (choose == 2) {
            System.out.println("Делимое - ");
            int first = scunner.nextInt();
            System.out.println("Делитель - ");
            int second = scunner.nextInt();
            itog = first / second;
            System.out.println("Частность - " + itog);
        }
        if (choose == 1) {
            System.out.println("Первый множитель - ");
            int first = scunner.nextInt();
            System.out.println("Второй множитель - ");
            int second = scunner.nextInt();
            itog = first / second;
            System.out.println("Произведение - " + itog);
        }


    }
}