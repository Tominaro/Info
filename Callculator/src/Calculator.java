import java.util.Scanner;

public class Calculator {
    private static Scanner read;

    public static void main(String[] args) {
        Scanner scunner = new Scanner(System.in);
        System.out.println("5 - Квадратичное уравнение");
        System.out.println("4 - Сочетание");
        System.out.println("3 - Вычитание");
        System.out.println("2 - Деление");
        System.out.println("1 - Умножение");
        int choose = scunner.nextInt();
        int itog = 0;
        if (choose == 5) {
            int numA;
            System.out.println("Число C - ");
            int first = scunner.nextInt();
            System.out.println("Число B - ");
            int second = scunner.nextInt();
            System.out.println("Число A - ");
            int numA = scunner.nextInt();
            int numDiv = (second*second) - (numA*first);
            if (numDiv<0){
                System.out.println("Корней нет");
            }else if(numDiv==0){
                itog = ((-1)*second)/(numA*2);
                System.out.println("X= "+itog);
            }else{
                itog=(((-1)*second)+ math.sqrt(numDiv))/(first*2);
                int itog2=(((-1)*second)- math.sqrt(numDiv))/(first*2);
                System.out.println("x2 = "+itog2);
            }
            }

            System.out.println("x = " + itog);
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
