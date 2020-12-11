
public class StatsService {

    public static void main(String[] args) {
        int salesArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // массив с данными о количестве продаж
        int sum = 0; //сумма всех продаж
        for (int i = 0; i < salesArray.length; i++) {
            sum = sum + salesArray[i];
        }
        System.out.println("Общее число продаж: "+sum);
        System.out.println("Среднее число продаж: " + sum / salesArray.length);

        int maxValue = salesArray[0];
        System.out.println("Минимальное число продаж: "+maxValue);

        int minValue = salesArray[0];
        System.out.println("Минимальное число продаж: "+minValue);

        }

    }



