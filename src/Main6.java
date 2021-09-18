import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner s = new Scanner(System.in);
        switch (s.next().charAt(0)) {
            case '1':
                System.out.println("Выберите единицу измерения: 1 - килограммы, 2 - английский фунт, 3 - унция, 4 - тонна");
                switch (s.next().charAt(0)) {
                    case '1':
                        System.out.println("Введите число");
                        double kg = s.nextDouble();
                        System.out.println("Килограмм: " + kg);
                        System.out.println("Фунт: " + (kg * 2.2));
                        System.out.println("Унция: " + (kg * 35.27));
                        System.out.println("Тонна: " + (kg * 0.001));
                        break;
                    case '2':
                        System.out.println("Введите число");
                        double af = s.nextDouble();
                        System.out.println("Килограмм: " + (af * 0.45));
                        System.out.println("Фунт: " + af);
                        System.out.println("Унция: " + (af * 16));
                        System.out.println("Тонна: " + (af * 0.00045));
                        break;
                    case '3':
                        System.out.println("Введите число");
                        double oz = s.nextDouble();
                        System.out.println("Килограмм: " + (oz * 0.028));
                        System.out.println("Фунт: " + (oz * 0.063));
                        System.out.println("Унция: " + oz);
                        System.out.println("Тонна: " + (oz * 0.000028));
                        break;
                    case '4':
                        System.out.println("Введите число");
                        double tt = s.nextDouble();
                        System.out.println("Килограмм: " + (tt * 1000));
                        System.out.println("Фунт: " + (tt * 2204.62));
                        System.out.println("Унция: " + (tt * 35273.96));
                        System.out.println("Тонна: " + tt);
                        break;
                }
                break;
            case '2':
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                switch (s.next().charAt(0)) {
                    case '1':
                        System.out.println("Введите число");
                        double mr = s.nextDouble();
                        System.out.println("Метры: " + mr);
                        System.out.println("Мили: " + (mr * 0.00062));
                        System.out.println("Ярды: " + (mr * 1.094));
                        System.out.println("Футы: " + (mr * 3.28));
                        break;
                    case '2':
                        System.out.println("Введите число");
                        double ml = s.nextDouble();
                        System.out.println("Метры: " + (ml * 1609.34));
                        System.out.println("Мили: " + ml);
                        System.out.println("Ярды: " + (ml * 1760));
                        System.out.println("Футы: " + (ml * 5280));
                        break;
                    case '3':
                        System.out.println("Введите число");
                        double ya = s.nextDouble();
                        System.out.println("Метры: " + (ya * 0.91));
                        System.out.println("Мили: " + (ya * 0.00057));
                        System.out.println("Ярды: " + ya);
                        System.out.println("Футы: " + (ya * 3));
                        break;
                    case '4':
                        System.out.println("Введите число");
                        double ft = s.nextDouble();
                        System.out.println("Метры: " + (ft * 0.3));
                        System.out.println("Мили: " + (ft * 0.00019));
                        System.out.println("Ярды: " + (ft * 0.33));
                        System.out.println("Футы: " + ft);
                        break;
                }
                break;

        }

    }

}
