public class Main {

    public static void main(String[] args) {
        boolean flag1 = true;
        while (flag1) {
            System.out.println("Выберите тип величины:");
            System.out.println("1. Длина");
            System.out.println("2. Вес");
            System.out.println("3. Выход");
            int sw = ReaderUtil.readInt();
            double num, num2;
            switch (sw) {
                case 1 -> {
                    System.out.println("Выберите нужный перевод:");
                    System.out.println("1. Метры в ярды");
                    System.out.println("2. Ярды в метры");
                    System.out.println("3. Аршины в метры");
                    System.out.println("4. Метры в аршины");
                    System.out.println("5. Ярды в аршины");
                    System.out.println("6. Аршины в ярды");
                    sw = ReaderUtil.readInt();
                    System.out.println("Введите число:");
                    num = ReaderUtil.readDouble();
                    num2 = switch (sw) {
                        case 1 -> AmericanSiSystem.Companion.meterToYard((float) num);
                        case 2 -> AmericanSiSystem.Companion.yardToMeter((float) num);
                        case 3 -> OldrussianSI.arshinToMeter(num);
                        case 4 -> OldrussianSI.meterToArshin(num);
                        case 5 -> AmericanToOldRussian.yardToArshin(num);
                        case 6 -> AmericanToOldRussian.arshinToYard(num);
                        default -> throw new IllegalStateException("Unexpected value: " + sw);
                    };
                    System.out.printf("%.6f", num2);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Выберите нужный перевод:");
                    System.out.println("1. Американский фунт в старорусский фунт");
                    System.out.println("2. Старорусский фунт в американский фунт");
                    System.out.println("3. Старорусский фунт в килограмм");
                    System.out.println("4. Килограмм в старорусский фунт");
                    System.out.println("5. Американский фунт в килограмм");
                    System.out.println("6. Килограмм в американский фунт");
                    sw = ReaderUtil.readInt();
                    System.out.println("Введите число:");
                    num = ReaderUtil.readDouble();
                    num2 = switch (sw) {
                        case 1 -> AmericanToOldRussian.americanPoundToRussianPound(num);
                        case 2 -> AmericanToOldRussian.russianPoundToAmericanPound(num);
                        case 3 -> OldrussianSI.funtToKilogramm(num);
                        case 4 -> OldrussianSI.kilogrammToFunt(num);
                        case 5 -> AmericanSiSystem.Companion.poundToKilogram((float) num);
                        case 6 -> AmericanSiSystem.Companion.kilogramToPound((float) num);
                        default -> throw new IllegalStateException("Unexpected value: " + sw);
                    };
                    System.out.printf("%.6f", num2);
                    System.out.println();
                }
                case 3 -> flag1 = false;
            }
        }
    }

}
