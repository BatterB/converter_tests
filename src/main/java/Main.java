import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag1 = true;
        while (flag1){
            System.out.println("Выберите тип величины:");
            System.out.println("1. Длина");
            System.out.println("2. Вес");
            System.out.println("3. Выход");
            int sw = ReaderUtil.readInt();
            switch (sw){
                case 1:
                    boolean flag2 = true;
                    System.out.println("Выберите нужный перевод:");
                    System.out.println("1. Метры в ярды");
                    System.out.println("2. Ярды в метры");
                    System.out.println("3. Аршины в метры");
                    System.out.println("4. Метры в аршины");
                    System.out.println("5. Ярды в аршины");
                    System.out.println("6. Аршины в ярды");
                    sw = ReaderUtil.readInt();
                    System.out.println("Введите число:");
                    double num = ReaderUtil.readDouble();
                    switch (sw){
                        case 1:
                            AmericanSiSystem.Companion.meterToYard(num);
                            break;
                        case 2:
                            AmericanSiSystem.Companion.yardToMeter(num);
                            break;
                        case 3:
                            OldrussianSI.arshinToMeter(num);
                            break;
                        case 4:
                            OldrussianSI.meterToArshin(num);
                            break;
                        case 5:
                            AmericanToOldRussian.yardToArshin(num);
                            break;
                        case 6:
                            AmericanToOldRussian.arshinToYard(num);
                            break;
                    }
                    break;
                case 2:
                    boolean flag3 = true;
                    System.out.println("Выберите нужный перевод:");
                    System.out.println("1. Американский фунт в старорусский фунт");
                    System.out.println("2. Старорусский фунт в американский фунт");
                    System.out.println("3. Старорусский фунт в килограмм");
                    System.out.println("4. Килограмм в старорусский фунт");
                    System.out.println("5. Американский фунт в килограмм");
                    System.out.println("6. Килограмм в американский фунт");
                    sw = ReaderUtil.readInt();
                    System.out.println("Введите число:");
                    double num1 = ReaderUtil.readDouble();
                    switch (sw){
                        case 1:
                            AmericanToOldRussian.americanPoundToRussianPound(num1);
                            break;
                        case 2:
                            AmericanToOldRussian.russianPoundToAmericanPound(num1);
                            break;
                        case 3:
                            OldrussianSI.funtToKilogramm(num1);
                            break;
                        case 4:
                            OldrussianSI.kilogrammToFunt(num1);
                            break;
                        case 5:
                            AmericanSiSystem.Companion.poundToKilogram(num1);
                            break;
                        case 6:
                            AmericanSiSystem.Companion.kilogramToPound(num1);
                            break;
                    }
                    break;
            }
        }
    }

}
